package com.sunilkumar.toasterlibrary

import android.graphics.Color
import android.graphics.drawable.ColorDrawable
import android.os.Bundle
import android.util.TypedValue
import android.view.Gravity
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.view.Window
import android.view.WindowManager
import android.widget.TextView
import androidx.cardview.widget.CardView
import androidx.fragment.app.DialogFragment
import androidx.fragment.app.FragmentManager
import kotlinx.coroutines.CoroutineScope
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.delay
import kotlinx.coroutines.flow.asFlow
import kotlinx.coroutines.flow.onEach
import kotlinx.coroutines.launch

class ToastDialog : DialogFragment() {

    private var title: String? = null
    private var message: String? = null
    private var cornerRadius = 32f

    companion object {
        const val TITLE = "title"
        const val MESSAGE = "message"
    }

    fun newInstance(title: String = "", message: String): ToastDialog {
        val args = Bundle()
        args.putString(TITLE, title)
        args.putString(MESSAGE, message)
        val fragment = ToastDialog()
        fragment.arguments = args
        return fragment
    }

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        dialog?.requestWindowFeature(Window.FEATURE_NO_TITLE)
        dialog?.window?.setBackgroundDrawable(ColorDrawable(Color.TRANSPARENT))
        return inflater.inflate(R.layout.layout_toast, container, false)
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        cornerRadius = TypedValue.applyDimension(
            TypedValue.COMPLEX_UNIT_DIP,
            cornerRadius,
            context?.resources?.displayMetrics
        )
        setUpView(view)
        setUpTimer()
    }

    private fun setUpTimer() {
        CoroutineScope(Dispatchers.IO).launch {
            val timer = (0..Int.MAX_VALUE)
                .asSequence()
                .asFlow()
                .onEach { delay(2500) }
            timer.collect {
                dialog?.dismiss()
            }
        }
    }

    private fun setUpView(view: View) {
        arguments.apply {
            title = this?.getString(TITLE)
            message = this?.getString(MESSAGE)
        }

        val tvTitle = view.findViewById<TextView>(R.id.title)
        val tvMessage = view.findViewById<TextView>(R.id.message)
        val cvToast = view.findViewById<CardView>(R.id.cv_toast)
        cvToast.radius = cornerRadius

        if (title?.isNotBlank() == true) {
            tvTitle.text = title
        } else {
            tvTitle.visibility = View.GONE
        }
        tvMessage.text = message
    }

    override fun onStart() {
        super.onStart()
        val dialog = dialog
        dialog?.let {
            val width = ViewGroup.LayoutParams.WRAP_CONTENT
            val height = ViewGroup.LayoutParams.WRAP_CONTENT
            dialog.window?.apply {
                setLayout(width, height)
                clearFlags(WindowManager.LayoutParams.FLAG_DIM_BEHIND)
                setGravity(Gravity.BOTTOM)
            }
        }
    }

}