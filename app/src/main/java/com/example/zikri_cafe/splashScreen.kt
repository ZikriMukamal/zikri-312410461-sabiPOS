package com.example.zikri_cafe

import android.content.Intent
import android.os.Bundle
import android.os.Handler
import android.os.PersistableBundle
import androidx.appcompat.app.AppCompatActivity

class splashScreen : AppCompatActivity(){

    private val waktuSplash : Long = 5000


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.splash_screen)

        Handler().postDelayed({
            startActivity(Intent(this,DashboardActivity::class.java))
            finish()
        },waktuSplash)
    }

}