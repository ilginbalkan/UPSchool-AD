package com.example.yemekler.databinding;
import com.example.yemekler.R;
import com.example.yemekler.BR;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import android.view.View;
@SuppressWarnings("unchecked")
public class FragmentYemekDetayBindingImpl extends FragmentYemekDetayBinding  {

    @Nullable
    private static final androidx.databinding.ViewDataBinding.IncludedLayouts sIncludes;
    @Nullable
    private static final android.util.SparseIntArray sViewsWithIds;
    static {
        sIncludes = null;
        sViewsWithIds = new android.util.SparseIntArray();
        sViewsWithIds.put(R.id.sepetButon, 5);
    }
    // views
    @NonNull
    private final androidx.constraintlayout.widget.ConstraintLayout mboundView0;
    // variables
    // values
    // listeners
    // Inverse Binding Event Handlers

    public FragmentYemekDetayBindingImpl(@Nullable androidx.databinding.DataBindingComponent bindingComponent, @NonNull View root) {
        this(bindingComponent, root, mapBindings(bindingComponent, root, 6, sIncludes, sViewsWithIds));
    }
    private FragmentYemekDetayBindingImpl(androidx.databinding.DataBindingComponent bindingComponent, View root, Object[] bindings) {
        super(bindingComponent, root, 0
            , (android.widget.ImageView) bindings[2]
            , (android.widget.Button) bindings[5]
            , (android.widget.TextView) bindings[3]
            , (android.widget.TextView) bindings[4]
            , (androidx.appcompat.widget.Toolbar) bindings[1]
            );
        this.imageView.setTag(null);
        this.mboundView0 = (androidx.constraintlayout.widget.ConstraintLayout) bindings[0];
        this.mboundView0.setTag(null);
        this.textView.setTag(null);
        this.textView2.setTag(null);
        this.toolbarMenu.setTag(null);
        setRootTag(root);
        // listeners
        invalidateAll();
    }

    @Override
    public void invalidateAll() {
        synchronized(this) {
                mDirtyFlags = 0x4L;
        }
        requestRebind();
    }

    @Override
    public boolean hasPendingBindings() {
        synchronized(this) {
            if (mDirtyFlags != 0) {
                return true;
            }
        }
        return false;
    }

    @Override
    public boolean setVariable(int variableId, @Nullable Object variable)  {
        boolean variableSet = true;
        if (BR.yemek == variableId) {
            setYemek((com.example.yemekler.model.Food) variable);
        }
        else if (BR.detayToolbar == variableId) {
            setDetayToolbar((java.lang.String) variable);
        }
        else {
            variableSet = false;
        }
            return variableSet;
    }

    public void setYemek(@Nullable com.example.yemekler.model.Food Yemek) {
        this.mYemek = Yemek;
        synchronized(this) {
            mDirtyFlags |= 0x1L;
        }
        notifyPropertyChanged(BR.yemek);
        super.requestRebind();
    }
    public void setDetayToolbar(@Nullable java.lang.String DetayToolbar) {
        this.mDetayToolbar = DetayToolbar;
        synchronized(this) {
            mDirtyFlags |= 0x2L;
        }
        notifyPropertyChanged(BR.detayToolbar);
        super.requestRebind();
    }

    @Override
    protected boolean onFieldChange(int localFieldId, Object object, int fieldId) {
        switch (localFieldId) {
        }
        return false;
    }

    @Override
    protected void executeBindings() {
        long dirtyFlags = 0;
        synchronized(this) {
            dirtyFlags = mDirtyFlags;
            mDirtyFlags = 0;
        }
        java.lang.String yemekYemekResimAdi = null;
        java.lang.String doubleToStringYemekYemekFiyat = null;
        java.lang.String doubleToStringYemekYemekFiyatCharU20BA = null;
        java.lang.String yemekYemekAdi = null;
        int yemekYemekFiyat = 0;
        com.example.yemekler.model.Food yemek = mYemek;
        java.lang.String detayToolbar = mDetayToolbar;

        if ((dirtyFlags & 0x5L) != 0) {



                if (yemek != null) {
                    // read yemek.yemek_resim_adi
                    yemekYemekResimAdi = yemek.getYemek_resim_adi();
                    // read yemek.yemek_adi
                    yemekYemekAdi = yemek.getYemek_adi();
                    // read yemek.yemek_fiyat
                    yemekYemekFiyat = yemek.getYemek_fiyat();
                }


                // read Double.toString(yemek.yemek_fiyat)
                doubleToStringYemekYemekFiyat = java.lang.Double.toString(yemekYemekFiyat);


                // read (Double.toString(yemek.yemek_fiyat)) + ('\u20BA')
                doubleToStringYemekYemekFiyatCharU20BA = (doubleToStringYemekYemekFiyat) + ('\u20BA');
        }
        if ((dirtyFlags & 0x6L) != 0) {
        }
        // batch finished
        if ((dirtyFlags & 0x5L) != 0) {
            // api target 1

            com.example.yemekler.adapter.YemekAdapterKt.setImageViewResource(this.imageView, yemekYemekResimAdi);
            androidx.databinding.adapters.TextViewBindingAdapter.setText(this.textView, yemekYemekAdi);
            androidx.databinding.adapters.TextViewBindingAdapter.setText(this.textView2, doubleToStringYemekYemekFiyatCharU20BA);
        }
        if ((dirtyFlags & 0x6L) != 0) {
            // api target 1

            this.toolbarMenu.setTitle(detayToolbar);
        }
    }
    // Listener Stub Implementations
    // callback impls
    // dirty flag
    private  long mDirtyFlags = 0xffffffffffffffffL;
    /* flag mapping
        flag 0 (0x1L): yemek
        flag 1 (0x2L): detayToolbar
        flag 2 (0x3L): null
    flag mapping end*/
    //end
}