package com.example.android.guesstheword.screens.game

import androidx.lifecycle.ViewModel

/**
 * ViewModel containing all the logic needed to run the game
 */
class GameViewModel : ViewModel() {

    // TODO (01) Wrap word and score in MutableLiveData
    // The current word
    var word = ""

    // The current score
    var score = 0
    // TODO (02) Change references to score and word to score.value and word.value and add the
    // require null safety checks

    // The list of words - the front of the list is the next word to guess
    private lateinit var wordList: MutableList<String>

    init {
        resetList()
        nextWord()
        // TODO (03) Initialize score.value to 0
    }

    /**
     * Resets the list of words and randomizes the order
     */
    private fun resetList() {
        wordList = mutableListOf(
            "queen",
            "hospital",
            "basketball",
            "cat",
            "change",
            "snail",
            "soup",
            "calendar",
            "sad",
            "desk",
            "guitar",
            "home",
            "railway",
            "zebra",
            "jelly",
            "car",
            "crow",
            "trade",
            "bag",
            "roll",
            "bubble"
        )
        wordList.shuffle()
    }

    /**
     * Moves to the next word in the list
     */
    private fun nextWord() {
        //Select and remove a word from the list
        if (wordList.isEmpty()) {
           //  gameFinished()
        } else {
            word = wordList.removeAt(0)
        }
    }

    /** Methods for buttons presses **/

    fun onSkip() {
        score--
        nextWord()
    }

    fun onCorrect() {
        score++
        nextWord()
    }
}