package com.android.okidzlabs.auth

import android.content.Intent
import android.opengl.Visibility
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import com.android.okidzlabs.R
import com.android.okidzlabs.databinding.ActivityUpdateNewPasswordBinding

class UpdateNewPasswordActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        val binding = ActivityUpdateNewPasswordBinding.inflate(layoutInflater)
        setContentView(binding.root)

        binding.updatePassword.setOnClickListener {
//            do the required task with backend api

            binding.updatePassword.visibility = View.GONE
            binding.password.visibility = View.GONE
            binding.updatedPasswordView.visibility = View.VISIBLE
            binding.loginButton.visibility = View.VISIBLE
        }

        binding.loginButton.setOnClickListener {
            val intent = Intent(this, LoginActivity::class.java)
            startActivity(intent)
            finish()
        }
    }
}