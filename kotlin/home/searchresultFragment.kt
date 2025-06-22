package com.example.luxoraapp.ui.search

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageButton
import android.widget.LinearLayout
import androidx.fragment.app.Fragment
import androidx.navigation.fragment.findNavController
import com.example.luxoraapp.R

class SearchResultFragment : Fragment() {
    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        val view = inflater.inflate(R.layout.fragment_searchresult, container, false)

        val btnBack = view.findViewById<ImageButton>(R.id.btnBack)

        val luxurios = view.findViewById<LinearLayout>(R.id.luxurios)
        luxurios.setOnClickListener {
            findNavController().navigate(R.id.action_searchResultFragment_to_propertyDetailFragment)
        }

        btnBack.setOnClickListener {
            parentFragmentManager.popBackStack() // kembali ke fragment sebelumnya
        }


        return view
    }

}