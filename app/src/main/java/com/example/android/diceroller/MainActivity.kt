package com.example.android.diceroller

import android.os.Bundle
import android.widget.Button
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val rollButton: Button = findViewById(R.id.roll_button)
        rollButton.setOnClickListener {
            // TODO (02) Remove the Toast and instead create a method called rollDice here. You can
            // use the keyboard shortcut:
            //    Windows/Linux - Alt + Enter
            //    Mac - Option + Enter

            Toast.makeText(this, "button clicked", Toast.LENGTH_SHORT).show()
        }

        // TODO (03) In rollDice get a Random int between 1 and 6

        // TODO (04) In rollDice use findViewById to get a reference to the TextView
        // and assign it to an inmutable variable called resultText

        // TODO (05) In rollDice set the random value that you got above as the
        // text of the TextView
    }
}