package com.example.ecommerceapp_kotlin

import android.content.Intent
import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import kotlinx.android.synthetic.main.sign_in_design.*
import kotlinx.android.synthetic.main.sign_in_fragment.*

class Login : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.sign_in_fragment)
        supportActionBar?.hide()
        btn_login.setOnClickListener {

         var intent: Intent = Intent(applicationContext,Dashboard_Activity::class.java)
           startActivity(intent)


        }
        // set on-click listener
          tv_signup.setOnClickListener {
            var intent: Intent = Intent(applicationContext,SigunUp ::class.java)
            startActivity(intent)

        }



    }

}

