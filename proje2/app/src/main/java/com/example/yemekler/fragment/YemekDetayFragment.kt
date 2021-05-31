package com.example.yemekler.fragment

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.databinding.DataBindingUtil
import androidx.navigation.fragment.navArgs
import com.example.yemekler.R
import com.example.yemekler.databinding.FragmentYemekDetayBinding
import com.google.android.material.snackbar.Snackbar


class YemekDetayFragment : Fragment() {

    private lateinit var tasarim: FragmentYemekDetayBinding

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        tasarim = DataBindingUtil.inflate(inflater,R.layout.fragment_yemek_detay, container, false)
        tasarim.detayToolbar = "Yemek Detayı"

        val bundle:YemekDetayFragmentArgs by navArgs()

        val gelen = bundle.yemek
        tasarim.yemek = gelen

        tasarim.sepetButon.setOnClickListener {
            Snackbar.make(it, "Sepete Eklendi", Snackbar.LENGTH_SHORT).show()
        }

        return tasarim.root
    }

}