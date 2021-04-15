package com.example.odev5

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.navigation.fragment.navArgs
import kotlinx.android.synthetic.main.fragment_mul_result.view.*
import kotlinx.android.synthetic.main.fragment_sum_result.view.*

class mulResult : Fragment() {

    override fun onCreateView(inflater: LayoutInflater, container: ViewGroup?,
                              savedInstanceState: Bundle?): View? {
        // Inflate the layout for this fragment

        val tasarim = inflater.inflate(R.layout.fragment_mul_result, container, false)

        val bundle:mulResultArgs by navArgs()
        tasarim.mulResult.text =  bundle.resultOfMul.toString()

        return tasarim
    }
}