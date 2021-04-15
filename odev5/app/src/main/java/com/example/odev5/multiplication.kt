package com.example.odev5

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.navigation.Navigation
import kotlinx.android.synthetic.main.fragment_multiplication.view.*
import kotlinx.android.synthetic.main.fragment_summation.view.*

class multiplication : Fragment() {

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment

        val tasarim = inflater.inflate(R.layout.fragment_multiplication, container, false)

        tasarim.button_mul.setOnClickListener {

            val result = tasarim.first_mul.text.toString().toInt() * tasarim.second_mul.text.toString().toInt()
            val gecis = multiplicationDirections.actionMul(result)

            Navigation.findNavController(it).navigate(gecis)
        }

        return tasarim
    }
}