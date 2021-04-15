package com.example.odev5

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.navigation.Navigation
import kotlinx.android.synthetic.main.fragment_summation.*
import kotlinx.android.synthetic.main.fragment_summation.view.*

class summation : Fragment() {

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        val tasarim = inflater.inflate(R.layout.fragment_summation, container, false)

        tasarim.button_sum.setOnClickListener {

            val result = tasarim.first_sum.text.toString().toInt() + tasarim.second_sum.text.toString().toInt()
            val gecis = summationDirections.actionSum(result)

            Navigation.findNavController(it).navigate(gecis)
        }

        return tasarim
    }

}