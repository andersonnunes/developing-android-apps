package com.example.android.guesstheword.screens.game

import android.util.Log
import androidx.lifecycle.ViewModel

/**
 * ViewModel containing all the logic needed to run the game
 */
class GameViewModel : ViewModel() {

    // TODO (06) Once you've copied over the variables and methods, remove any code referring back
    // to the GameFragment. You can also clean up the log statements from the last step.

    init {
        Log.i("GameViewModel", "GameViewModel created!")
    }

    override fun onCleared() {
        super.onCleared()
        Log.i("GameViewModel", "GameViewModel destroyed!")
    }
}