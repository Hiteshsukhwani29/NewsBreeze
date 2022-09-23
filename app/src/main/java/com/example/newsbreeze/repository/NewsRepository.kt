package com.example.newsbreeze.repository

import android.util.Log
import androidx.lifecycle.LiveData
import com.example.newsbreeze.api.RetrofitInstance
import com.example.newsbreeze.database.ArticleDatabase
import com.example.newsbreeze.model.Article
import com.example.newsbreeze.model.NewsResponse
import retrofit2.Response

class NewsRepository(val database: ArticleDatabase) {

    suspend fun getNews(country: String, page: Int): Response<NewsResponse> {
        return RetrofitInstance.api.getBreakingNews(country, page)
    }

    suspend fun getSearchedNews(query: String, page: Int): Response<NewsResponse> {
        return RetrofitInstance.api.searchNews(query, page)
    }

    suspend fun getRoomNews(): List<Article> {
        Log.d("Room Data", database.getArticleDao().getArticles().toString())
        return database.getArticleDao().getArticles()
    }

    suspend fun insertRoomArticle(article: Article) {
        Log.d("Add Room Data", article.toString())
        database.getArticleDao().insertArticle(article)
    }

    suspend fun deleteRoomArticle(article: Article) =
        database.getArticleDao().deleteArticle(article)
}