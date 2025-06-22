package com.example.luxoraapp.ui.booking

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Button
import com.example.luxoraapp.R

class pembayaranFragment : Fragment() {

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        val view = inflater.inflate(R.layout.fragment_pembayaran, container, false)

        val btn_confirm_pay = view.findViewById<Button>(R.id.btn_confirm_pay)
        btn_confirm_pay.setOnClickListener {
            parentFragmentManager.beginTransaction()
                .replace(R.id.nav_host_fragment_activity_main, bookingConfirmFragment())
                .addToBackStack(null)
                .commit()
        }

        return view
    }
}
