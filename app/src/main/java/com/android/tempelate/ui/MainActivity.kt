package com.android.tempelate.ui

import android.content.Intent
import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import androidx.databinding.DataBindingUtil
import com.android.tempelate.R
import com.android.tempelate.databinding.ActivityMainBinding
import com.android.tempelate.ui.singleapi.SingleAPICallActivity

class MainActivity : AppCompatActivity() {

    var dataBinding: ActivityMainBinding? = null
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        dataBinding = DataBindingUtil.setContentView(this, R.layout.activity_main)
        dataBinding?.btnOpenSingleApi?.setOnClickListener {
            startActivity(Intent(this@MainActivity,SingleAPICallActivity::class.java))
        }
    }
}