package com.example.android3lesson7dz.ui.activity

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.android3lesson7dz.R
import dagger.hilt.android.AndroidEntryPoint

@AndroidEntryPoint
class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
    }
}