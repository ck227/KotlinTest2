package com.ck.kotlintest

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.TextView

class BaseActivity : AppCompatActivity() {

    var titleName: TextView? = null

    fun back(view: View) {
        finish()
    }
}
