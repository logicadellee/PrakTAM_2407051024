package com.example.praktam_2407051024.model

import android.content.Context

object ActivitySource {
    fun getResourceId(context: Context, imageName: String): Int {
        return context.resources.getIdentifier(imageName, "drawable", context.packageName)
    }
}