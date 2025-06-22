package com.example.luxoraapp.ui.home

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Button
import android.widget.ImageButton
import com.example.luxoraapp.R
import com.example.luxoraapp.ui.booking.BookingFragment

class propertydetailFragment : Fragment() {
    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        val view = inflater.inflate(R.layout.fragment_propertydetail, container, false)

        val btnBack = view.findViewById<ImageButton>(R.id.btnBack)

        val book_now= view.findViewById<Button>(R.id.book_now)
        book_now.setOnClickListener {
            parentFragmentManager.beginTransaction()
                .replace(R.id.nav_host_fragment_activity_main,BookingFragment())
                .addToBackStack(null)
                .commit()
        }

        btnBack.setOnClickListener {
            parentFragmentManager.popBackStack() // kembali ke fragment sebelumnya
        }
        return view
    }
}
