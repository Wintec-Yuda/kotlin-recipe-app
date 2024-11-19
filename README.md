# Recipe App

This is a simple Jetpack Compose-based Android application that demonstrates a recipe browsing experience. The app allows users to view a list of recipes, select one to see its details, and navigate back to the main list.

---

## Features

- **Recipe List**: Browse a collection of sample recipes displayed in a scrollable list.
- **Recipe Details**: View detailed information about the selected recipe, including its ingredients and instructions.
- **Back Navigation**: Return to the recipe list with a single tap on the back button.

---

## Screenshots

(Include screenshots of the app here, if available.)

---

## Requirements

- **Android Studio**: Arctic Fox (2020.3.1) or newer.
- **Kotlin**: 1.5 or newer.
- **Jetpack Compose**: Material 3 APIs.

---

## Installation

1. Clone this repository:
   ```bash
   git clone https://github.com/yourusername/recipe-app.git
    ```
2. Open the project in Android Studio.
3. Sync the project with Gradle files.
4. Run the app on an emulator or physical device.

## How It Works

## Main Features:

### Recipe List:
- Displays recipes in a scrollable list using LazyColumn.
- Clicking a recipe navigates to the detail page.
### Recipe Details:
- Shows the title, list of ingredients, and cooking instructions.
- Includes a back button for returning to the list.
### Key Components:
- RecipePage: Displays the list of recipes.
- RecipeCard: A reusable card component for individual recipes.
- RecipeDetailPage: Displays detailed information about the selected recipe.

## Example Data Structure
```kotlin
data class Recipe(
    val title: String,
    val ingredients: List<String>,
    val instructions: String
)
```
