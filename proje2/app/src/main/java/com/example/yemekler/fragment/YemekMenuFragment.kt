package com.example.yemekler.fragment

import android.content.Context
import android.os.Bundle
import android.util.Log
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.appcompat.app.AppCompatActivity
import androidx.databinding.DataBindingUtil
import androidx.fragment.app.viewModels
import androidx.recyclerview.widget.StaggeredGridLayoutManager
import com.example.yemekler.R
import com.example.yemekler.adapter.YemekAdapter
import com.example.yemekler.databinding.FragmentYemekMenuBinding
import com.example.yemekler.viewModel.YemekMenuFragmentViewModel

class YemekMenuFragment : Fragment() {

    private lateinit var tasarim: FragmentYemekMenuBinding
    private lateinit var adapter: YemekAdapter
    private lateinit var viewModel: YemekMenuFragmentViewModel

    override fun onCreateView(inflater: LayoutInflater, container: ViewGroup?,
                              savedInstanceState: Bundle?): View? {
        // Inflate the layout for this fragment
        tasarim = DataBindingUtil.inflate(inflater, R.layout.fragment_yemek_menu, container, false)
        tasarim.toolbar = "Menü"
        (activity as AppCompatActivity).setSupportActionBar(tasarim.toolbarMenu)



        viewModel.YemekListesi.observe(viewLifecycleOwner,{ i->
            adapter = YemekAdapter(requireContext(), i, viewModel)
            tasarim.foodAdapter = adapter
        })

        return tasarim.root
    }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setHasOptionsMenu(true)

        val model: YemekMenuFragmentViewModel by viewModels()
        this.viewModel = model
    }

    override fun onResume() {
        super.onResume()
        viewModel.tumYemekler()
    }
}