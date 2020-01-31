package com.rohman.learnlibrary

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import com.rohman.toastlibrary.ToastUtils

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        ToastUtils.showToast(this,"Hello Amdroid")
    }
}
