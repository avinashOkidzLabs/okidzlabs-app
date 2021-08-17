package com.android.okidzlabs

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.android.okidzlabs.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        val binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

        binding.textView.text = "OkidzLabs"
    }
}