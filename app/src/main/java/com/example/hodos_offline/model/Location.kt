package com.example.hodos_offline.model

class Location(
    val id: String,
    val createdAt: String = "",
    val createdBy: String? = null,
    val createdByName: String? = null,
    val updatedAt: String? = null,
    val updatedBy: String? = null,
    val deleteBy: String? = null,
    val isDeleted: Boolean = false,
    val name: String = "",
    val address: String = "",
    val description: String = "",
    val label: String? = null,
    val lstImgs: List<String> = emptyList(),
    val coordinates: String = "",
    val type: String = "",
    val img: String = ""
) {

    fun printDetail() {
        println(this.id);
    }

}
