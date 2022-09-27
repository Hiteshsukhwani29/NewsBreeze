package com.example.newsbreeze.ui.detailed;

import java.lang.System;

@kotlin.Metadata(mv = {1, 6, 0}, k = 1, d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0013\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\u0002\u0010\u0004J\u000e\u0010\u0019\u001a\u00020\u001a2\u0006\u0010\u001b\u001a\u00020\u001cJ\u000e\u0010\u001d\u001a\u00020\u001e2\u0006\u0010\u001b\u001a\u00020\u001cR\u001c\u0010\u0005\u001a\u0004\u0018\u00010\u0006X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0007\u0010\b\"\u0004\b\t\u0010\nR\u001c\u0010\u000b\u001a\u0004\u0018\u00010\u0006X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\f\u0010\b\"\u0004\b\r\u0010\nR\u001c\u0010\u000e\u001a\u0004\u0018\u00010\u0006X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u000f\u0010\b\"\u0004\b\u0010\u0010\nR\u001c\u0010\u0011\u001a\u0004\u0018\u00010\u0006X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0012\u0010\b\"\u0004\b\u0013\u0010\nR\u001c\u0010\u0014\u001a\u0004\u0018\u00010\u0006X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0015\u0010\b\"\u0004\b\u0016\u0010\nR\u0011\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0017\u0010\u0018\u00a8\u0006\u001f"}, d2 = {"Lcom/example/newsbreeze/ui/detailed/DetailedNewsViewModel;", "Landroidx/lifecycle/ViewModel;", "newsRepository", "Lcom/example/newsbreeze/repository/NewsRepository;", "(Lcom/example/newsbreeze/repository/NewsRepository;)V", "articleAuthor", "", "getArticleAuthor", "()Ljava/lang/String;", "setArticleAuthor", "(Ljava/lang/String;)V", "articleContent", "getArticleContent", "setArticleContent", "articleDate", "getArticleDate", "setArticleDate", "articleImgUrl", "getArticleImgUrl", "setArticleImgUrl", "articleTitle", "getArticleTitle", "setArticleTitle", "getNewsRepository", "()Lcom/example/newsbreeze/repository/NewsRepository;", "saveNews", "Lkotlinx/coroutines/Job;", "article", "Lcom/example/newsbreeze/model/Article;", "setDetailedArticle", "", "app_debug"})
public final class DetailedNewsViewModel extends androidx.lifecycle.ViewModel {
    @org.jetbrains.annotations.NotNull()
    private final com.example.newsbreeze.repository.NewsRepository newsRepository = null;
    @org.jetbrains.annotations.Nullable()
    private java.lang.String articleDate;
    @org.jetbrains.annotations.Nullable()
    private java.lang.String articleTitle;
    @org.jetbrains.annotations.Nullable()
    private java.lang.String articleContent;
    @org.jetbrains.annotations.Nullable()
    private java.lang.String articleAuthor;
    @org.jetbrains.annotations.Nullable()
    private java.lang.String articleImgUrl;
    
    public DetailedNewsViewModel(@org.jetbrains.annotations.NotNull()
    com.example.newsbreeze.repository.NewsRepository newsRepository) {
        super();
    }
    
    @org.jetbrains.annotations.NotNull()
    public final com.example.newsbreeze.repository.NewsRepository getNewsRepository() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.String getArticleDate() {
        return null;
    }
    
    public final void setArticleDate(@org.jetbrains.annotations.Nullable()
    java.lang.String p0) {
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.String getArticleTitle() {
        return null;
    }
    
    public final void setArticleTitle(@org.jetbrains.annotations.Nullable()
    java.lang.String p0) {
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.String getArticleContent() {
        return null;
    }
    
    public final void setArticleContent(@org.jetbrains.annotations.Nullable()
    java.lang.String p0) {
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.String getArticleAuthor() {
        return null;
    }
    
    public final void setArticleAuthor(@org.jetbrains.annotations.Nullable()
    java.lang.String p0) {
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.String getArticleImgUrl() {
        return null;
    }
    
    public final void setArticleImgUrl(@org.jetbrains.annotations.Nullable()
    java.lang.String p0) {
    }
    
    public final void setDetailedArticle(@org.jetbrains.annotations.NotNull()
    com.example.newsbreeze.model.Article article) {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final kotlinx.coroutines.Job saveNews(@org.jetbrains.annotations.NotNull()
    com.example.newsbreeze.model.Article article) {
        return null;
    }
}