package com.tolanylannie.newsapp.ui.fragments

import android.os.Bundle
import android.os.Parcelable
import androidx.navigation.NavDirections
import com.androiddevs.mvvmnewsapp.R
import com.tolanylannie.newsapp.model.Article
import java.io.Serializable
import java.lang.UnsupportedOperationException
import kotlin.Int
import kotlin.Suppress

class BreakingNewsFragmentDirections private constructor() {
  private data class ActionBreakingNewsFragmentToArticleFragment(
    val article: Article
  ) : NavDirections {
    override fun getActionId(): Int = R.id.action_breakingNewsFragment_to_articleFragment

    @Suppress("CAST_NEVER_SUCCEEDS")
    override fun getArguments(): Bundle {
      val result = Bundle()
      if (Parcelable::class.java.isAssignableFrom(Article::class.java)) {
        result.putParcelable("article", this.article as Parcelable)
      } else if (Serializable::class.java.isAssignableFrom(Article::class.java)) {
        result.putSerializable("article", this.article as Serializable)
      } else {
        throw UnsupportedOperationException(Article::class.java.name +
            " must implement Parcelable or Serializable or must be an Enum.")
      }
      return result
    }
  }

  companion object {
    fun actionBreakingNewsFragmentToArticleFragment(article: Article): NavDirections =
        ActionBreakingNewsFragmentToArticleFragment(article)
  }
}
