package com.android.okidzlabs.auth

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.text.TextUtils
import android.widget.Toast
import com.android.okidzlabs.R
import com.android.okidzlabs.databinding.ActivitySignupBinding
import com.android.okidzlabs.databinding.ActivitySignupOtpBinding

class SignupOtpActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        val binding = ActivitySignupOtpBinding.inflate(layoutInflater)
        setContentView(binding.root)


        binding.verifyButton.setOnClickListener {
            if (TextUtils.isEmpty(binding.inputOTP.text.toString()) || binding.inputOTP.text.toString().length < 6) {
                Toast.makeText(this, "Enter the correct OTP.", Toast.LENGTH_LONG)
                    .show()
                return@setOnClickListener
            }
//          TODO: if the user provide otp is wrong, set visibility of errorInput to VISIBLE

        }

        binding.resendOTPButton.setOnClickListener {
//            TODO: Resend OTP functionality
            Toast.makeText(
                this,
                "OTP has been sent to your registered Login Id.",
                Toast.LENGTH_LONG
            ).show()
        }
    }
}