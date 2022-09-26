package com.example.newsbreeze.ui.saved

import androidx.lifecycle.*
import com.example.newsbreeze.model.Article
import com.example.newsbreeze.repository.NewsRepository
import kotlinx.coroutines.launch
import retrofit2.Response

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