package com.example.proje1

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.databinding.DataBindingUtil
import androidx.navigation.fragment.navArgs
import com.example.proje1.databinding.FragmentProductsDetailBinding

class ProductsDetailFragment : Fragment() {

    private lateinit var design: FragmentProductsDetailBinding

    override fun onCreateView(inflater: LayoutInflater, container: ViewGroup?,
                              savedInstanceState: Bundle?): View? {
        design = DataBindingUtil.inflate(inflater,R.layout.fragment_products_detail, container, false)

        val args: ProductsDetailFragmentArgs by navArgs()
        val product = args.productObject

        design.product = product
        design.imageViewProductDetail.setImageResource(resources.getIdentifier(product.product_image, "drawable",requireContext().packageName))

        return design.root
    }

}
