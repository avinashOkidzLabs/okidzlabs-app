package com.android.okidzlabs.auth

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.android.okidzlabs.R
import com.android.okidzlabs.databinding.ActivityEnterOtpactivityBinding

class EnterOTPActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        val binding = ActivityEnterOtpactivityBinding.inflate(layoutInflater)
        setContentView(binding.root)

        binding.proceedButton.setOnClickListener {
            val intent = Intent(this, UpdateNewPasswordActivity::class.java)
            startActivity(intent)
        }
    }
}