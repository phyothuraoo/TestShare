package com.example.framgiatongxuanan.retrofit2_download_file


import okhttp3.ResponseBody
import retrofit2.Call
import retrofit2.http.GET
import retrofit2.http.Streaming
import retrofit2.http.Url


/**
 * Created by FRAMGIA\tong.xuan.an on 08/01/2018.
 */
interface ApiService {

    // option 1: a resource relative to your base URL
    @Streaming
    @GET("/MovieMVVM.zip")
    fun downloadFileWithFixedUrl(): Call<ResponseBody>

    // option 2: using a dynamic URL
    @Streaming
    @GET
    fun downloadFileWithDynamicUrlSync(@Url fileUrl: String): Call<ResponseBody>
}