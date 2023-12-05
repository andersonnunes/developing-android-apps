package com.example.android.guesstheword.screens.game

import android.os.Bundle
import android.util.Log
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.databinding.DataBindingUtil
import androidx.fragment.app.Fragment
import androidx.lifecycle.ViewModelProvider
import androidx.navigation.fragment.findNavController
import com.example.android.guesstheword.R
import com.example.android.guesstheword.databinding.GameFragmentBinding

/**
 * Fragment where the game is played
 */
class GameFragment : Fragment() {

    private lateinit var viewModel: GameViewModel

    private lateinit var binding: GameFragmentBinding

    override fun onCreateView(inflater: LayoutInflater, container: ViewGroup?,
                              savedInstanceState: Bundle?): View {

        // Inflate view and obtain an instance of the binding class
        binding = DataBindingUtil.inflate(
            inflater,
            R.layout.game_fragment,
            container,
            false
        )

        // Get the viewmodel
        Log.i("GameFragment", "Called ViewModelProvider")
        viewModel = ViewModelProvider(this)[GameViewModel::class.java]

        binding.correctButton.setOnClickListener {
            viewModel.onCorrect()
            updateScoreText()
            updateWordText()
        }
        binding.skipButton.setOnClickListener {
            viewModel.onSkip()
            updateScoreText()
            updateWordText()
        }

        // TODO (04) Setup the LiveData observation relationship by getting the LiveData from your
        // ViewModel and calling observe. Make sure to pass in *this* and then an Observer lambda
        updateScoreText()
        updateWordText()
        return binding.root

    }

    /**
     * Called when the game is finished
     */
    fun gameFinished() {
        // TODO (06) Add a null safety check here - you can use the elvis operator to pass 0 if
        // the LiveData is null
        val action = GameFragmentDirections.actionGameToScore(viewModel.score)
        findNavController().navigate(action)
    }

    /** Methods for updating the UI **/

    // TODO (05) Move this code to update the UI up to your Observers; remove references to
    // updateWordText and updateScoreText - you shouldn't need them!
    private fun updateWordText() {
        binding.wordText.text = viewModel.word

    }

    private fun updateScoreText() {
        binding.scoreText.text = viewModel.score.toString()
    }
}