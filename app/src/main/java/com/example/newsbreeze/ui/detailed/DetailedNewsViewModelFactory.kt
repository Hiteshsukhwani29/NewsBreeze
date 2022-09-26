package com.example.newsbreeze.ui.detailed

import androidx.lifecycle.ViewModel
import androidx.lifecycle.ViewModelProvider
import com.example.newsbreeze.repository.NewsRepository
import com.example.newsbreeze.ui.detailed.DetailedNewsViewModel

class DetailedNewsViewModelFactory(val newsRepository: NewsRepository ): ViewModelProvider.Factory {
    override fun <T : ViewModel> create(modelClass: Class<T>): T {
        if (modelClass.isAssignableFrom(DetailedNewsViewModel::class.java)) {
            return DetailedNewsViewModel(newsRepository) as T
        }
        throw IllegalArgumentException("Unknown ViewModel class")
    }
}