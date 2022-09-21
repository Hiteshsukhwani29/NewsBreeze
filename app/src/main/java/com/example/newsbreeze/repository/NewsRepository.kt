package com.example.newsbreeze.repository

import com.example.newsbreeze.api.RetrofitInstance
import com.example.newsbreeze.database.ArticleDatabase
import com.example.newsbreeze.model.NewsResponse
import retrofit2.Response

class NewsRepository( val database: ArticleDatabase ) {
    suspend fun getNews(country: String, page: Int): Response<NewsResponse> {
       return RetrofitInstance.api.getBreakingNews(country, page)
    }
    suspend fun getSearchedNews(query: String, page: Int): Response<NewsResponse> {
        return RetrofitInstance.api.searchNews(query, page)
    }
}