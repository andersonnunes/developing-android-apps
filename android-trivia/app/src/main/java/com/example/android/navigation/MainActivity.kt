package com.example.android.navigation

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import androidx.databinding.DataBindingUtil
import com.example.android.navigation.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        @Suppress("UNUSED_VARIABLE")
        val binding = DataBindingUtil.setContentView<ActivityMainBinding>(this, R.layout.activity_main)
        // TODO (01) Find the navController from myNavHostFragment
        // Since we're using KTX, you can call this.findNavController
        // TODO (02) Link the navController to our ActionBar
        // By calling NavigationUI.setupActionBarWithNavController
    }

    // TODO (03) Override onSupportNavigateUp
    // Find the navController and then call navController.navigateUp
}
