package com.example.toasterlibrary

import android.content.Context
import android.widget.Toast

class ToastIt {
    companion object {
        fun toastMessage(context: Context, message: String) {
            Toast.makeText(context, message, Toast.LENGTH_SHORT).show()
        }
    }
}