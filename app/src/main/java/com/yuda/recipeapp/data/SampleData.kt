package com.yuda.recipeapp.model

import com.yuda.recipeapp.data.model.Recipe

val sampleRecipes = listOf(
    Recipe(
        id = 1,
        title = "Spaghetti Carbonara",
        description = "A classic Italian pasta dish made with eggs, cheese, pancetta, and pepper.",
        ingredients = listOf("Spaghetti", "Pancetta", "Eggs", "Parmesan cheese", "Black pepper"),
        intructions = "Boil the pasta. In a separate pan, cook the pancetta. Mix eggs and cheese together. Combine all ingredients and toss with pasta."
    ),
    Recipe(
        id = 2,
        title = "Chicken Salad",
        description = "A refreshing salad with grilled chicken, vegetables, and a light dressing.",
        ingredients = listOf("Chicken breast", "Lettuce", "Tomato", "Cucumber", "Olive oil", "Lemon"),
        intructions = "Grill the chicken. Chop the vegetables. Mix everything together in a bowl and drizzle with olive oil and lemon."
    ),
    Recipe(
        id = 3,
        title = "Pancakes",
        description = "Fluffy pancakes perfect for breakfast, served with maple syrup.",
        ingredients = listOf("Flour", "Eggs", "Milk", "Butter", "Baking powder", "Maple syrup"),
        intructions = "Mix all ingredients to form a batter. Heat a pan and cook the pancakes until golden. Serve with maple syrup."
    ),
    Recipe(
        id = 4,
        title = "Caesar Salad",
        description = "A classic Caesar salad with crispy croutons, parmesan, and a tangy dressing.",
        ingredients = listOf("Romaine lettuce", "Parmesan cheese", "Croutons", "Caesar dressing"),
        intructions = "Toss the lettuce with Caesar dressing. Add croutons and parmesan cheese."
    ),
    Recipe(
        id = 5,
        title = "Grilled Cheese Sandwich",
        description = "A simple and comforting grilled sandwich with melted cheese.",
        ingredients = listOf("Bread", "Cheese", "Butter"),
        intructions = "Butter the bread and place cheese in between. Grill in a pan until golden brown."
    ),
    Recipe(
        id = 6,
        title = "Chicken Curry",
        description = "A rich and flavorful chicken curry with spices and coconut milk.",
        ingredients = listOf("Chicken", "Coconut milk", "Curry powder", "Onions", "Tomatoes", "Garlic"),
        intructions = "Cook the chicken and onions. Add spices and tomatoes. Pour in coconut milk and simmer until cooked."
    ),
    Recipe(
        id = 7,
        title = "Vegetable Stir-fry",
        description = "A quick and healthy stir-fry with mixed vegetables and soy sauce.",
        ingredients = listOf("Broccoli", "Carrots", "Bell peppers", "Soy sauce", "Garlic"),
        intructions = "Stir-fry the vegetables with garlic. Add soy sauce and cook until tender."
    ),
    Recipe(
        id = 8,
        title = "Beef Tacos",
        description = "Soft tacos filled with seasoned ground beef, lettuce, and cheese.",
        ingredients = listOf("Ground beef", "Taco shells", "Lettuce", "Cheese", "Sour cream"),
        intructions = "Cook the ground beef with taco seasoning. Fill the taco shells with beef, lettuce, and cheese."
    ),
    Recipe(
        id = 9,
        title = "Chocolate Cake",
        description = "A rich and moist chocolate cake with creamy frosting.",
        ingredients = listOf("Flour", "Cocoa powder", "Sugar", "Eggs", "Butter", "Chocolate chips"),
        intructions = "Mix the dry ingredients and wet ingredients. Bake the batter and frost with chocolate frosting."
    ),
    Recipe(
        id = 10,
        title = "Tomato Soup",
        description = "A warm and comforting soup made with tomatoes and cream.",
        ingredients = listOf("Tomatoes", "Onions", "Garlic", "Cream", "Basil"),
        intructions = "Cook the onions and garlic. Add tomatoes and simmer. Blend until smooth and add cream."
    )
)
