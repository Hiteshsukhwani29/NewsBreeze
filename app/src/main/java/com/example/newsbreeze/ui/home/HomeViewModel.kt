package com.example.newsbreeze.ui.home

import android.util.Log
import androidx.lifecycle.*
import com.example.newsbreeze.model.NewsResponse
import com.example.newsbreeze.repository.NewsRepository
import kotlinx.coroutines.launch

class HomeViewModel( val newsRepository: NewsRepository ) : ViewModel() {

//    private val _text = MutableLiveData<String>().apply {
//        value = "This is home Fragment"
//    }
//    val text: LiveData<String> = _text

    val pageNumber: Int = 1

    fun getNews(countryCode: String) = viewModelScope.launch{
        val response = newsRepository.getNews(countryCode, pageNumber)
        Log.d("Response",response.body().toString())
    }
}