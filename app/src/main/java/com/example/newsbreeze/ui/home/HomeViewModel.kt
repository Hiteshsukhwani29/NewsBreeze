package com.example.newsbreeze.ui.home

import android.util.Log
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import com.example.newsbreeze.model.Article
import com.example.newsbreeze.model.NewsResponse
import com.example.newsbreeze.repository.NewsRepository
import kotlinx.coroutines.launch
import retrofit2.Response

class HomeViewModel(val newsRepository: NewsRepository) : ViewModel() {

    private var pageNumber: Int = 1
    var response: MutableLiveData<Response<NewsResponse>>? = MutableLiveData()
    var searchResponse: MutableLiveData<Response<NewsResponse>>? = MutableLiveData()
    var alreadySaved: Boolean = false

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

    fun isAlreadySaved(id: Int) = viewModelScope.launch {
        newsRepository.isAlreadySaved(id)
    }

}