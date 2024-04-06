package com.example.network
import retrofit2.Call
import retrofit2.http.GET
interface ApiService {
    @GET("users")
    fun getUsers(): Call<List<User>>
}