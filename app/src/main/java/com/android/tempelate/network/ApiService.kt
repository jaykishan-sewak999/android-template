package com.android.tempelate.network

import com.android.tempelate.model.User
import retrofit2.http.GET

interface ApiService {
    @GET("cricket-players")
    suspend fun getCricketers(): List<User>

}