package com.tolanylannie.newsapp.ui

import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import com.tolanylannie.newsapp.model.NewsResponse
import com.tolanylannie.newsapp.repository.NewsRepository
import kotlinx.coroutines.launch
import com.tolanylannie.newsapp.util.Resource
import retrofit2.Response

class NewsViewModel(
    val newsRepository: NewsRepository
):ViewModel() {

    val breakingNews:MutableLiveData<com.tolanylannie.newsapp.util.Resource<NewsResponse>> = MutableLiveData()
    var breakingNewsPage =1


    init {
        getBreakingNews("za")
    }
    fun getBreakingNews(countryCode:String) = viewModelScope.launch {
        //emit loading state
        breakingNews.postValue(Resource.Loading())
        val response = newsRepository.getBreakingNews(countryCode, breakingNewsPage)
        breakingNews.postValue(handleBreakingNewsResponse(response))
    }

    private fun handleBreakingNewsResponse(response: Response<NewsResponse>):Resource<NewsResponse>{
        if(response.isSuccessful){
            response.body()?.let { resultResponse ->
                return Resource.Success(resultResponse)
            }
        }
        return Resource.Error(response.message())
    }

}