package com.example.network.models.retrofitnetworkcall

import com.example.network.models.remote.RemoteCharacter
import retrofit2.Retrofit
import retrofit2.converter.gson.GsonConverterFactory
import retrofit2.http.GET



//making the api call using gson as a converter
interface RickAndMortyApiService {

    @GET("characters")

    suspend fun getCharacters(): List<RemoteCharacter>
}


//creating the retrofit instance
object RetrofitInstance {
    private val retrofit = Retrofit.Builder()
        .baseUrl("https://rickandmortyapi.com/api/")
        .addConverterFactory(GsonConverterFactory.create())
        .build()

    val api: RickAndMortyApiService by lazy {
        retrofit.create(RickAndMortyApiService::class.java)
    }
}
