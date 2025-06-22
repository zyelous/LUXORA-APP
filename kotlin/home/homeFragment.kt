package com.example.luxoraapp.ui.home

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Button
import android.widget.Toast
import androidx.fragment.app.Fragment
import com.example.luxoraapp.R
import com.example.luxoraapp.ui.search.SearchResultFragment

class HomeFragment : Fragment() {

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        val view = inflater.inflate(R.layout.fragment_home, container, false)

        val btnSearch = view.findViewById<Button>(R.id.btn_search)

        btnSearch.setOnClickListener {
            // Tampilkan Toast
            Toast.makeText(requireActivity(), "Search Berhasil ", Toast.LENGTH_SHORT).show()

            // Navigasi manual ke fragment SearchResult
            parentFragmentManager.beginTransaction()
                .replace(R.id.nav_host_fragment_activity_main, SearchResultFragment())
                .addToBackStack(null)
                .commit()
        }

        return view
    }
}
