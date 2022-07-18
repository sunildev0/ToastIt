package com.sunilkumar.toastproject

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import com.sunilk9211.toastit.ToastIt

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        ToastIt.normal(
            supportFragmentManager,
            "This is your toast message"
        )
    }
}