package com.example.newsbreeze.repository

import com.example.newsbreeze.api.RetrofitInstance
import com.example.newsbreeze.database.ArticleDatabase

class NewsRepository( val database: ArticleDatabase ) {
    suspend fun getNews(country: String, page: Int){
        RetrofitInstance.api.getBreakingNews(country, page)
    }
}