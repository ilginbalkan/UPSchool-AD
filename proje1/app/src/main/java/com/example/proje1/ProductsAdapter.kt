package com.example.proje1

import android.content.Context
import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.navigation.Navigation
import androidx.recyclerview.widget.RecyclerView
import com.example.proje1.databinding.ProductCardBinding
import com.google.android.material.snackbar.Snackbar

class ProductsAdapter(var mContext: Context, var productList: List<Products>): RecyclerView.Adapter<ProductsAdapter.CardDesign>() {

    inner class CardDesign(productCardBinding: ProductCardBinding):RecyclerView.ViewHolder(productCardBinding.root){
        var design:ProductCardBinding

        init{
            this.design = productCardBinding
        }

    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): CardDesign {
        val layoutInflater = LayoutInflater.from(mContext)
        val design = ProductCardBinding.inflate(layoutInflater,parent,false)

        return CardDesign(design)
    }

    override fun onBindViewHolder(holder: CardDesign, position: Int) {
        val product = productList.get(position)

        holder.design.imageViewProduct.setImageResource(mContext.resources.getIdentifier(product.product_image, "drawable", mContext.packageName))

        holder.design.ProductName.text = product.product_name

        holder.design.productCardView.setOnClickListener{
            val transaction = ProductsMainFragmentDirections.actionMainToDetail(product)

            Navigation.findNavController(it).navigate(transaction)
        }
    }

    override fun getItemCount(): Int {
        return productList.size
    }

}