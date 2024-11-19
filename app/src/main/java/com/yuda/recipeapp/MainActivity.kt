package com.yuda.recipeapp

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import androidx.compose.runtime.Composable
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import com.yuda.recipeapp.data.model.Recipe
import com.yuda.recipeapp.ui.pages.RecipeDetailPage
import com.yuda.recipeapp.ui.pages.RecipePage
import com.yuda.recipeapp.ui.theme.RecipeAppTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContent {
            RecipeAppTheme {
                MainContent()
            }
        }
    }
}

@Composable
fun MainContent() {
    val selectedRecipe = remember { mutableStateOf<Recipe?>(null) }

    if (selectedRecipe.value == null) {
        RecipePage(onRecipeClick = { recipe ->
            selectedRecipe.value = recipe
        })
    } else {
        RecipeDetailPage(
            recipe = selectedRecipe.value!!,
            onBack = { selectedRecipe.value = null }
        )
    }
}
