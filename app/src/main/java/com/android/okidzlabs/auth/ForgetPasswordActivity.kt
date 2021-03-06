package com.android.okidzlabs.auth

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.text.TextUtils
import android.widget.Toast
import com.android.okidzlabs.databinding.ActivityForgetPasswordBinding

class ForgetPasswordActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        val binding = ActivityForgetPasswordBinding.inflate(layoutInflater)
        setContentView(binding.root)

        binding.getOtpButton.setOnClickListener {

//          TODO: Login ID Checker with REGEX

            if (TextUtils.isEmpty(binding.inputLoginId.text.toString())) {
                Toast.makeText(this, "Please enter a valid Login Id.", Toast.LENGTH_LONG).show()
                return@setOnClickListener
            }

//            TODO: If the Login Id not match with backend, then errorInput Visibility set to VISIBLE

            val intent = Intent(this, EnterOTPActivity::class.java)
            startActivity(intent)
        }
    }
}