package com.example.praktam_2407051024.model
import androidx.annotation.DrawableRes

data class ActivityItem(
    val nama: String,
    val deskripsi: String,
    val waktu: String,
    @DrawableRes val imageRes: Int
)
