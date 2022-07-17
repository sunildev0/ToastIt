package com.sunilk9211.toastit

import androidx.fragment.app.FragmentManager

class ToastIt {
    companion object {

        fun normal(fragmentManager: FragmentManager?, message: String?) {
            if (message != null) {
                fragmentManager?.let {
                    ToastDialog()
                        .newInstance(message = message)
                        .show(it, "")
                }
            }
        }

        fun normal(fragmentManager: FragmentManager?, title: String?, message: String?) {
            if (title != null && message != null) {
                fragmentManager?.let {
                    ToastDialog()
                        .newInstance(title = title, message = message)
                        .show(it, "")
                }
            }
        }
    }
}