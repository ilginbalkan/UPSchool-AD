package com.example.yemekler.adapter

import android.content.Context
import android.view.LayoutInflater
import android.view.ViewGroup
import android.widget.ImageView
import androidx.databinding.BindingAdapter
import androidx.navigation.Navigation
import androidx.recyclerview.widget.RecyclerView
import com.example.yemekler.R
import com.example.yemekler.databinding.YemekTasarimBinding
import com.example.yemekler.fragment.YemekMenuFragmentDirections
import com.example.yemekler.model.Food
import com.example.yemekler.viewModel.YemekMenuFragmentViewModel
import com.squareup.picasso.Picasso

class YemekAdapter(private var myContext:Context, private var YemekListesi: List<Food>, var viewModel: YemekMenuFragmentViewModel)
    :RecyclerView.Adapter<YemekAdapter.CardViewDesignHolder>(){

    inner class CardViewDesignHolder(yemekTasarimBinding: YemekTasarimBinding) : RecyclerView.ViewHolder(yemekTasarimBinding.root){

        var yemekTasarimBinding: YemekTasarimBinding

        init{
            this.yemekTasarimBinding = yemekTasarimBinding
        }
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): CardViewDesignHolder {
        val layoutInflater = LayoutInflater.from(myContext)
        val tasarim = YemekTasarimBinding.inflate(layoutInflater, parent, false)

        return CardViewDesignHolder(tasarim)
    }

    override fun onBindViewHolder(holder: CardViewDesignHolder, position: Int) {

        val yemek = YemekListesi.get(position)

        val holder = holder.yemekTasarimBinding

        holder.yemek = yemek
        holder.cardViewYemek.setOnClickListener {
            val gecis = YemekMenuFragmentDirections.detayaGecis(yemek)
            Navigation.findNavController(it).navigate(gecis)
        }
    }

    override fun getItemCount(): Int {
        return YemekListesi.size
    }

}

@BindingAdapter("load_image")
fun setImageViewResource(imageView: ImageView, yemek_resim_adi: String) {
    val url = "http://kasimadalan.pe.hu/yemekler/resimler/${yemek_resim_adi}"
    Picasso.get().load(url)
        .placeholder(R.drawable.yemek)
        .error(R.drawable.yemek)
        .into(imageView)
}