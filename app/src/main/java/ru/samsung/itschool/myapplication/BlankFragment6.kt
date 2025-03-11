package ru.samsung.itschool.myapplication

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Button
import android.widget.TextView
import androidx.fragment.app.Fragment
import androidx.navigation.fragment.findNavController

class BlankFragment6 : Fragment() {

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        val view = inflater.inflate(R.layout.fragment6, container, false)

        val textViewFragment6: TextView = view.findViewById(R.id.TextViewFragment6)
        textViewFragment6.text = "Fragment6"

        val buttonBack: Button = view.findViewById(R.id.ButtonBack)
        buttonBack.setOnClickListener {
            findNavController().popBackStack()
        }

        return view
    }
}
