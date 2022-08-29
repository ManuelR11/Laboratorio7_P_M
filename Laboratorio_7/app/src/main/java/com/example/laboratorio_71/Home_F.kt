package com.example.laboratorio_71

import android.os.Bundle
import android.provider.ContactsContract
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Button
import androidx.navigation.findNavController
import com.google.android.material.textfield.TextInputLayout


class Home_F : Fragment(R.layout.fragment_home_) {

    private lateinit var buttonLogin: Button
    private lateinit var inputLayputEmail: TextInputLayout
    private lateinit var buttonNew: Button

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        buttonLogin = view.findViewById(R.id.button)
        inputLayputEmail = view.findViewById(R.id.text_loginFragment_email)
        buttonNew = view.findViewById(R.id.text_click)

        setListeners()
    }

    private fun setListeners() {
        buttonLogin.setOnClickListener {

            requireView().findNavController().navigate(R.id.action_home_F_to_show_F)
        }

        buttonNew.setOnClickListener {
            requireView().findNavController().navigate(
                R.id.action_home_F_to_nuevaC_F
            )
        }
    }

}