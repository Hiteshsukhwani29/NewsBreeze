package com.example.newsbreeze.ui.saved;

import java.lang.System;

@kotlin.Metadata(mv = {1, 6, 0}, k = 1, d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\u0002\u0010\u0004J\u000e\u0010\u000f\u001a\u00020\u00102\u0006\u0010\u0011\u001a\u00020\nJ\u0012\u0010\u0012\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\n0\t0\u0013J\u000e\u0010\u0014\u001a\u00020\u00102\u0006\u0010\u0015\u001a\u00020\u0016R\u0011\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0005\u0010\u0006R(\u0010\u0007\u001a\u0010\u0012\n\u0012\b\u0012\u0004\u0012\u00020\n0\t\u0018\u00010\bX\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u000b\u0010\f\"\u0004\b\r\u0010\u000e\u00a8\u0006\u0017"}, d2 = {"Lcom/example/newsbreeze/ui/saved/SavedViewModel;", "Landroidx/lifecycle/ViewModel;", "newsRepository", "Lcom/example/newsbreeze/repository/NewsRepository;", "(Lcom/example/newsbreeze/repository/NewsRepository;)V", "getNewsRepository", "()Lcom/example/newsbreeze/repository/NewsRepository;", "searchResponse", "Landroidx/lifecycle/MutableLiveData;", "", "Lcom/example/newsbreeze/model/Article;", "getSearchResponse", "()Landroidx/lifecycle/MutableLiveData;", "setSearchResponse", "(Landroidx/lifecycle/MutableLiveData;)V", "deleteNews", "Lkotlinx/coroutines/Job;", "article", "getSavedNews", "Landroidx/lifecycle/LiveData;", "searchSavedNews", "query", "", "app_debug"})
public final class SavedViewModel extends androidx.lifecycle.ViewModel {
    @org.jetbrains.annotations.NotNull()
    private final com.example.newsbreeze.repository.NewsRepository newsRepository = null;
    @org.jetbrains.annotations.Nullable()
    private androidx.lifecycle.MutableLiveData<java.util.List<com.example.newsbreeze.model.Article>> searchResponse;
    
    public SavedViewModel(@org.jetbrains.annotations.NotNull()
    com.example.newsbreeze.repository.NewsRepository newsRepository) {
        super();
    }
    
    @org.jetbrains.annotations.NotNull()
    public final com.example.newsbreeze.repository.NewsRepository getNewsRepository() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final androidx.lifecycle.MutableLiveData<java.util.List<com.example.newsbreeze.model.Article>> getSearchResponse() {
        return null;
    }
    
    public final void setSearchResponse(@org.jetbrains.annotations.Nullable()
    androidx.lifecycle.MutableLiveData<java.util.List<com.example.newsbreeze.model.Article>> p0) {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final androidx.lifecycle.LiveData<java.util.List<com.example.newsbreeze.model.Article>> getSavedNews() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final kotlinx.coroutines.Job deleteNews(@org.jetbrains.annotations.NotNull()
    com.example.newsbreeze.model.Article article) {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final kotlinx.coroutines.Job searchSavedNews(@org.jetbrains.annotations.NotNull()
    java.lang.String query) {
        return null;
    }
}