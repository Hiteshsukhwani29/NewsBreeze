package com.example.newsbreeze.ui.home

import android.util.Log
import androidx.lifecycle.*
import com.example.newsbreeze.model.Article
import com.example.newsbreeze.model.NewsResponse
import com.example.newsbreeze.repository.NewsRepository
import kotlinx.coroutines.launch
import retrofit2.Response

class HomeViewModel(val newsRepository: NewsRepository) : ViewModel() {

    var pageNumber: Int = 1
    var response: MutableLiveData<Response<NewsResponse>>? = MutableLiveData()
    var searchResponse: MutableLiveData<Response<NewsResponse>>? = MutableLiveData()

    fun getNews(countryCode: String) = viewModelScope.launch {
        response?.postValue(newsRepository.getNews(countryCode, pageNumber))
    }

    fun getSearchedNews(query: String) = viewModelScope.launch {
        searchResponse?.postValue(newsRepository.getSearchedNews(query, pageNumber))
    }

    fun saveNews(article: Article) = viewModelScope.launch {
        newsRepository.insertRoomArticle(article)
        Log.d("working", "working")
    }

    fun deleteNews(article: Article) = viewModelScope.launch {
        newsRepository.deleteRoomArticle(article)
    }

}