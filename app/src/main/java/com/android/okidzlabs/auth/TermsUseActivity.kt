package com.android.okidzlabs.auth

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.android.okidzlabs.R
import com.android.okidzlabs.databinding.ActivityTermsUseBinding

class TermsUseActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        val binding = ActivityTermsUseBinding.inflate(layoutInflater)
        setContentView(binding.root)

        supportActionBar?.setDisplayHomeAsUpEnabled(true)

//      TODO:  for now dummy text, later original text
        binding.textViewTitle.text = resources.getString(R.string.app_name)
        binding.textView.text = resources.getString(R.string.terms_and_use)
    }
}