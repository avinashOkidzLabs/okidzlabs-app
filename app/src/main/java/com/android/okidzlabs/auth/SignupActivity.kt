package com.android.okidzlabs.auth

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.text.TextUtils
import android.widget.ArrayAdapter
import android.widget.Toast
import com.android.okidzlabs.R
import com.android.okidzlabs.databinding.ActivitySignupBinding

class SignupActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        val binding = ActivitySignupBinding.inflate(layoutInflater)
        setContentView(binding.root)

        val dropdownItems = resources.getStringArray(R.array.menu_in_signup)
        binding.autoCompleteTextViewDropDown.setText("Parent", false)

        val arrayAdapter = ArrayAdapter(this, R.layout.signup_dropdown_item, dropdownItems)
        binding.autoCompleteTextViewDropDown.setAdapter(arrayAdapter)

        binding.signupButton.setOnClickListener {
            if (TextUtils.isEmpty(binding.inputLoginId.text.toString()) ||
                TextUtils.isEmpty(binding.inputPassword.text.toString()) ||
                TextUtils.isEmpty(binding.confirmInputPassword.text.toString())
            ) {
                Toast.makeText(this, "Login Id or Password is wrong!", Toast.LENGTH_LONG).show()
                return@setOnClickListener
            }

            if (TextUtils.isEmpty(binding.uniqueUserName.text.toString())) {
//                TODO: Check userName exist in database or not!
                Toast.makeText(this, "Enter a valid user name", Toast.LENGTH_LONG).show()
                return@setOnClickListener
            }

            if (binding.inputPassword.text.toString() != binding.confirmInputPassword.text.toString()) {
                Toast.makeText(this, "Password Mismatch.", Toast.LENGTH_LONG).show()
                return@setOnClickListener
            }

            if (!binding.termsAndUse.isChecked) {
                Toast.makeText(this, "Please! Check the Terms and use.", Toast.LENGTH_LONG)
                    .show()
                return@setOnClickListener
            }
//             TODO:   Move to Next Intent by all the data to the backend
            val intent = Intent(this, SignupOtpActivity::class.java)
            startActivity(intent)
        }

        binding.termsAndUse.setOnClickListener {
            val intent = Intent(this, TermsUseActivity::class.java)
            startActivity(intent)
        }
    }
}
