package com.example.yemekler.fragment

import android.os.Bundle
import android.os.Parcelable
import androidx.navigation.NavDirections
import com.example.yemekler.R
import com.example.yemekler.model.Food
import java.io.Serializable
import java.lang.UnsupportedOperationException
import kotlin.Int
import kotlin.Suppress

public class YemekMenuFragmentDirections private constructor() {
  private data class DetayaGecis(
    public val yemek: Food
  ) : NavDirections {
    public override fun getActionId(): Int = R.id.detayaGecis

    @Suppress("CAST_NEVER_SUCCEEDS")
    public override fun getArguments(): Bundle {
      val result = Bundle()
      if (Parcelable::class.java.isAssignableFrom(Food::class.java)) {
        result.putParcelable("yemek", this.yemek as Parcelable)
      } else if (Serializable::class.java.isAssignableFrom(Food::class.java)) {
        result.putSerializable("yemek", this.yemek as Serializable)
      } else {
        throw UnsupportedOperationException(Food::class.java.name +
            " must implement Parcelable or Serializable or must be an Enum.")
      }
      return result
    }
  }

  public companion object {
    public fun detayaGecis(yemek: Food): NavDirections = DetayaGecis(yemek)
  }
}
