package com.example.yemekler.retrofit

class ApiUtils {

    companion object{

        val BASE_URL = "http://kasimadalan.pe.hu/"

        fun getYemekDaoInterface(): YemekDaoInterface {
            return RetrofitClient.getClient(BASE_URL).create(YemekDaoInterface::class.java)
        }
    }
}