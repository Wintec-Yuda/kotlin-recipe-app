package com.yuda.recipeapp.ui.pages

import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.lazy.items
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Text
import androidx.compose.material3.TopAppBar
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import com.yuda.recipeapp.data.model.Recipe
import com.yuda.recipeapp.model.sampleRecipes
import com.yuda.recipeapp.ui.components.RecipeCard

@OptIn(ExperimentalMaterial3Api::class)
@Composable
fun RecipePage(onRecipeClick: (Recipe) -> Unit) {
    Scaffold (
        topBar = {
            TopAppBar(title = { Text("Recipe App") })
        }
    ) { innerPadding ->
        LazyColumn (
            modifier = Modifier.fillMaxSize()
                .padding(innerPadding),
        ) {
            items(sampleRecipes) { recipe ->
                RecipeCard(recipe, onRecipeClick)
            }
        }
    }
}