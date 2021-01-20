package com.mohsinali.apputils

import android.text.TextUtils
import android.view.View
import android.widget.TextView

object AppUtils {
    fun isEmpty(textView: TextView, stringValue: String) {
        textView.text = if (!TextUtils.isEmpty(stringValue)) stringValue else ""
        textView.visibility = if (!TextUtils.isEmpty(stringValue)) View.VISIBLE else View.GONE
    }
}