package com.example.luxoraapp.ui.auth

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Button
import android.widget.ImageButton
import android.widget.Toast
import com.example.luxoraapp.R

class SignUpFragment : Fragment() {
    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {
        val view = inflater.inflate(R.layout.fragment_signup, container, false)

        val btnSignUp = view.findViewById<Button>(R.id.btn_sign_up)
        val btnBack = view.findViewById<ImageButton>(R.id.btnBack)

        btnSignUp.setOnClickListener {
            // Navigasi ke LoginFragment
            parentFragmentManager.beginTransaction()
                .replace(R.id.fragment_container, LoginFragment())
                .addToBackStack(null) // bisa dihapus jika tak ingin kembali ke SignUp
                .commit()

            Toast.makeText(requireContext(), "Sign Up Berhasil! Silakan Login", Toast.LENGTH_SHORT).show()
        }

        btnBack.setOnClickListener {
            parentFragmentManager.popBackStack()
        }

        return view
    }
}
