package com.example.newsbreeze.ui.detailed

import android.util.Log
import androidx.lifecycle.*
import com.example.newsbreeze.model.Article
import com.example.newsbreeze.model.NewsResponse
import com.example.newsbreeze.repository.NewsRepository
import kotlinx.coroutines.launch
import retrofit2.Response

class DetailedNewsViewModel() : ViewModel() {

    var pageNumber: Int = 1
    var response: MutableLiveData<Response<NewsResponse>>? = MutableLiveData()
    var searchResponse: MutableLiveData<Response<NewsResponse>>? = MutableLiveData()

}