package com.example.newsbreeze.ui.home

import android.util.Log
import androidx.lifecycle.*
import com.example.newsbreeze.model.NewsResponse
import com.example.newsbreeze.repository.NewsRepository
import kotlinx.coroutines.launch
import retrofit2.Response

class HomeViewModel( val newsRepository: NewsRepository ) : ViewModel() {

//    private val _text = MutableLiveData<String>().apply {
//        value = "This is home Fragment"
//    }
//    val text: LiveData<String> = _text

    val pageNumber: Int = 1
    var response: MutableLiveData<Response<NewsResponse>>? = MutableLiveData()

    fun getNews(countryCode: String) = viewModelScope.launch{
        response?.postValue(newsRepository.getNews(countryCode,pageNumber))
//        response?.value =  newsRepository.getNews(countryCode, pageNumber)
    }
}