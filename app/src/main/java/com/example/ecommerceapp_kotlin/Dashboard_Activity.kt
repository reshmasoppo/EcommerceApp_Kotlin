package com.example.ecommerceapp_kotlin

import android.content.Context
import android.net.Uri
import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.appcompat.app.AppCompatActivity
import androidx.navigation.NavController
import androidx.navigation.Navigation
import androidx.navigation.ui.NavigationUI
import androidx.navigation.ui.setupWithNavController
import kotlinx.android.synthetic.main.fragment_dashboard_fragment.*


class Dashboard_Activity : AppCompatActivity()
    {
        lateinit var navController: NavController
        override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.fragment_dashboard_fragment)

        //Getting the Navigation Controller
        navController = Navigation.findNavController(this, R.id.my_nav_host_fragment)
            //Setting the navigation controller to Bottom Nav
        btm_nav.setupWithNavController(navController)
            //Setting up the action bar
        //  val toolbar = findViewById(R.id.toolbar) as Toolbar
        // setSupportActionBar(toolbar)
            NavigationUI.setupActionBarWithNavController(this, navController)
    }

        //setting menu in action bar
        // Setting Up the back button


        override fun onSupportNavigateUp(): Boolean {
            return NavigationUI.navigateUp(navController, null)
        }
}