package com.example.newsbreeze.ui.detailed

import android.util.Log
import androidx.lifecycle.*
import com.example.newsbreeze.model.Article
import com.example.newsbreeze.repository.NewsRepository
import kotlinx.coroutines.launch

class DetailedNewsViewModel( val newsRepository: NewsRepository ) : ViewModel() {

    var articleDate: String? = null
    var articleTitle: String? = null
    var articleContent: String? = null
    var articleAuthor: String? = null
    var articleImgUrl: String? = null

    fun setDetailedArticle( article: Article ) {
        this.articleDate = article.publishedAt
        this.articleTitle = article.title
        this.articleAuthor = article.author
        this.articleImgUrl = article.urlToImage
        this.articleContent = article.content
    }

    fun saveNews(article: Article) = viewModelScope.launch {
        newsRepository.insertRoomArticle(article)
        Log.d("working", "working")
    }

}