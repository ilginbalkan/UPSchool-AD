package com.example.yemekler.repository

import androidx.lifecycle.MutableLiveData
import com.example.yemekler.model.Food
import com.example.yemekler.retrofit.ApiUtils
import com.example.yemekler.retrofit.YemekDaoInterface
import com.example.yemeksiparis.model.FoodCevap
import retrofit2.Call
import retrofit2.Callback
import retrofit2.Response

class YemeklerDaoRepository {

    private val yemekListesi: MutableLiveData<List<Food>>
    private val yemekDaoInterface: YemekDaoInterface

    init {
        yemekDaoInterface = ApiUtils.getYemekDaoInterface()
        yemekListesi = MutableLiveData()
    }

    fun yemekleriGetir() : MutableLiveData<List<Food>> {
        return  yemekListesi
    }

    fun tumYemekleriAl() {
        yemekDaoInterface.tumYemekler().enqueue(object : Callback<FoodCevap> {

            override fun onResponse(call: Call<FoodCevap>, response: Response<FoodCevap>) {
                val liste = response.body().yemekler
                yemekListesi.value = liste
            }

            override fun onFailure(call: Call<FoodCevap>, t: Throwable?) { }
        })
    }


}