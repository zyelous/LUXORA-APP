package com.example.luxoraapp.ui.auth

import android.content.Intent
import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Button
import android.widget.ImageButton
import android.widget.Toast
import androidx.fragment.app.Fragment
import com.example.luxoraapp.R
import com.example.luxoraapp.MainActivity

class LoginFragment : Fragment() {

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        val view = inflater.inflate(R.layout.fragment_login, container, false)

        val btnLogin = view.findViewById<Button>(R.id.btn_login)
        val btnBack = view.findViewById<ImageButton>(R.id.btnBack)

        btnLogin.setOnClickListener {
            // Navigasi ke MainActivity
            val intent = Intent(requireContext(), MainActivity::class.java)
            Toast.makeText(requireActivity(), "Welcome To Luxora", Toast.LENGTH_SHORT).show()
            startActivity(intent)
            requireActivity().finish() // agar tidak bisa kembali ke login
        }

        btnBack.setOnClickListener {
            parentFragmentManager.popBackStack() // kembali ke fragment sebelumnya
        }


        return view
    }
}
