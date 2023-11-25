package com.example.android.navigation

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Toast
import androidx.databinding.DataBindingUtil
import androidx.fragment.app.Fragment
import androidx.navigation.findNavController
import com.example.android.navigation.databinding.FragmentGameWonBinding


class GameWonFragment : Fragment() {
    override fun onCreateView(inflater: LayoutInflater, container: ViewGroup?,
                              savedInstanceState: Bundle?): View {
        // Inflate the layout for this fragment
        val binding: FragmentGameWonBinding = DataBindingUtil.inflate(
            inflater, R.layout.fragment_game_won, container, false)
        binding.nextMatchButton.setOnClickListener { view: View ->
            view.findNavController().navigate(
                GameWonFragmentDirections.actionGameWonFragmentToGameFragment()
            )
        }
        val args = GameWonFragmentArgs.fromBundle(requireArguments())
        Toast.makeText(context,
            "NumCorrect: ${args.numCorrect}, NumQuestions: ${args.numQuestions}",
            Toast.LENGTH_LONG).show()
        // TODO (01) Add setHasOptionsMenu(true)
        // This allows onCreateOptionsMenu to be called
        return binding.root
    }

    // TODO (02) Create getShareIntent method
    // TODO (03) Create shareSuccess method
    // TODO (04) Override and fill out onCreateOptionsMenu
    // Inflate the winner_menu and set the share menu item to invisible if the activity doesn't
    // resolve
    // TODO (05) Override onOptionsItemSelected
    // Call the shareSuccess method when the item id matches R.id.share
}
