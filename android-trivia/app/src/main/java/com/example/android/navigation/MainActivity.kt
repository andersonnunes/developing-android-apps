package com.example.android.navigation

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import androidx.databinding.DataBindingUtil
import androidx.navigation.Navigation
import androidx.navigation.findNavController
import androidx.navigation.fragment.NavHostFragment
import androidx.navigation.ui.NavigationUI
import com.example.android.navigation.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {
    // TODO (05) Add private lateinit vars drawerLayout and appBarConfiguration
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        @Suppress("UNUSED_VARIABLE")
        val binding = DataBindingUtil.setContentView<ActivityMainBinding>(this, R.layout.activity_main)

        // TODO (06) Initialize drawerLayout var from binding
        val navHostFragment = supportFragmentManager.findFragmentById(R.id.myNavHostFragment) as NavHostFragment
        val navController = navHostFragment.navController
        // TODO (07) Add the DrawerLayout as the second parameter to setupActionBarWithNavController
        NavigationUI.setupActionBarWithNavController(this, navController)
        // TODO (08) Create appBarConfiguration with the navController.graph and drawerLayout
        // TODO (09) Hook the navigation UI up to the navigation view. (navView)
    }

    override fun onSupportNavigateUp(): Boolean {
        val navHostFragment = supportFragmentManager.findFragmentById(R.id.myNavHostFragment) as NavHostFragment
        val navController = navHostFragment.navController
        // TODO (10) Replace navController.navigateUp with NavigationUI.navigateUp with drawerLayout param
        return  navController.navigateUp()
    }
}
