package com.android.tempelate.network

import com.android.tempelate.model.User

class APICallHelperImp(private val apiService: ApiService) : ApiCallHelper {
    override suspend fun getCricketers() = apiService.getCricketers()
}