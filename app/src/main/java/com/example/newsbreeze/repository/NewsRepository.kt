package com.example.newsbreeze.repository

import android.util.Log
import com.example.newsbreeze.api.RetrofitInstance
import com.example.newsbreeze.database.ArticleDatabase
import com.example.newsbreeze.model.Article
import com.example.newsbreeze.model.NewsResponse
import retrofit2.Response

class NewsRepository(private val database: ArticleDatabase) {

    suspend fun getNews(country: String, page: Int): Response<NewsResponse> {
        return RetrofitInstance.api.getBreakingNews(country, page)
    }

    suspend fun getSearchedNews(query: String, page: Int): Response<NewsResponse> {
        return RetrofitInstance.api.searchNews(query, page)
    }

    fun getRoomNews() = database.getArticleDao().getArticles()

    fun isAlreadySaved(id: Int) {
        database.getArticleDao().isAlreadySaved(id)
    }

    suspend fun insertRoomArticle(article: Article) {
        Log.d("Add Room Data", article.toString())
        database.getArticleDao().insertArticle(article)
    }

    suspend fun searchRoomNews(query: String) = database.getArticleDao().searchSavedNews(query)

    suspend fun deleteRoomArticle(article: Article) =
        database.getArticleDao().deleteArticle(article)
}