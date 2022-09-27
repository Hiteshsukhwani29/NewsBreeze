package com.example.newsbreeze.repository;

import java.lang.System;

@kotlin.Metadata(mv = {1, 6, 0}, k = 1, d1 = {"\u0000D\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\b\b\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\u0002\u0010\u0004J\u0019\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\bH\u0086@\u00f8\u0001\u0000\u00a2\u0006\u0002\u0010\tJ\'\u0010\n\u001a\b\u0012\u0004\u0012\u00020\f0\u000b2\u0006\u0010\r\u001a\u00020\u000e2\u0006\u0010\u000f\u001a\u00020\u0010H\u0086@\u00f8\u0001\u0000\u00a2\u0006\u0002\u0010\u0011J\u0012\u0010\u0012\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\b0\u00140\u0013J\'\u0010\u0015\u001a\b\u0012\u0004\u0012\u00020\f0\u000b2\u0006\u0010\u0016\u001a\u00020\u000e2\u0006\u0010\u000f\u001a\u00020\u0010H\u0086@\u00f8\u0001\u0000\u00a2\u0006\u0002\u0010\u0011J\u0019\u0010\u0017\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\bH\u0086@\u00f8\u0001\u0000\u00a2\u0006\u0002\u0010\tJ\u000e\u0010\u0018\u001a\u00020\u00062\u0006\u0010\u0019\u001a\u00020\u0010J\u001f\u0010\u001a\u001a\b\u0012\u0004\u0012\u00020\b0\u00142\u0006\u0010\u0016\u001a\u00020\u000eH\u0086@\u00f8\u0001\u0000\u00a2\u0006\u0002\u0010\u001bR\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004\u00a2\u0006\u0002\n\u0000\u0082\u0002\u0004\n\u0002\b\u0019\u00a8\u0006\u001c"}, d2 = {"Lcom/example/newsbreeze/repository/NewsRepository;", "", "database", "Lcom/example/newsbreeze/database/ArticleDatabase;", "(Lcom/example/newsbreeze/database/ArticleDatabase;)V", "deleteRoomArticle", "", "article", "Lcom/example/newsbreeze/model/Article;", "(Lcom/example/newsbreeze/model/Article;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "getNews", "Lretrofit2/Response;", "Lcom/example/newsbreeze/model/NewsResponse;", "country", "", "page", "", "(Ljava/lang/String;ILkotlin/coroutines/Continuation;)Ljava/lang/Object;", "getRoomNews", "Landroidx/lifecycle/LiveData;", "", "getSearchedNews", "query", "insertRoomArticle", "isAlreadySaved", "id", "searchRoomNews", "(Ljava/lang/String;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "app_debug"})
public final class NewsRepository {
    private final com.example.newsbreeze.database.ArticleDatabase database = null;
    
    public NewsRepository(@org.jetbrains.annotations.NotNull()
    com.example.newsbreeze.database.ArticleDatabase database) {
        super();
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.Object getNews(@org.jetbrains.annotations.NotNull()
    java.lang.String country, int page, @org.jetbrains.annotations.NotNull()
    kotlin.coroutines.Continuation<? super retrofit2.Response<com.example.newsbreeze.model.NewsResponse>> continuation) {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.Object getSearchedNews(@org.jetbrains.annotations.NotNull()
    java.lang.String query, int page, @org.jetbrains.annotations.NotNull()
    kotlin.coroutines.Continuation<? super retrofit2.Response<com.example.newsbreeze.model.NewsResponse>> continuation) {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final androidx.lifecycle.LiveData<java.util.List<com.example.newsbreeze.model.Article>> getRoomNews() {
        return null;
    }
    
    public final void isAlreadySaved(int id) {
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.Object insertRoomArticle(@org.jetbrains.annotations.NotNull()
    com.example.newsbreeze.model.Article article, @org.jetbrains.annotations.NotNull()
    kotlin.coroutines.Continuation<? super kotlin.Unit> continuation) {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.Object searchRoomNews(@org.jetbrains.annotations.NotNull()
    java.lang.String query, @org.jetbrains.annotations.NotNull()
    kotlin.coroutines.Continuation<? super java.util.List<com.example.newsbreeze.model.Article>> continuation) {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.Object deleteRoomArticle(@org.jetbrains.annotations.NotNull()
    com.example.newsbreeze.model.Article article, @org.jetbrains.annotations.NotNull()
    kotlin.coroutines.Continuation<? super kotlin.Unit> continuation) {
        return null;
    }
}