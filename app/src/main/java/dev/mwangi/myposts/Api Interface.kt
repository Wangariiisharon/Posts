package dev.mwangi.myposts

import retrofit2.Call
import retrofit2.http.GET
import retrofit2.http.PATCH
import retrofit2.http.Path

interface ApiInterface {
    @GET("/posts")
    fun getPost():Call<List<post>>

    @GET("posts/{id}")
    fun getPostById(@Path("id")postId:Int):Call<post>

}