package com.silwar.newsapp.news.domain.model

data class Article(
    val id: Long,

    val title: String,

    val description: String,

    val publishedAt: String,

    val author: String?,

    val source: Source,

    val content: String,

    val url: String,

    val imageUrl: String
)

data class Source(
    val id: String?,

    val name: String
)