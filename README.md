# RecipeApp

# 🍽️ MealDB Menu App

This is a simple Android app built using **Kotlin** and **Jetpack Compose** that fetches meal categories from the [MealDB API](https://www.themealdb.com/api.php) and displays them in a clean, scrollable UI.

## 📱 App Overview

The app connects to the MealDB REST API and fetches a list of meal categories. It uses:
- **Retrofit** for networking
- **Gson** for JSON parsing
- **ViewModel + State** for state management
- **Jetpack Compose** for UI
- **Coil** for image loading

### Features:
- Displays a list of meal categories
- Loads category images dynamically
- Handles screen rotation without losing data (ViewModel)
- Modern, declarative UI using Compose

## 🖼️ App Screenshots
![image](https://github.com/user-attachments/assets/49a61cfe-6528-490f-9e82-41fe8e7d7489)

## 📦 API Used

[TheMealDB API](https://www.themealdb.com/api.php)  
Endpoint used: `https://www.themealdb.com/api/json/v1/1/categories.php`
