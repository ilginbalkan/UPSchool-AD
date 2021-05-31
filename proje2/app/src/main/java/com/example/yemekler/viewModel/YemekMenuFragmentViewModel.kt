package com.example.yemekler.viewModel

import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import com.example.yemekler.model.Food
import com.example.yemekler.repository.YemeklerDaoRepository

class YemekMenuFragmentViewModel: ViewModel() {

    var YemekListesi = MutableLiveData<List<Food>>()
    private val ydaor = YemeklerDaoRepository()

    init {
        tumYemekler()
        YemekListesi = ydaor.yemekleriGetir()
    }

    fun tumYemekler() {
        ydaor.tumYemekleriAl()
    }

}