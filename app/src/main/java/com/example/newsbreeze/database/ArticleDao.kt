package com.example.newsbreeze.database

import android.util.Log
import androidx.lifecycle.LiveData
import androidx.room.*
import com.example.newsbreeze.model.Article
import kotlinx.coroutines.flow.StateFlow

@Dao
interface ArticleDao {

    @Insert(onConflict = OnConflictStrategy.REPLACE)
    suspend fun insertArticle(article: Article): Long

    @Query("SELECT * FROM articles")
    fun getArticles(): LiveData<List<Article>>

    @Query("SELECT EXISTS (SELECT 1 FROM articles WHERE id = :id)")
    fun isAlreadySaved(id: Int) {
        Log.d("already saved",id.toString())
    }

    @Query("SELECT * FROM articles WHERE title LIKE :query")
    suspend fun searchSavedNews(query: String): List<Article>

    @Delete
    suspend fun deleteArticle(article: Article)
}