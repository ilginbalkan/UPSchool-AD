package com.example.proje1

import java.io.Serializable

data class Products(var product_id: Int, var product_name: String, var product_image: String, var price: Double):Serializable {
}