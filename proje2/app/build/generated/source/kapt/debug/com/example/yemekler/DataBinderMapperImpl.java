package com.example.yemekler;

import android.util.SparseArray;
import android.util.SparseIntArray;
import android.view.View;
import androidx.databinding.DataBinderMapper;
import androidx.databinding.DataBindingComponent;
import androidx.databinding.ViewDataBinding;
import com.example.yemekler.databinding.FragmentYemekDetayBindingImpl;
import com.example.yemekler.databinding.FragmentYemekMenuBindingImpl;
import com.example.yemekler.databinding.YemekTasarimBindingImpl;
import java.lang.IllegalArgumentException;
import java.lang.Integer;
import java.lang.Object;
import java.lang.Override;
import java.lang.RuntimeException;
import java.lang.String;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

public class DataBinderMapperImpl extends DataBinderMapper {
  private static final int LAYOUT_FRAGMENTYEMEKDETAY = 1;

  private static final int LAYOUT_FRAGMENTYEMEKMENU = 2;

  private static final int LAYOUT_YEMEKTASARIM = 3;

  private static final SparseIntArray INTERNAL_LAYOUT_ID_LOOKUP = new SparseIntArray(3);

  static {
    INTERNAL_LAYOUT_ID_LOOKUP.put(com.example.yemekler.R.layout.fragment_yemek_detay, LAYOUT_FRAGMENTYEMEKDETAY);
    INTERNAL_LAYOUT_ID_LOOKUP.put(com.example.yemekler.R.layout.fragment_yemek_menu, LAYOUT_FRAGMENTYEMEKMENU);
    INTERNAL_LAYOUT_ID_LOOKUP.put(com.example.yemekler.R.layout.yemek_tasarim, LAYOUT_YEMEKTASARIM);
  }

  @Override
  public ViewDataBinding getDataBinder(DataBindingComponent component, View view, int layoutId) {
    int localizedLayoutId = INTERNAL_LAYOUT_ID_LOOKUP.get(layoutId);
    if(localizedLayoutId > 0) {
      final Object tag = view.getTag();
      if(tag == null) {
        throw new RuntimeException("view must have a tag");
      }
      switch(localizedLayoutId) {
        case  LAYOUT_FRAGMENTYEMEKDETAY: {
          if ("layout/fragment_yemek_detay_0".equals(tag)) {
            return new FragmentYemekDetayBindingImpl(component, view);
          }
          throw new IllegalArgumentException("The tag for fragment_yemek_detay is invalid. Received: " + tag);
        }
        case  LAYOUT_FRAGMENTYEMEKMENU: {
          if ("layout/fragment_yemek_menu_0".equals(tag)) {
            return new FragmentYemekMenuBindingImpl(component, view);
          }
          throw new IllegalArgumentException("The tag for fragment_yemek_menu is invalid. Received: " + tag);
        }
        case  LAYOUT_YEMEKTASARIM: {
          if ("layout/yemek_tasarim_0".equals(tag)) {
            return new YemekTasarimBindingImpl(component, view);
          }
          throw new IllegalArgumentException("The tag for yemek_tasarim is invalid. Received: " + tag);
        }
      }
    }
    return null;
  }

  @Override
  public ViewDataBinding getDataBinder(DataBindingComponent component, View[] views, int layoutId) {
    if(views == null || views.length == 0) {
      return null;
    }
    int localizedLayoutId = INTERNAL_LAYOUT_ID_LOOKUP.get(layoutId);
    if(localizedLayoutId > 0) {
      final Object tag = views[0].getTag();
      if(tag == null) {
        throw new RuntimeException("view must have a tag");
      }
      switch(localizedLayoutId) {
      }
    }
    return null;
  }

  @Override
  public int getLayoutId(String tag) {
    if (tag == null) {
      return 0;
    }
    Integer tmpVal = InnerLayoutIdLookup.sKeys.get(tag);
    return tmpVal == null ? 0 : tmpVal;
  }

  @Override
  public String convertBrIdToString(int localId) {
    String tmpVal = InnerBrLookup.sKeys.get(localId);
    return tmpVal;
  }

  @Override
  public List<DataBinderMapper> collectDependencies() {
    ArrayList<DataBinderMapper> result = new ArrayList<DataBinderMapper>(1);
    result.add(new androidx.databinding.library.baseAdapters.DataBinderMapperImpl());
    return result;
  }

  private static class InnerBrLookup {
    static final SparseArray<String> sKeys = new SparseArray<String>(5);

    static {
      sKeys.put(1, "FoodAdapter");
      sKeys.put(2, "Toolbar");
      sKeys.put(0, "_all");
      sKeys.put(3, "detayToolbar");
      sKeys.put(4, "yemek");
    }
  }

  private static class InnerLayoutIdLookup {
    static final HashMap<String, Integer> sKeys = new HashMap<String, Integer>(3);

    static {
      sKeys.put("layout/fragment_yemek_detay_0", com.example.yemekler.R.layout.fragment_yemek_detay);
      sKeys.put("layout/fragment_yemek_menu_0", com.example.yemekler.R.layout.fragment_yemek_menu);
      sKeys.put("layout/yemek_tasarim_0", com.example.yemekler.R.layout.yemek_tasarim);
    }
  }
}
