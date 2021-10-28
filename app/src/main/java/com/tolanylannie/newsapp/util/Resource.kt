package com.tolanylannie.newsapp.util
/*
* This class helps with the response from the api whether they are successful or not
* */
sealed class Resource <T>(
    val data:T? = null,
    val  message:String? = null
        ){
    class Success<T>(data: T):Resource<T>(data)
    class Error<T>(message: String, data: T? =null):Resource<T>(data, message)
    class Loading<T>:Resource<T>()
}