package com.example.kotlin_codelab.view.activity

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.kotlin_codelab.R

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
    }
}