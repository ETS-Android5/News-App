package com.tolanylannie.newsapp.ui;

import java.lang.System;

@kotlin.Metadata(mv = {1, 1, 16}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000P\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0014\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\u0002\u0010\u0004J\u000e\u0010 \u001a\u00020!2\u0006\u0010\"\u001a\u00020#J\u000e\u0010\t\u001a\u00020!2\u0006\u0010$\u001a\u00020%J\u0012\u0010&\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020#0(0\'J\u001c\u0010)\u001a\b\u0012\u0004\u0012\u00020\b0\u00072\f\u0010*\u001a\b\u0012\u0004\u0012\u00020\b0+H\u0002J\u001c\u0010,\u001a\b\u0012\u0004\u0012\u00020\b0\u00072\f\u0010*\u001a\b\u0012\u0004\u0012\u00020\b0+H\u0002J\u000e\u0010-\u001a\u00020!2\u0006\u0010\"\u001a\u00020#J\u000e\u0010\u0018\u001a\u00020!2\u0006\u0010.\u001a\u00020%R\u001d\u0010\u0005\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\b0\u00070\u0006\u00a2\u0006\b\n\u0000\u001a\u0004\b\t\u0010\nR\u001a\u0010\u000b\u001a\u00020\fX\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\r\u0010\u000e\"\u0004\b\u000f\u0010\u0010R\u001c\u0010\u0011\u001a\u0004\u0018\u00010\bX\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0012\u0010\u0013\"\u0004\b\u0014\u0010\u0015R\u0011\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0016\u0010\u0017R\u001d\u0010\u0018\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\b0\u00070\u0006\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0019\u0010\nR\u001a\u0010\u001a\u001a\u00020\fX\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u001b\u0010\u000e\"\u0004\b\u001c\u0010\u0010R\u001c\u0010\u001d\u001a\u0004\u0018\u00010\bX\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u001e\u0010\u0013\"\u0004\b\u001f\u0010\u0015\u00a8\u0006/"}, d2 = {"Lcom/tolanylannie/newsapp/ui/NewsViewModel;", "Landroidx/lifecycle/ViewModel;", "newsRepository", "Lcom/tolanylannie/newsapp/repository/NewsRepository;", "(Lcom/tolanylannie/newsapp/repository/NewsRepository;)V", "breakingNews", "Landroidx/lifecycle/MutableLiveData;", "Lcom/tolanylannie/newsapp/util/Resource;", "Lcom/tolanylannie/newsapp/model/NewsResponse;", "getBreakingNews", "()Landroidx/lifecycle/MutableLiveData;", "breakingNewsPage", "", "getBreakingNewsPage", "()I", "setBreakingNewsPage", "(I)V", "breakingNewsResponse", "getBreakingNewsResponse", "()Lcom/tolanylannie/newsapp/model/NewsResponse;", "setBreakingNewsResponse", "(Lcom/tolanylannie/newsapp/model/NewsResponse;)V", "getNewsRepository", "()Lcom/tolanylannie/newsapp/repository/NewsRepository;", "searchNews", "getSearchNews", "searchNewsPage", "getSearchNewsPage", "setSearchNewsPage", "searchNewsResponse", "getSearchNewsResponse", "setSearchNewsResponse", "deleteArticle", "Lkotlinx/coroutines/Job;", "article", "Lcom/tolanylannie/newsapp/model/Article;", "countryCode", "", "getSavedNews", "Landroidx/lifecycle/LiveData;", "", "handleBreakingNewsResponse", "response", "Lretrofit2/Response;", "handleSearchNewsResponse", "saveArticle", "searchQuery", "app_debug"})
public final class NewsViewModel extends androidx.lifecycle.ViewModel {
    @org.jetbrains.annotations.NotNull()
    private final androidx.lifecycle.MutableLiveData<com.tolanylannie.newsapp.util.Resource<com.tolanylannie.newsapp.model.NewsResponse>> breakingNews = null;
    private int breakingNewsPage = 1;
    @org.jetbrains.annotations.Nullable()
    private com.tolanylannie.newsapp.model.NewsResponse breakingNewsResponse;
    @org.jetbrains.annotations.NotNull()
    private final androidx.lifecycle.MutableLiveData<com.tolanylannie.newsapp.util.Resource<com.tolanylannie.newsapp.model.NewsResponse>> searchNews = null;
    private int searchNewsPage = 1;
    @org.jetbrains.annotations.Nullable()
    private com.tolanylannie.newsapp.model.NewsResponse searchNewsResponse;
    @org.jetbrains.annotations.NotNull()
    private final com.tolanylannie.newsapp.repository.NewsRepository newsRepository = null;
    
    @org.jetbrains.annotations.NotNull()
    public final androidx.lifecycle.MutableLiveData<com.tolanylannie.newsapp.util.Resource<com.tolanylannie.newsapp.model.NewsResponse>> getBreakingNews() {
        return null;
    }
    
    public final int getBreakingNewsPage() {
        return 0;
    }
    
    public final void setBreakingNewsPage(int p0) {
    }
    
    @org.jetbrains.annotations.Nullable()
    public final com.tolanylannie.newsapp.model.NewsResponse getBreakingNewsResponse() {
        return null;
    }
    
    public final void setBreakingNewsResponse(@org.jetbrains.annotations.Nullable()
    com.tolanylannie.newsapp.model.NewsResponse p0) {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final androidx.lifecycle.MutableLiveData<com.tolanylannie.newsapp.util.Resource<com.tolanylannie.newsapp.model.NewsResponse>> getSearchNews() {
        return null;
    }
    
    public final int getSearchNewsPage() {
        return 0;
    }
    
    public final void setSearchNewsPage(int p0) {
    }
    
    @org.jetbrains.annotations.Nullable()
    public final com.tolanylannie.newsapp.model.NewsResponse getSearchNewsResponse() {
        return null;
    }
    
    public final void setSearchNewsResponse(@org.jetbrains.annotations.Nullable()
    com.tolanylannie.newsapp.model.NewsResponse p0) {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final kotlinx.coroutines.Job getBreakingNews(@org.jetbrains.annotations.NotNull()
    java.lang.String countryCode) {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final kotlinx.coroutines.Job searchNews(@org.jetbrains.annotations.NotNull()
    java.lang.String searchQuery) {
        return null;
    }
    
    private final com.tolanylannie.newsapp.util.Resource<com.tolanylannie.newsapp.model.NewsResponse> handleBreakingNewsResponse(retrofit2.Response<com.tolanylannie.newsapp.model.NewsResponse> response) {
        return null;
    }
    
    private final com.tolanylannie.newsapp.util.Resource<com.tolanylannie.newsapp.model.NewsResponse> handleSearchNewsResponse(retrofit2.Response<com.tolanylannie.newsapp.model.NewsResponse> response) {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final kotlinx.coroutines.Job saveArticle(@org.jetbrains.annotations.NotNull()
    com.tolanylannie.newsapp.model.Article article) {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final androidx.lifecycle.LiveData<java.util.List<com.tolanylannie.newsapp.model.Article>> getSavedNews() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final kotlinx.coroutines.Job deleteArticle(@org.jetbrains.annotations.NotNull()
    com.tolanylannie.newsapp.model.Article article) {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final com.tolanylannie.newsapp.repository.NewsRepository getNewsRepository() {
        return null;
    }
    
    public NewsViewModel(@org.jetbrains.annotations.NotNull()
    com.tolanylannie.newsapp.repository.NewsRepository newsRepository) {
        super();
    }
}