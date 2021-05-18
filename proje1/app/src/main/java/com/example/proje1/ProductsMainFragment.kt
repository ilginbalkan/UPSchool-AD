package com.example.proje1

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.databinding.DataBindingUtil
import androidx.recyclerview.widget.StaggeredGridLayoutManager
import com.example.proje1.databinding.FragmentProductsMainBinding

class ProductsMainFragment : Fragment() {

    private lateinit var design: FragmentProductsMainBinding
    private lateinit var productList: ArrayList<Products>
    private lateinit var adapter: ProductsAdapter

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {

        design = DataBindingUtil.inflate(inflater,R.layout.fragment_products_main, container, false)
        design.rvproduct.layoutManager = StaggeredGridLayoutManager(4, StaggeredGridLayoutManager.VERTICAL)

        val p1 = Products(1, "İndirimler", "indirim", 10.99)
        val p2 = Products(2, "Su & İçecek", "suicecek", 7.00)
        val p3 = Products(3, "Meyve & Sebze", "meyvesebze", 6.50)
        val p4 = Products(4, "Fırından", "firindan", 3.50)
        val p5 = Products(5, "Temel Gıda", "temelgida", 12.00)
        val p6 = Products(6, "Atıştırmalık", "atistirmalik", 2.50)
        val p7 = Products(7, "Dondurma", "dondurma", 5.00)
        val p8 = Products(8, "Yiyecek", "yiyecek", 9.99)
        val p9 = Products(9, "Süt & Kahvaltı", "sutkahvalti", 4.99)
        val p10 = Products(10, "Fit & Form", "fitform", 7.00)
        val p11 = Products(11, "Kişisel Bakım", "kisiselbakim", 19.90)
        val p12 = Products(12, "Ev Bakım", "evbakim", 120.99)
        val p13 = Products(13, "Ev & Yaşam", "evyasam", 99.90)
        val p14 = Products(14, "Teknoloji", "teknoloji", 1499.90)
        val p15 = Products(15, "Evcil Hayvan", "evcilhayvan", 50.00)
        val p16 = Products(16, "Bebek", "bebek", 100.00)
        val p17 = Products(17, "Cinsel Sağlık", "cinselsaglik", 20.00)
        val p18 = Products(18, "Giyim", "giyim", 250.00)

        productList = ArrayList()
        productList.add(p1)
        productList.add(p2)
        productList.add(p3)
        productList.add(p4)
        productList.add(p5)
        productList.add(p6)
        productList.add(p7)
        productList.add(p8)
        productList.add(p9)
        productList.add(p10)
        productList.add(p11)
        productList.add(p12)
        productList.add(p13)
        productList.add(p14)
        productList.add(p15)
        productList.add(p16)
        productList.add(p17)
        productList.add(p18)

        adapter = ProductsAdapter(requireContext(),productList)

        design.rvproduct.adapter = adapter

        return design.root
    }

}
