package com.inspiringteam.mvvmdagger.network

import io.reactivex.Single
import retrofit2.http.GET
import retrofit2.http.Header
import retrofit2.http.Headers
import retrofit2.http.Path

interface SampleApi {
}

interface GPSRestInterface {

    @Headers("Accept: application/json")
    fun getContent()

}