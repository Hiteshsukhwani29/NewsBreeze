package com.example.newsbreeze.database

import androidx.room.Delete
import androidx.room.Insert
import androidx.room.OnConflictStrategy
import androidx.room.Query
import com.example.newsbreeze.model.Article
import kotlinx.coroutines.flow.StateFlow

interface ArticeDao {

    @Insert(onConflict = OnConflictStrategy.REPLACE)
    suspend fun insertArticle(article: Article): Long

    @Query("SELECT * FROM articles")
    suspend fun getArticles(): StateFlow<List<Article>>

    @Delete
    suspend fun deleteArticle(article: Article)
}