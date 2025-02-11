package com.example.hodos_offline.helper

import android.content.Context
import android.content.res.AssetFileDescriptor
import android.graphics.Bitmap
import android.widget.Toast
import com.example.hodos_offline.model.LstLocation
import org.tensorflow.lite.Interpreter
import java.io.FileInputStream
import java.nio.ByteBuffer
import java.nio.ByteOrder
import java.nio.MappedByteBuffer
import java.nio.channels.FileChannel

class AIModelHelper(private val context: Context) {

    private var interpreterLocation: Interpreter
    private var interpreterFood: Interpreter

    private val foodModelFileName = "food_model.tflite"
    private val locationModelFileName = "location_model.tflite"

    init {
        interpreterLocation = Interpreter(loadModelFile(context, locationModelFileName))
        interpreterFood = Interpreter(loadModelFile(context, foodModelFileName))
    }


    private fun loadModelFile(context: Context, modelPath: String): MappedByteBuffer {
        val assetManager = context.assets
        val fileDescriptor: AssetFileDescriptor = assetManager.openFd(modelPath)
        val inputStream = FileInputStream(fileDescriptor.fileDescriptor)
        val fileChannel: FileChannel = inputStream.channel
        val startOffset = fileDescriptor.startOffset
        val declaredLength = fileDescriptor.declaredLength
        return fileChannel.map(FileChannel.MapMode.READ_ONLY, startOffset, declaredLength)
    }

    fun classifyImage(image: Bitmap?) {
        if (image == null) {
            Toast.makeText(context, "Image is null", Toast.LENGTH_SHORT).show()
            return
        }

        val byteBuffer = preprocessImage(image)

        // Adjusted outputData to match model's output shape (26 classes)
        val outputData = Array(1) { FloatArray(26) }
        interpreterLocation.run(byteBuffer, outputData)

        val confidences = outputData[0]
        var maxPos = 0
        var maxConfidence = 0f

        for (i in confidences.indices) {
            if (confidences[i] > maxConfidence) {
                maxConfidence = confidences[i]
                maxPos = i
            }
        }
        System.out.println(confidences[maxPos])
        System.out.println(maxPos)
//
        val classes = arrayOf(
            "Bao_Tang_Chung_Tich_Chien_Tranh",
            "Bao_Tang_Lich_Su",
            "Bao_Tang_My_Thuat",
            "Bao_Tang_Thanh_Pho",
            "Ben_Nha_Rong",
            "Bitexco",
            "Bui_Vien_Tay",
            "Buu_Dien_TPHCM",
            "Cau_Mong",
            "Cho_Ben_Thanh",
            "Cho_Binh_Tay",
            "Chua_Ba_Thien_Hau",
            "Chua_Buu_Long",
            "Chua_Ngoc_Hoang",
            "Chua_Phap_Hoa",
            "Chua_Vinh_Nghiem",
            "Cot_Co_Thu_Ngu",
            "Dinh_Doc_Lap",
            "Ho_Con_Rua",
            "Landmark_81",
            "Nha_Hat_Thanh_Pho",
            "Nha_Tho_Duc_Ba",
            "Nha_Tho_Giao_Xu_Tan_Dinh",
            "Thao_Cam_Vien",
            "UBND_TPHCM",
            "Extra_Class_1",
            "Extra_Class_2",
            "Unknown",
        )

        if (maxConfidence < 0.35) {
            Toast.makeText(context, "Can't recognize", Toast.LENGTH_SHORT).show()
        } else {
            val label = classes[maxPos]
            val location = LstLocation.fromJson().getLocationByLabel(label)
            println(location?.name)
            Toast.makeText(
                context,
                "Predicted: ${location?.name} (${(maxConfidence * 100).toInt()}%)",
                Toast.LENGTH_SHORT
            ).show()
        }
    }

    private fun preprocessImage(bitmap: Bitmap): ByteBuffer {
        val resizedBitmap = Bitmap.createScaledBitmap(bitmap, 224, 224, true)

        // Allocate a ByteBuffer for 224 * 224 * 3 channels (RGB), 4 bytes per float
        val byteBuffer = ByteBuffer.allocateDirect(224 * 224 * 3 * 4)
        byteBuffer.order(ByteOrder.nativeOrder())

        for (y in 0 until 224) {
            for (x in 0 until 224) {
                val pixel = resizedBitmap.getPixel(x, y)

                // Normalize RGB values to the range [0, 1] and put them into the buffer
                byteBuffer.putFloat((pixel shr 16 and 0xFF) / 255.0f) // Red
                byteBuffer.putFloat((pixel shr 8 and 0xFF) / 255.0f)  // Green
                byteBuffer.putFloat((pixel and 0xFF) / 255.0f)        // Blue
            }
        }

        byteBuffer.rewind() // Reset the buffer's position to the beginning
        return byteBuffer
    }





    fun close() {
        interpreterLocation.close()
    }
}
