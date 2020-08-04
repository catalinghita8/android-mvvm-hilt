package com.inspiringteam.mvvmdagger.data

interface ISharedStorage {
    fun setString(key: String, value: String)
    fun getString(key: String): String
}