package com.inspiringteam.mvvmdagger.data

import com.inspiringteam.mvvmdagger.network.SampleApi
import com.inspiringteam.mvvmdagger.utils.Constants
import com.inspiringteam.mvvmdagger.utils.Constants.STORAGE_KEY
import retrofit2.Retrofit
import javax.inject.Inject
import javax.inject.Singleton

// Fake repository
@Singleton
class MessageRepository @Inject constructor(private val storage: ISharedStorage,
                                            private val networkProvider: Retrofit) {

    val data: String
        get() {
            val message = "Hello Coding Troops!"
            storage.setString(STORAGE_KEY, message)
            networkProvider.create(SampleApi::class.java)
            return message
        }
}