package com.example.newsbreeze.ui.saved

import android.util.Log
import androidx.lifecycle.*
import com.example.newsbreeze.model.Article
import com.example.newsbreeze.model.NewsResponse
import com.example.newsbreeze.repository.NewsRepository
import kotlinx.coroutines.launch
import retrofit2.Response

class SavedViewModel(val newsRepository: NewsRepository) : ViewModel() {

    fun getSavedNews() = newsRepository.getRoomNews()

    fun deleteNews(article: Article) = viewModelScope.launch {
        newsRepository.deleteRoomArticle(article)
    }

}