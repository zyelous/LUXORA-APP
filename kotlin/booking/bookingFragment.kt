package com.example.luxoraapp.ui.booking

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Button
import android.widget.ImageView
import android.widget.TextView
import androidx.fragment.app.Fragment
import com.example.luxoraapp.R
import java.text.SimpleDateFormat
import java.util.*

class BookingFragment : Fragment() {

    private lateinit var tvCheckin: TextView
    private lateinit var tvCheckout: TextView
    private lateinit var btn_book: Button

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        val view = inflater.inflate(R.layout.fragment_booking, container, false)
        val btnBack = view.findViewById<ImageView>(R.id.btnBack)

        // Inisialisasi
        tvCheckin = view.findViewById(R.id.tv_checkin)
        tvCheckout = view.findViewById(R.id.tv_checkout)
        btn_book = view.findViewById(R.id.btn_book)

        // Tanggal check-in
        tvCheckin.setOnClickListener {
            val dialog = DatePickerDialogFragment { selectedMillis ->
                val sdf = SimpleDateFormat("dd MMM yyyy", Locale.getDefault())
                tvCheckin.text = sdf.format(Date(selectedMillis))
            }
            dialog.show(parentFragmentManager, "datePickerCheckin")
        }

        // Tanggal check-out
        tvCheckout.setOnClickListener {
            val dialog = DatePickerDialogFragment { selectedMillis ->
                val sdf = SimpleDateFormat("dd MMM yyyy", Locale.getDefault())
                tvCheckout.text = sdf.format(Date(selectedMillis))
            }
            dialog.show(parentFragmentManager, "datePickerCheckout")
        }

        // Tombol Book Now → Navigasi ke Detail
        btn_book.setOnClickListener {
            parentFragmentManager.beginTransaction()
                .replace(R.id.nav_host_fragment_activity_main, detail_pemesananFragment())
                .addToBackStack(null)
                .commit()
            }

        btnBack.setOnClickListener {
            parentFragmentManager.popBackStack() // kembali ke fragment sebelumnya
        }

        return view
    }
}
