package com.example.laboratorio_71

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Button
import androidx.navigation.findNavController


class Show_F : Fragment(R.layout.fragment_show_) {

    private lateinit var buttonActualizar: Button

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        buttonActualizar = view.findViewById(R.id.button)
        setListeners()
    }

    private fun setListeners() {
        buttonActualizar.setOnClickListener {
            requireView().findNavController().navigate(
                Show_FDirections.actionShowFToPerfilF()

            )
        }
    }

}