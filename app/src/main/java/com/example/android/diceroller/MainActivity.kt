package com.example.android.diceroller

import android.os.Bundle
import android.widget.Button
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity
import java.util.Random

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val rollButton: Button = findViewById(R.id.roll_button)
        rollButton.setOnClickListener {
            rollDice()
        }
    }

    private fun rollDice() {
        val randomInt = Random().nextInt(6) + 1
        // TODO (04) Choose the right drawable resource based on the value of randomInt
        // Tip: Use a when expression

        // TODO (03) Get a reference to the imageView instead
        val resultText: TextView = findViewById(R.id.result_text)

        // TODO (05) Make the ImageView show the chosen drawable resource
        resultText.text = randomInt.toString()
    }
}