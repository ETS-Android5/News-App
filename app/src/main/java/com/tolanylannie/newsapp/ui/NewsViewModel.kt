package com.tolanylannie.newsapp.ui

import androidx.lifecycle.ViewModel
import com.tolanylannie.newsapp.repository.NewsRepository

class NewsViewModel(
    val newsRepository: NewsRepository
):ViewModel() {
}