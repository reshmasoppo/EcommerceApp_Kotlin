package com.example.ecommerceapp_kotlin

import android.content.Intent
import android.os.Bundle
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity
import kotlinx.android.synthetic.main.signup_design.*


class SigunUp: AppCompatActivity()
{

lateinit var textv_click: TextView

    override fun onCreate(savedInstanceState: Bundle?) {
    super.onCreate(savedInstanceState)
    setContentView(R.layout.signup_fragment)


       supportActionBar?.hide()
        textv_click= findViewById(R.id.textv_click) as TextView

         signUp_btn.setOnClickListener {

        var intent: Intent = Intent(applicationContext, Login::class.java)
        startActivity(intent) }
    // set on-click listener
    textv_click.setOnClickListener {

        var intent: Intent = Intent(applicationContext, Login::class.java)

        startActivity(intent)

    }
}

}