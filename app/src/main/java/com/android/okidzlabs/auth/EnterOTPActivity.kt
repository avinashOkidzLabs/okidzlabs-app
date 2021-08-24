package com.android.okidzlabs.auth

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.text.TextUtils
import android.widget.Toast
import com.android.okidzlabs.databinding.ActivityEnterOtpactivityBinding

class EnterOTPActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        val binding = ActivityEnterOtpactivityBinding.inflate(layoutInflater)
        setContentView(binding.root)

//        TODO: OTP Masking
//        https://stackoverflow.com/questions/38872546/edit-text-for-otp-with-each-letter-in-separate-positions

        binding.proceedButton.setOnClickListener {
            if (TextUtils.isEmpty(binding.inputOTP.text.toString()) || binding.inputOTP.text.toString().length < 6) {
                Toast.makeText(this, "Enter the correct OTP.", Toast.LENGTH_LONG)
                    .show()
                return@setOnClickListener
            }
//          TODO: if the user provide otp is wrong, set visibility of errorInput to VISIBLE
            val intent = Intent(this, UpdateNewPasswordActivity::class.java)
            startActivity(intent)
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