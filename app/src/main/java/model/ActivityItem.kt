package com.example.praktam_2407051024.model

import com.google.gson.annotations.SerializedName

data class ActivityItem(
    @SerializedName("nama") val nama: String,
    @SerializedName("deskripsi") val deskripsi: String,
    @SerializedName("waktu") val waktu: String,
    @SerializedName("image_name") val imageName: String
)