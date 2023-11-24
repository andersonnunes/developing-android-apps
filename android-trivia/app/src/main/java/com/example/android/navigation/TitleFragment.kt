package com.example.android.navigation

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.databinding.DataBindingUtil
import androidx.fragment.app.Fragment
import com.example.android.navigation.databinding.FragmentTitleBinding

class TitleFragment : Fragment() {
    override fun onCreateView(inflater: LayoutInflater, container: ViewGroup?,
                              savedInstanceState: Bundle?): View {
        val binding: FragmentTitleBinding = DataBindingUtil.inflate(
            inflater, R.layout.fragment_title, container, false
        )
        // TODO (09) Call binding.playButton.setOnClickListener and navigate to the gameFragment
        // Use Navigation.createNavigateOnClickListener with
        // R.id.action_titleFragment_to_gameFragment
        return binding.root
    }
    // TODO (06) Add the Title Fragment to the Navigation Graph
    // Go to the navigation.xml file and select the design tab
    // Click the add icon with the + on it to add a new destination to the graph
    // Select fragment_title to add this fragment to the graph as the start destination

    // TODO (08) Connect the Title and Game Fragments with an Action
    // In the navigation editor, hover over the titleFragment.  Click on the circular connection
    // point and drag to gameFragment to create the Action
}