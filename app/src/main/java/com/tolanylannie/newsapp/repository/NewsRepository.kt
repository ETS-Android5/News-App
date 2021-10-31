package com.tolanylannie.newsapp.repository

import com.tolanylannie.newsapp.api.RetrofitInstance
import com.tolanylannie.newsapp.database.ArticleDatabase

class NewsRepository(
    val db:ArticleDatabase
) {
    //function to get breaking news from the api
    suspend fun getBreakingNews(countryCode:String, pageNumber:Int)=
        RetrofitInstance.api.getBreakingNews(countryCode, pageNumber)
    //search function
    suspend fun searchNews(searchQuery:String,pageNumber: Int)=
        RetrofitInstance.api.searchForNews(searchQuery, pageNumber)
}