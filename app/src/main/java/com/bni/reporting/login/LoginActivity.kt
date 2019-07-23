package com.bni.reporting.login

import android.os.Bundle
import android.support.v7.app.AppCompatActivity
import android.view.Window
import android.view.WindowManager
import com.bni.reporting.R

class LoginActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        //To hide the title bar and enable full screen.
        requestWindowFeature(Window.FEATURE_NO_TITLE)
        supportActionBar?.hide() // hide the title bar
        this.getWindow().setFlags(
            WindowManager.LayoutParams.FLAG_FULLSCREEN,
            WindowManager.LayoutParams.FLAG_FULLSCREEN
        ); //enable full screen

        //To attach layout to the code.
        setContentView(R.layout.activity_login)
    }
}
