package com.tolanylannie.newsapp.ui.fragments

import android.os.Bundle
import android.util.Log
import android.view.View
import androidx.fragment.app.Fragment
import androidx.lifecycle.Observer
import androidx.recyclerview.widget.LinearLayoutManager
import com.androiddevs.mvvmnewsapp.R
import com.tolanylannie.newsapp.adapters.NewsAdapter
import com.tolanylannie.newsapp.ui.NewActivity
import com.tolanylannie.newsapp.ui.NewsViewModel
import com.tolanylannie.newsapp.util.Resource
import kotlinx.android.synthetic.main.fragment_breaking_news.*

class BreakingNewsFragment: Fragment(R.layout.fragment_breaking_news) {

    lateinit var viewModel: NewsViewModel
    lateinit var newsAdapter: NewsAdapter

    val TAG = "Breaking News Fragment"

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        viewModel =(activity as NewActivity).viewModel
        setUpRecyclerView()

        viewModel.breakingNews.observe(viewLifecycleOwner, Observer {
            response ->
            when(response){
                is Resource.Success ->{
                    hideProgressBar()
                    response.data.let { newsResponse ->
                        if (newsResponse != null) {
                            newsAdapter.differ.submitList(newsResponse.articles)
                        }
                    }
                }
                is Resource.Error->{
                    hideProgressBar()
                    response.message?.let { message ->
                        Log.e(TAG,"An error occurred: $message")
                    }
                }
                is Resource.Loading ->{
                    showProgressBar()
                }
            }
        }) //subscribe to get updates if there are changes
    }

    private fun hideProgressBar() {
        paginationProgressBar.visibility = View.INVISIBLE
    }
    private fun showProgressBar() {
        paginationProgressBar.visibility = View.VISIBLE
    }

    private fun setUpRecyclerView(){
        newsAdapter = NewsAdapter()
        rvBreakingNews.apply {
            adapter = newsAdapter
            layoutManager = LinearLayoutManager(activity)
        }
    }
}