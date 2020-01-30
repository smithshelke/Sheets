package com.smith.sheets

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import com.smith.sheets.util.setInsetsToContentPadding
import com.smith.sheets.util.setInsetsToHeight
import com.smith.sheets.util.setInsetsToMargins
import kotlinx.android.synthetic.main.activity_content.*
import kotlinx.android.synthetic.main.layout_main_toolbar.*

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        setupInsets()
    }

    private fun setupInsets() {
        toolbar.setInsetsToHeight(top = true)
        toolbar.setInsetsToContentPadding(top = true)
        fab.setInsetsToMargins(bottom = true)
    }
}