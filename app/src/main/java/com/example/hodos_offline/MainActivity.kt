package com.example.hodos_offline

import android.app.Activity
import android.content.Intent
import android.content.pm.PackageManager
import android.graphics.Bitmap
import android.net.Uri
import android.os.Bundle
import android.provider.MediaStore
import android.view.Menu
import android.widget.Button
import android.widget.Toast
import androidx.activity.result.contract.ActivityResultContracts
import com.google.android.material.snackbar.Snackbar
import com.google.android.material.navigation.NavigationView
import androidx.navigation.findNavController
import androidx.navigation.ui.AppBarConfiguration
import androidx.navigation.ui.navigateUp
import androidx.navigation.ui.setupActionBarWithNavController
import androidx.navigation.ui.setupWithNavController
import androidx.drawerlayout.widget.DrawerLayout
import androidx.appcompat.app.AppCompatActivity
import androidx.core.app.ActivityCompat
import androidx.core.content.ContextCompat
import com.example.hodos_offline.databinding.ActivityMainBinding
import com.google.android.material.bottomsheet.BottomSheetDialog
import android.Manifest
import android.media.ThumbnailUtils
import com.example.hodos_offline.helper.AIModelHelper
import java.nio.ByteBuffer
import java.nio.ByteOrder
import kotlin.math.log

class MainActivity : AppCompatActivity() {

    private lateinit var appBarConfiguration: AppBarConfiguration
    private lateinit var binding: ActivityMainBinding
    private var modelAiHelper: AIModelHelper? = null




    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        this.modelAiHelper = AIModelHelper(this)

        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

        var predictBtn = binding.root.findViewById<Button>(R.id.predict_button)


        predictBtn.setOnClickListener {
            showBottomSheetDialog()
        }

//        setSupportActionBar(binding.appBarMain.toolbar)

//        binding.appBarMain.fab.setOnClickListener { view ->
//            Snackbar.make(view, "Replace with your own action", Snackbar.LENGTH_LONG)
//                .setAction("Action", null)
//                .setAnchorView(R.id.fab).show()
//        }
        val drawerLayout: DrawerLayout = binding.drawerLayout
        val navView: NavigationView = binding.navView
//        val navController = findNavController(R.id.nav_host_fragment_content_main)
        // Passing each menu ID as a set of Ids because each
        // menu should be considered as top level destinations.
        appBarConfiguration = AppBarConfiguration(
            setOf(
                R.id.nav_home, R.id.nav_gallery, R.id.nav_slideshow
            ), drawerLayout
        )
//        setupActionBarWithNavController(navController, appBarConfiguration)
//        navView.setupWithNavController(navController)
    }

    override fun onCreateOptionsMenu(menu: Menu): Boolean {
        // Inflate the menu; this adds items to the action bar if it is present.
        menuInflater.inflate(R.menu.main, menu)
        return true
    }

//    override fun onSupportNavigateUp(): Boolean {
////        val navController = findNavController(R.id.nav_host_fragment_content_main)
////        return navController.navigateUp(appBarConfiguration) || super.onSupportNavigateUp()
//    }

    private fun showBottomSheetDialog() {
        val bottomSheetView = layoutInflater.inflate(R.layout.bottom_sheet_dialog, null)
        val dialog = BottomSheetDialog(this)
        dialog.setContentView(bottomSheetView)

        val btnGallery = bottomSheetView.findViewById<Button>(R.id.btnChooseFromGallery)
        val btnCamera = bottomSheetView.findViewById<Button>(R.id.btnTakePhoto)

        btnGallery.setOnClickListener {
            requestGalleryPermission()
            dialog.dismiss()
        }

        btnCamera.setOnClickListener {
            requestCameraPermission()
            dialog.dismiss()
        }

        dialog.show()
    }

    private fun requestGalleryPermission() {
        galleryLauncher.launch("image/*")
    }

    private fun requestCameraPermission() {
        if (ContextCompat.checkSelfPermission(this, Manifest.permission.CAMERA)
            != PackageManager.PERMISSION_GRANTED
        ) {
            ActivityCompat.requestPermissions(this, arrayOf(Manifest.permission.CAMERA), 100)
        } else {
            val cameraIntent = Intent(MediaStore.ACTION_IMAGE_CAPTURE)
            cameraLauncher.launch(cameraIntent)
        }
    }

    override fun onRequestPermissionsResult(
        requestCode: Int, permissions: Array<out String>, grantResults: IntArray
    ) {
        super.onRequestPermissionsResult(requestCode, permissions, grantResults)
        if (requestCode == 100) {
            if (grantResults.isNotEmpty() && grantResults[0] == PackageManager.PERMISSION_GRANTED) {
                val cameraIntent = Intent(MediaStore.ACTION_IMAGE_CAPTURE)
                cameraLauncher.launch(cameraIntent)
            } else {
                Toast.makeText(this, "Quyền Camera bị từ chối", Toast.LENGTH_SHORT).show()
            }
        }
    }

    private fun handleCameraPhoto(photo: Bitmap) {
        val result = this.modelAiHelper?.classifyImage(photo)
//        Toast.makeText(this, "Prediction result from camera: ${result?.get(0)}", Toast.LENGTH_SHORT).show()
    }

    private fun handleGalleryImage(uri: Uri) {
        try {
            val bitmap = MediaStore.Images.Media.getBitmap(contentResolver, uri)
            val result = this.modelAiHelper?.classifyImage(bitmap)
//            Toast.makeText(this, "Prediction result: ${result?.get(0)}", Toast.LENGTH_SHORT).show()
        } catch (e: Exception) {
            e.printStackTrace()
            Toast.makeText(this, "Error loading image", Toast.LENGTH_SHORT).show()
        }
    }




    private val cameraLauncher =
        registerForActivityResult(ActivityResultContracts.StartActivityForResult()) { result ->
            if (result.resultCode == Activity.RESULT_OK) {
                val photo: Bitmap = result.data?.extras?.get("data") as Bitmap
                handleCameraPhoto(photo)
            }
        }

    private val galleryLauncher =
        registerForActivityResult(ActivityResultContracts.GetContent()) { uri: Uri? ->
            if (uri != null) {
                handleGalleryImage(uri)
            }
        }

}