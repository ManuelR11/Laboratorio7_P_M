package com.example.laboratorio_71

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Button
import androidx.navigation.findNavController
import com.google.android.material.textfield.TextInputLayout


class NuevaC_F : Fragment(R.layout.fragment_nueva_c_) {

    private lateinit var buttonCreate: Button
    private lateinit var inputNewEmail: TextInputLayout

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        buttonCreate = view.findViewById(R.id.button)
        inputNewEmail = view.findViewById(R.id.textInputEditText2)
        setListeners()
    }

    private fun setListeners() {
        buttonCreate.setOnClickListener {
            val action = NuevaC_FDirections.actionNuevaCFToShowF2(
                email = inputNewEmail.editText!!.text.toString()

            )
            requireView().findNavController().navigate(action)
        }
    }
}