package com.example.luxoraapp.ui.profile

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import com.example.luxoraapp.R
import com.example.luxoraapp.ui.auth.AuthActivity
import com.example.luxoraapp.ui.auth.WelcomeFragment

class ProfileFragment : Fragment() {

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        val view = inflater.inflate(R.layout.fragment_profile, container, false)

        val logout = view.findViewById<ImageView>(R.id.logout)

        logout.setOnClickListener {

            // Kembali ke halaman login
            val intent = Intent(requireContext(), AuthActivity::class.java)
            startActivity(intent)
            requireActivity().finish() 
        }

        return view
    }

}
