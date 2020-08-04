package com.inspiringteam.mvvmdagger.data

import android.content.Context
import dagger.hilt.android.qualifiers.ApplicationContext
import javax.inject.Inject

class SharedStorage @Inject constructor(@ApplicationContext context: Context) : ISharedStorage {

    private val sharedPreferences = context.getSharedPreferences("message", Context.MODE_PRIVATE)

    override fun setString(key: String, value: String) {
        with(sharedPreferences.edit()) {
            putString(key, value)
            apply()
        }
    }

    override fun getString(key: String): String {
        return sharedPreferences.getString(key, "")!!
    }

}