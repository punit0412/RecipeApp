package com.example.myrecipeapp
import retrofit2.converter.gson.GsonConverterFactory
import retrofit2.create
import retrofit2.http.GET

// When your app needs to talk to a server (for example, to fetch data from an API),
// you could use lower-level tools like HttpURLConnection or OkHttp directly. But Retrofit makes this
//---------------------------------------------------------------------------------------------------
// GsonConverterFactory: Converts JSON responses into Kotlin data classes.
//create: Extension to generate Retrofit service interface.
//GET: Retrofit annotation for HTTP GET requests.
//---------------------------------------------------------------------------------------------------

private val retrofit = retrofit2.Retrofit.Builder().baseUrl("https://www.themealdb.com/api/json/v1/1/")
    .addConverterFactory(GsonConverterFactory.create())
    .build()

// This creates the Retrofit instance, which is needed to make network calls.
// Retrofit.Builder(): Starts building the Retrofit instance.
// .baseUrl(...): Sets the base URL for all API endpoints.
// .addConverterFactory(...): Tells Retrofit to use Gson for converting JSON to Kotlin objects.
// .build(): Builds the Retrofit instance.

// Creating the API Service
val recipeService = retrofit.create(ApiService::class.java)
// retrofit.create(...): Creates an implementation of your
// ApiService interface so you can call its functions.
// recipeService: This is the object you’ll use to call getCategories().


// API Service Interface

//interface ApiService: The contract that describes what network operations are available.
interface ApiService{
    @retrofit2.http.GET("categories.php")

    //@GET("categories.php"): Annotation that tells Retrofit this is a GET request to the categories.php endpoint.

    suspend fun getCategories(): CategoriesResponse

    //suspend fun getCategories(): A suspend function that can be called from a coroutine,
    // returning CategoriesResponse (a data class you'll define to match the JSON response).
}