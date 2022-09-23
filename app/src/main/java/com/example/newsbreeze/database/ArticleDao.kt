package com.example.newsbreeze.database

import androidx.lifecycle.LiveData
import androidx.room.*
import com.example.newsbreeze.model.Article
import kotlinx.coroutines.flow.StateFlow

@Dao
interface ArticleDao {

    @Insert(onConflict = OnConflictStrategy.REPLACE)
    suspend fun insertArticle(article: Article): Long

    @Query("SELECT * FROM articles")
    suspend fun getArticles(): List<Article>

    @Delete
    suspend fun deleteArticle(article: Article)
}