package com.example.praktam_2407051024.network

import com.example.praktam_2407051024.model.ActivityItem
import retrofit2.http.GET

interface ApiService {
    @GET("aktivitas.json")
    suspend fun getActivities(): List<ActivityItem>
}