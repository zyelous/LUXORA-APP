package com.example.luxoraapp.ui.booking

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Button
import com.example.luxoraapp.R

class detail_pemesananFragment : Fragment() {

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        val view = inflater.inflate(R.layout.fragment_detail_pemesanan, container, false)

        val btnSelectPayment = view.findViewById<Button>(R.id.btn_select_payment)
        btnSelectPayment.setOnClickListener {
            parentFragmentManager.beginTransaction()
                .replace(R.id.nav_host_fragment_activity_main, pembayaranFragment())
                .addToBackStack(null)
                .commit()
        }

        return view
    }
}