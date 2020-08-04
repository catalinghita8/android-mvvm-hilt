package com.inspiringteam.mvvmdagger.data

import javax.inject.Inject
import javax.inject.Singleton

// Fake repository
@Singleton
class MessageRepository @Inject constructor(storage: ISharedStorage) {
    val data: String
        get() {
            val message =

            return "Hello Coding Troops!"
        }
}