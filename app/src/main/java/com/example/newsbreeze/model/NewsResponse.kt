package com.example.newsbreeze.model

import com.example.newsbreeze.model.Article

data class NewsResponse(
    val articles: List<Article>,
    val status: String,
    val totalResults: Int
)