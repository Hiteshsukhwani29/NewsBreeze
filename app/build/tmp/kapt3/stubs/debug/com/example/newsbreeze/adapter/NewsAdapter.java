package com.example.newsbreeze.adapter;

import java.lang.System;

@kotlin.Metadata(mv = {1, 6, 0}, k = 1, d1 = {"\u0000@\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001:\u0001\u001bB\u0011\u0012\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u0004\u00a2\u0006\u0002\u0010\u0005J\b\u0010\u0011\u001a\u00020\u0012H\u0016J\u0018\u0010\u0013\u001a\u00020\u00142\u0006\u0010\u0015\u001a\u00020\u00022\u0006\u0010\u0016\u001a\u00020\u0012H\u0016J\u0018\u0010\u0017\u001a\u00020\u00022\u0006\u0010\u0018\u001a\u00020\u00192\u0006\u0010\u001a\u001a\u00020\u0012H\u0016R\u001f\u0010\u0006\u001a\u0010\u0012\f\u0012\n \t*\u0004\u0018\u00010\b0\b0\u0007\u00a2\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000bR\u0014\u0010\f\u001a\b\u0012\u0004\u0012\u00020\b0\rX\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u001c\u0010\u0003\u001a\u0004\u0018\u00010\u0004X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u000e\u0010\u000f\"\u0004\b\u0010\u0010\u0005\u00a8\u0006\u001c"}, d2 = {"Lcom/example/newsbreeze/adapter/NewsAdapter;", "Landroidx/recyclerview/widget/RecyclerView$Adapter;", "Lcom/example/newsbreeze/adapter/NewsAdapter$ViewHolder;", "viewModel", "Lcom/example/newsbreeze/ui/home/HomeViewModel;", "(Lcom/example/newsbreeze/ui/home/HomeViewModel;)V", "differ", "Landroidx/recyclerview/widget/AsyncListDiffer;", "Lcom/example/newsbreeze/model/Article;", "kotlin.jvm.PlatformType", "getDiffer", "()Landroidx/recyclerview/widget/AsyncListDiffer;", "differCallback", "Landroidx/recyclerview/widget/DiffUtil$ItemCallback;", "getViewModel", "()Lcom/example/newsbreeze/ui/home/HomeViewModel;", "setViewModel", "getItemCount", "", "onBindViewHolder", "", "holder", "position", "onCreateViewHolder", "parent", "Landroid/view/ViewGroup;", "viewType", "ViewHolder", "app_debug"})
public final class NewsAdapter extends androidx.recyclerview.widget.RecyclerView.Adapter<com.example.newsbreeze.adapter.NewsAdapter.ViewHolder> {
    @org.jetbrains.annotations.Nullable()
    private com.example.newsbreeze.ui.home.HomeViewModel viewModel;
    private final androidx.recyclerview.widget.DiffUtil.ItemCallback<com.example.newsbreeze.model.Article> differCallback = null;
    @org.jetbrains.annotations.NotNull()
    private final androidx.recyclerview.widget.AsyncListDiffer<com.example.newsbreeze.model.Article> differ = null;
    
    public NewsAdapter() {
        super();
    }
    
    public NewsAdapter(@org.jetbrains.annotations.Nullable()
    com.example.newsbreeze.ui.home.HomeViewModel viewModel) {
        super();
    }
    
    @org.jetbrains.annotations.Nullable()
    public final com.example.newsbreeze.ui.home.HomeViewModel getViewModel() {
        return null;
    }
    
    public final void setViewModel(@org.jetbrains.annotations.Nullable()
    com.example.newsbreeze.ui.home.HomeViewModel p0) {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final androidx.recyclerview.widget.AsyncListDiffer<com.example.newsbreeze.model.Article> getDiffer() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    @java.lang.Override()
    public com.example.newsbreeze.adapter.NewsAdapter.ViewHolder onCreateViewHolder(@org.jetbrains.annotations.NotNull()
    android.view.ViewGroup parent, int viewType) {
        return null;
    }
    
    @java.lang.Override()
    public void onBindViewHolder(@org.jetbrains.annotations.NotNull()
    com.example.newsbreeze.adapter.NewsAdapter.ViewHolder holder, int position) {
    }
    
    @java.lang.Override()
    public int getItemCount() {
        return 0;
    }
    
    @kotlin.Metadata(mv = {1, 6, 0}, k = 1, d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0007\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\u0002\u0010\u0004R\u0011\u0010\u0005\u001a\u00020\u0006\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\bR\u0011\u0010\t\u001a\u00020\u0006\u00a2\u0006\b\n\u0000\u001a\u0004\b\n\u0010\bR\u0011\u0010\u000b\u001a\u00020\f\u00a2\u0006\b\n\u0000\u001a\u0004\b\r\u0010\u000eR\u0011\u0010\u000f\u001a\u00020\u0010\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0011\u0010\u0012R\u0011\u0010\u0013\u001a\u00020\u0010\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0014\u0010\u0012R\u0011\u0010\u0015\u001a\u00020\u0006\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0016\u0010\b\u00a8\u0006\u0017"}, d2 = {"Lcom/example/newsbreeze/adapter/NewsAdapter$ViewHolder;", "Landroidx/recyclerview/widget/RecyclerView$ViewHolder;", "ItemView", "Landroid/view/View;", "(Landroid/view/View;)V", "ArticleDate", "Landroid/widget/TextView;", "getArticleDate", "()Landroid/widget/TextView;", "ArticleDescription", "getArticleDescription", "ArticleImg", "Landroid/widget/ImageView;", "getArticleImg", "()Landroid/widget/ImageView;", "ArticleReadBtn", "Landroid/widget/Button;", "getArticleReadBtn", "()Landroid/widget/Button;", "ArticleSaveBtn", "getArticleSaveBtn", "ArticleTitle", "getArticleTitle", "app_debug"})
    public static final class ViewHolder extends androidx.recyclerview.widget.RecyclerView.ViewHolder {
        @org.jetbrains.annotations.NotNull()
        private final android.widget.ImageView ArticleImg = null;
        @org.jetbrains.annotations.NotNull()
        private final android.widget.TextView ArticleTitle = null;
        @org.jetbrains.annotations.NotNull()
        private final android.widget.TextView ArticleDescription = null;
        @org.jetbrains.annotations.NotNull()
        private final android.widget.TextView ArticleDate = null;
        @org.jetbrains.annotations.NotNull()
        private final android.widget.Button ArticleSaveBtn = null;
        @org.jetbrains.annotations.NotNull()
        private final android.widget.Button ArticleReadBtn = null;
        
        public ViewHolder(@org.jetbrains.annotations.NotNull()
        android.view.View ItemView) {
            super(null);
        }
        
        @org.jetbrains.annotations.NotNull()
        public final android.widget.ImageView getArticleImg() {
            return null;
        }
        
        @org.jetbrains.annotations.NotNull()
        public final android.widget.TextView getArticleTitle() {
            return null;
        }
        
        @org.jetbrains.annotations.NotNull()
        public final android.widget.TextView getArticleDescription() {
            return null;
        }
        
        @org.jetbrains.annotations.NotNull()
        public final android.widget.TextView getArticleDate() {
            return null;
        }
        
        @org.jetbrains.annotations.NotNull()
        public final android.widget.Button getArticleSaveBtn() {
            return null;
        }
        
        @org.jetbrains.annotations.NotNull()
        public final android.widget.Button getArticleReadBtn() {
            return null;
        }
    }
}