package com.android.okidzlabs.auth

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.text.TextUtils
import android.widget.Toast
import com.android.okidzlabs.R
import com.android.okidzlabs.databinding.ActivityLoginBinding

class LoginActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        val binding = ActivityLoginBinding.inflate(layoutInflater)
        setContentView(binding.root)

        binding.forgotPassword.setOnClickListener {
            val intent = Intent(this, ForgetPasswordActivity::class.java)
            startActivity(intent)
        }

        binding.loginButton.setOnClickListener {
//            email field checking
            if (TextUtils.isEmpty(binding.inputLoginId.text.toString())) {
                Toast.makeText(this, "Please enter valid the Login Id.", Toast.LENGTH_LONG).show()
                return@setOnClickListener
            }
//            password field checking
            if (TextUtils.isEmpty(binding.inputPassword.text.toString())) {
                Toast.makeText(this, "Please enter the correct password.", Toast.LENGTH_LONG).show()
                return@setOnClickListener
            }

//            TODO : if the password doesn't match with the backend, errorInput visibility should be VISIBLE
//            send the user to home activity.
            Toast.makeText(this, "Great You are Logged In", Toast.LENGTH_LONG).show()
        }
    }
}