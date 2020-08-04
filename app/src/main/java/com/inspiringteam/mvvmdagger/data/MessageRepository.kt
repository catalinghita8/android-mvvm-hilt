package com.inspiringteam.mvvmdagger.data

import com.inspiringteam.mvvmdagger.di.scopes.AppScoped
import javax.inject.Inject

// Fake repository
@AppScoped
class MessageRepository @Inject constructor() {
    val data: String
        get() = "Hello Coding Troops!"
}