package com.example.newsbreeze.ui.saved

import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import com.example.newsbreeze.model.Article
import com.example.newsbreeze.repository.NewsRepository
import kotlinx.coroutines.launch

class SavedViewModel(val newsRepository: NewsRepository) : ViewModel() {

    var searchResponse: MutableLiveData<List<Article>>? = MutableLiveData()

    fun getSavedNews() = newsRepository.getRoomNews()

    fun deleteNews(article: Article) = viewModelScope.launch {
        newsRepository.deleteRoomArticle(article)
    }

    fun searchSavedNews(query: String) = viewModelScope.launch {
        searchResponse?.postValue(newsRepository.searchRoomNews(query))
    }

}