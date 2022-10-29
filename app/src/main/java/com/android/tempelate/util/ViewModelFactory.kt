package com.android.tempelate.util

import androidx.lifecycle.ViewModel
import androidx.lifecycle.ViewModelProvider
import com.android.tempelate.network.ApiCallHelper
import com.android.tempelate.ui.singleapi.SingleAPICallViewModel


class ViewModelFactory(val apiCallHelper: ApiCallHelper) : ViewModelProvider.Factory {
    override fun <T : ViewModel> create(modelClass: Class<T>): T {
        if (modelClass.isAssignableFrom(SingleAPICallViewModel::class.java)) {
            return SingleAPICallViewModel(apiCallHelper) as T
        }
        throw IllegalArgumentException("Unable to construct viewmodel")
    }
}