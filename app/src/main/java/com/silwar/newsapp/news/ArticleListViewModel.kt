package com.silwar.newsapp.news

import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import com.silwar.newsapp.news.domain.model.Article

class ArticleListViewModel : ViewModel() {

    private val articles: MutableLiveData<List<Article>> by lazy {
        MutableLiveData<List<Article>>().also {
            loadArticles()
        }
    }

    fun getArticles(): LiveData<List<Article>> {
        return articles
    }
    private fun loadArticles(): List<Article> {
        return listOf()
    }
}