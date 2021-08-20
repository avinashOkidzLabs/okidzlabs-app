package com.android.okidzlabs

import android.content.Intent
import android.graphics.drawable.AnimationDrawable
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.os.Handler
import android.view.WindowManager
import androidx.constraintlayout.widget.ConstraintLayout

@Suppress("DEPRECATION")
class SplashScreen : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_splash_screen)

        val constraintLayout = findViewById<ConstraintLayout>(R.id.constraintLayout)
        val animDrawable = constraintLayout.background as AnimationDrawable

        animDrawable.setEnterFadeDuration(500)
        animDrawable.setExitFadeDuration(1500)
        animDrawable.start()

        window.setFlags(
            WindowManager.LayoutParams.FLAG_FULLSCREEN,
            WindowManager.LayoutParams.FLAG_FULLSCREEN
        )

        Handler().postDelayed({
            val intent = Intent(this, MainActivity::class.java)
            startActivity(intent)
//            overridePendingTransition(R.anim.slide_up_out, R.anim.slide_in_up)
            finish()
        }, 3000)

    }
}