package com.tolanylannie.newsapp.database

import androidx.lifecycle.LiveData
import androidx.room.*
import com.tolanylannie.newsapp.model.Article

@Dao
interface ArticleDao {
    @Insert(onConflict = OnConflictStrategy.REPLACE)
    //upsert is the same as insert and update
    suspend fun upsert(article: Article):Long

    //query to return all available articles
    @Query("SELECT * FROM article")
    fun getALLArticles(): LiveData<List<Article>>

    //delete article
    @Delete
    suspend fun deleteArticle(article: Article)
}