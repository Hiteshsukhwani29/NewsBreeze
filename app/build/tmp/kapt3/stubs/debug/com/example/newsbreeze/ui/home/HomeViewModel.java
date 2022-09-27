package com.example.newsbreeze.ui.home;

import java.lang.System;

@kotlin.Metadata(mv = {1, 6, 0}, k = 1, d1 = {"\u0000D\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0007\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\u0002\u0010\u0004J\u000e\u0010\u001a\u001a\u00020\u001b2\u0006\u0010\u001c\u001a\u00020\u001dJ\u000e\u0010\u001e\u001a\u00020\u001b2\u0006\u0010\u001f\u001a\u00020\u001dJ\u000e\u0010 \u001a\u00020\u001b2\u0006\u0010!\u001a\u00020\u000eJ\u000e\u0010\"\u001a\u00020\u001b2\u0006\u0010#\u001a\u00020$R\u001a\u0010\u0005\u001a\u00020\u0006X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0007\u0010\b\"\u0004\b\t\u0010\nR\u0011\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\fR\u000e\u0010\r\u001a\u00020\u000eX\u0082\u000e\u00a2\u0006\u0002\n\u0000R(\u0010\u000f\u001a\u0010\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00120\u0011\u0018\u00010\u0010X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0013\u0010\u0014\"\u0004\b\u0015\u0010\u0016R(\u0010\u0017\u001a\u0010\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00120\u0011\u0018\u00010\u0010X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0018\u0010\u0014\"\u0004\b\u0019\u0010\u0016\u00a8\u0006%"}, d2 = {"Lcom/example/newsbreeze/ui/home/HomeViewModel;", "Landroidx/lifecycle/ViewModel;", "newsRepository", "Lcom/example/newsbreeze/repository/NewsRepository;", "(Lcom/example/newsbreeze/repository/NewsRepository;)V", "alreadySaved", "", "getAlreadySaved", "()Z", "setAlreadySaved", "(Z)V", "getNewsRepository", "()Lcom/example/newsbreeze/repository/NewsRepository;", "pageNumber", "", "response", "Landroidx/lifecycle/MutableLiveData;", "Lretrofit2/Response;", "Lcom/example/newsbreeze/model/NewsResponse;", "getResponse", "()Landroidx/lifecycle/MutableLiveData;", "setResponse", "(Landroidx/lifecycle/MutableLiveData;)V", "searchResponse", "getSearchResponse", "setSearchResponse", "getNews", "Lkotlinx/coroutines/Job;", "countryCode", "", "getSearchedNews", "query", "isAlreadySaved", "id", "saveNews", "article", "Lcom/example/newsbreeze/model/Article;", "app_debug"})
public final class HomeViewModel extends androidx.lifecycle.ViewModel {
    @org.jetbrains.annotations.NotNull()
    private final com.example.newsbreeze.repository.NewsRepository newsRepository = null;
    private int pageNumber = 1;
    @org.jetbrains.annotations.Nullable()
    private androidx.lifecycle.MutableLiveData<retrofit2.Response<com.example.newsbreeze.model.NewsResponse>> response;
    @org.jetbrains.annotations.Nullable()
    private androidx.lifecycle.MutableLiveData<retrofit2.Response<com.example.newsbreeze.model.NewsResponse>> searchResponse;
    private boolean alreadySaved = false;
    
    public HomeViewModel(@org.jetbrains.annotations.NotNull()
    com.example.newsbreeze.repository.NewsRepository newsRepository) {
        super();
    }
    
    @org.jetbrains.annotations.NotNull()
    public final com.example.newsbreeze.repository.NewsRepository getNewsRepository() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final androidx.lifecycle.MutableLiveData<retrofit2.Response<com.example.newsbreeze.model.NewsResponse>> getResponse() {
        return null;
    }
    
    public final void setResponse(@org.jetbrains.annotations.Nullable()
    androidx.lifecycle.MutableLiveData<retrofit2.Response<com.example.newsbreeze.model.NewsResponse>> p0) {
    }
    
    @org.jetbrains.annotations.Nullable()
    public final androidx.lifecycle.MutableLiveData<retrofit2.Response<com.example.newsbreeze.model.NewsResponse>> getSearchResponse() {
        return null;
    }
    
    public final void setSearchResponse(@org.jetbrains.annotations.Nullable()
    androidx.lifecycle.MutableLiveData<retrofit2.Response<com.example.newsbreeze.model.NewsResponse>> p0) {
    }
    
    public final boolean getAlreadySaved() {
        return false;
    }
    
    public final void setAlreadySaved(boolean p0) {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final kotlinx.coroutines.Job getNews(@org.jetbrains.annotations.NotNull()
    java.lang.String countryCode) {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final kotlinx.coroutines.Job getSearchedNews(@org.jetbrains.annotations.NotNull()
    java.lang.String query) {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final kotlinx.coroutines.Job saveNews(@org.jetbrains.annotations.NotNull()
    com.example.newsbreeze.model.Article article) {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final kotlinx.coroutines.Job isAlreadySaved(int id) {
        return null;
    }
}