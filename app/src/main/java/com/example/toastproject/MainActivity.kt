package com.example.toastproject

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.toasterlibrary.ToastIt

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        ToastIt.toastMessage(this, "How are you dude?")

    }
}