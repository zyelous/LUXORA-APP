package com.example.luxoraapp.ui.booking

import android.app.Dialog
import android.graphics.Color
import android.graphics.drawable.ColorDrawable
import android.os.Bundle
import android.widget.Button
import android.widget.CalendarView
import androidx.fragment.app.DialogFragment
import com.example.luxoraapp.R
import java.util.*

class DatePickerDialogFragment(
    private val onDateSelected: (Long) -> Unit
) : DialogFragment() {

    override fun onCreateDialog(savedInstanceState: Bundle?): Dialog {
        val dialog = Dialog(requireContext())
        dialog.setContentView(R.layout.fragment_date_picker_dialog)

        val calendarView = dialog.findViewById<CalendarView>(R.id.calendarView)
        val btnApply = dialog.findViewById<Button>(R.id.btnApply)
        val btnCancel = dialog.findViewById<Button>(R.id.btnCancel)

        // ✅ Set tanggal awal ke 1 Januari 2024
        val calendar = Calendar.getInstance()
        calendar.set(2024, Calendar.JANUARY, 1)
        calendarView.date = calendar.timeInMillis

        var selectedDate = calendar.timeInMillis

        calendarView.setOnDateChangeListener { _, year, month, dayOfMonth ->
            val cal = Calendar.getInstance()
            cal.set(year, month, dayOfMonth)
            selectedDate = cal.timeInMillis
        }

        btnApply.setOnClickListener {
            onDateSelected(selectedDate)
            dismiss()
        }

        btnCancel.setOnClickListener {
            dismiss()
        }

        dialog.window?.setBackgroundDrawable(ColorDrawable(Color.TRANSPARENT))
        return dialog
    }
}
