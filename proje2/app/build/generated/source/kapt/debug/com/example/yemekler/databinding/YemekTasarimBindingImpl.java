package com.example.yemekler.databinding;
import com.example.yemekler.R;
import com.example.yemekler.BR;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import android.view.View;
@SuppressWarnings("unchecked")
public class YemekTasarimBindingImpl extends YemekTasarimBinding  {

    @Nullable
    private static final androidx.databinding.ViewDataBinding.IncludedLayouts sIncludes;
    @Nullable
    private static final android.util.SparseIntArray sViewsWithIds;
    static {
        sIncludes = null;
        sViewsWithIds = new android.util.SparseIntArray();
        sViewsWithIds.put(R.id.cardViewYemek, 3);
        sViewsWithIds.put(R.id.imageView4, 4);
    }
    // views
    @NonNull
    private final android.widget.LinearLayout mboundView0;
    // variables
    // values
    // listeners
    // Inverse Binding Event Handlers

    public YemekTasarimBindingImpl(@Nullable androidx.databinding.DataBindingComponent bindingComponent, @NonNull View root) {
        this(bindingComponent, root, mapBindings(bindingComponent, root, 5, sIncludes, sViewsWithIds));
    }
    private YemekTasarimBindingImpl(androidx.databinding.DataBindingComponent bindingComponent, View root, Object[] bindings) {
        super(bindingComponent, root, 0
            , (androidx.cardview.widget.CardView) bindings[3]
            , (android.widget.ImageView) bindings[4]
            , (android.widget.ImageView) bindings[2]
            , (android.widget.TextView) bindings[1]
            );
        this.imageViewYemekResim.setTag(null);
        this.mboundView0 = (android.widget.LinearLayout) bindings[0];
        this.mboundView0.setTag(null);
        this.textViewYemekAdi.setTag(null);
        setRootTag(root);
        // listeners
        invalidateAll();
    }

    @Override
    public void invalidateAll() {
        synchronized(this) {
                mDirtyFlags = 0x2L;
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
        com.example.yemekler.model.Food yemek = mYemek;
        java.lang.String yemekYemekAdi = null;

        if ((dirtyFlags & 0x3L) != 0) {



                if (yemek != null) {
                    // read yemek.yemek_resim_adi
                    yemekYemekResimAdi = yemek.getYemek_resim_adi();
                    // read yemek.yemek_adi
                    yemekYemekAdi = yemek.getYemek_adi();
                }
        }
        // batch finished
        if ((dirtyFlags & 0x3L) != 0) {
            // api target 1

            com.example.yemekler.adapter.YemekAdapterKt.setImageViewResource(this.imageViewYemekResim, yemekYemekResimAdi);
            androidx.databinding.adapters.TextViewBindingAdapter.setText(this.textViewYemekAdi, yemekYemekAdi);
        }
    }
    // Listener Stub Implementations
    // callback impls
    // dirty flag
    private  long mDirtyFlags = 0xffffffffffffffffL;
    /* flag mapping
        flag 0 (0x1L): yemek
        flag 1 (0x2L): null
    flag mapping end*/
    //end
}