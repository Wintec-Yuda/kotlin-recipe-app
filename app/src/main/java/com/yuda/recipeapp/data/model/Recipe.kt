package com.yuda.recipeapp.data.model

data class Recipe(
    val id: Int,
    val title: String,
    val description: String,
    val ingredients: List<String>,
    val intructions: String
)
