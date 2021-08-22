package com.example.baseskotlin

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.baseskotlin.others.Variables

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        Variables().showCases()
    }
}