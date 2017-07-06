package com.example.codemate.tournamentorganizer.app.ui.splash.activity

import android.content.Intent
import android.os.Bundle
import android.support.v7.app.AppCompatActivity
import com.example.codemate.tournamentorganizer.app.ui.home.activity.HomeActivity

/**
 * Created by Alex Lindroos on 21/06/2017.
 */
class SplashActivity : AppCompatActivity(), SplashView {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        var intent = Intent(this, HomeActivity::class.java)
        startActivity(intent)
        finish()
    }
}