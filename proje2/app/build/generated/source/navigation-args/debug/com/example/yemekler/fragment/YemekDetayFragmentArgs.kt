package com.example.yemekler.fragment

import android.os.Bundle
import android.os.Parcelable
import androidx.navigation.NavArgs
import com.example.yemekler.model.Food
import java.io.Serializable
import java.lang.IllegalArgumentException
import java.lang.UnsupportedOperationException
import kotlin.Suppress
import kotlin.jvm.JvmStatic

public data class YemekDetayFragmentArgs(
  public val yemek: Food
) : NavArgs {
  @Suppress("CAST_NEVER_SUCCEEDS")
  public fun toBundle(): Bundle {
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

  public companion object {
    @JvmStatic
    public fun fromBundle(bundle: Bundle): YemekDetayFragmentArgs {
      bundle.setClassLoader(YemekDetayFragmentArgs::class.java.classLoader)
      val __yemek : Food?
      if (bundle.containsKey("yemek")) {
        if (Parcelable::class.java.isAssignableFrom(Food::class.java) ||
            Serializable::class.java.isAssignableFrom(Food::class.java)) {
          __yemek = bundle.get("yemek") as Food?
        } else {
          throw UnsupportedOperationException(Food::class.java.name +
              " must implement Parcelable or Serializable or must be an Enum.")
        }
        if (__yemek == null) {
          throw IllegalArgumentException("Argument \"yemek\" is marked as non-null but was passed a null value.")
        }
      } else {
        throw IllegalArgumentException("Required argument \"yemek\" is missing and does not have an android:defaultValue")
      }
      return YemekDetayFragmentArgs(__yemek)
    }
  }
}
