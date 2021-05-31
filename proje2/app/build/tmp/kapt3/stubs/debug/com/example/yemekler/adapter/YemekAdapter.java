package com.example.yemekler.adapter;

import java.lang.System;

@kotlin.Metadata(mv = {1, 4, 1}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000<\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u00002\f\u0012\b\u0012\u00060\u0002R\u00020\u00000\u0001:\u0001\u0019B#\u0012\u0006\u0010\u0003\u001a\u00020\u0004\u0012\f\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00070\u0006\u0012\u0006\u0010\b\u001a\u00020\t\u00a2\u0006\u0002\u0010\nJ\b\u0010\u000f\u001a\u00020\u0010H\u0016J\u001c\u0010\u0011\u001a\u00020\u00122\n\u0010\u0013\u001a\u00060\u0002R\u00020\u00002\u0006\u0010\u0014\u001a\u00020\u0010H\u0016J\u001c\u0010\u0015\u001a\u00060\u0002R\u00020\u00002\u0006\u0010\u0016\u001a\u00020\u00172\u0006\u0010\u0018\u001a\u00020\u0010H\u0016R\u0014\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00070\u0006X\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0003\u001a\u00020\u0004X\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u001a\u0010\b\u001a\u00020\tX\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u000b\u0010\f\"\u0004\b\r\u0010\u000e\u00a8\u0006\u001a"}, d2 = {"Lcom/example/yemekler/adapter/YemekAdapter;", "Landroidx/recyclerview/widget/RecyclerView$Adapter;", "Lcom/example/yemekler/adapter/YemekAdapter$CardViewDesignHolder;", "myContext", "Landroid/content/Context;", "YemekListesi", "", "Lcom/example/yemekler/model/Food;", "viewModel", "Lcom/example/yemekler/viewModel/YemekMenuFragmentViewModel;", "(Landroid/content/Context;Ljava/util/List;Lcom/example/yemekler/viewModel/YemekMenuFragmentViewModel;)V", "getViewModel", "()Lcom/example/yemekler/viewModel/YemekMenuFragmentViewModel;", "setViewModel", "(Lcom/example/yemekler/viewModel/YemekMenuFragmentViewModel;)V", "getItemCount", "", "onBindViewHolder", "", "holder", "position", "onCreateViewHolder", "parent", "Landroid/view/ViewGroup;", "viewType", "CardViewDesignHolder", "app_debug"})
public final class YemekAdapter extends androidx.recyclerview.widget.RecyclerView.Adapter<com.example.yemekler.adapter.YemekAdapter.CardViewDesignHolder> {
    private android.content.Context myContext;
    private java.util.List<com.example.yemekler.model.Food> YemekListesi;
    @org.jetbrains.annotations.NotNull()
    private com.example.yemekler.viewModel.YemekMenuFragmentViewModel viewModel;
    
    @org.jetbrains.annotations.NotNull()
    @java.lang.Override()
    public com.example.yemekler.adapter.YemekAdapter.CardViewDesignHolder onCreateViewHolder(@org.jetbrains.annotations.NotNull()
    android.view.ViewGroup parent, int viewType) {
        return null;
    }
    
    @java.lang.Override()
    public void onBindViewHolder(@org.jetbrains.annotations.NotNull()
    com.example.yemekler.adapter.YemekAdapter.CardViewDesignHolder holder, int position) {
    }
    
    @java.lang.Override()
    public int getItemCount() {
        return 0;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final com.example.yemekler.viewModel.YemekMenuFragmentViewModel getViewModel() {
        return null;
    }
    
    public final void setViewModel(@org.jetbrains.annotations.NotNull()
    com.example.yemekler.viewModel.YemekMenuFragmentViewModel p0) {
    }
    
    public YemekAdapter(@org.jetbrains.annotations.NotNull()
    android.content.Context myContext, @org.jetbrains.annotations.NotNull()
    java.util.List<com.example.yemekler.model.Food> YemekListesi, @org.jetbrains.annotations.NotNull()
    com.example.yemekler.viewModel.YemekMenuFragmentViewModel viewModel) {
        super();
    }
    
    @kotlin.Metadata(mv = {1, 4, 1}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0086\u0004\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\u0002\u0010\u0004R\u001a\u0010\u0002\u001a\u00020\u0003X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0005\u0010\u0006\"\u0004\b\u0007\u0010\b\u00a8\u0006\t"}, d2 = {"Lcom/example/yemekler/adapter/YemekAdapter$CardViewDesignHolder;", "Landroidx/recyclerview/widget/RecyclerView$ViewHolder;", "yemekTasarimBinding", "Lcom/example/yemekler/databinding/YemekTasarimBinding;", "(Lcom/example/yemekler/adapter/YemekAdapter;Lcom/example/yemekler/databinding/YemekTasarimBinding;)V", "getYemekTasarimBinding", "()Lcom/example/yemekler/databinding/YemekTasarimBinding;", "setYemekTasarimBinding", "(Lcom/example/yemekler/databinding/YemekTasarimBinding;)V", "app_debug"})
    public final class CardViewDesignHolder extends androidx.recyclerview.widget.RecyclerView.ViewHolder {
        @org.jetbrains.annotations.NotNull()
        private com.example.yemekler.databinding.YemekTasarimBinding yemekTasarimBinding;
        
        @org.jetbrains.annotations.NotNull()
        public final com.example.yemekler.databinding.YemekTasarimBinding getYemekTasarimBinding() {
            return null;
        }
        
        public final void setYemekTasarimBinding(@org.jetbrains.annotations.NotNull()
        com.example.yemekler.databinding.YemekTasarimBinding p0) {
        }
        
        public CardViewDesignHolder(@org.jetbrains.annotations.NotNull()
        com.example.yemekler.databinding.YemekTasarimBinding yemekTasarimBinding) {
            super(null);
        }
    }
}