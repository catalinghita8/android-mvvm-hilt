package com.inspiringteam.mvvmdagger.di.message

import androidx.lifecycle.ViewModel
import androidx.lifecycle.ViewModelProvider
import com.inspiringteam.mvvmdagger.di.scopes.AppScoped
import javax.inject.Inject
import javax.inject.Provider

@AppScoped
class MessageViewModelFactory @Inject constructor(private val creators: Map<Class<out ViewModel?>?, Provider<ViewModel>?>) : ViewModelProvider.Factory {
    override fun <T : ViewModel?> create(modelClass: Class<T>): T {
        var creator: Provider<out ViewModel>? = creators[modelClass]
        if (creator == null) {
            for ((key, value) in creators) {
                if (modelClass.isAssignableFrom(key)) {
                    creator = value
                    break
                }
            }
        }
        requireNotNull(creator) { "unknown model class $modelClass" }
        return try {
            creator.get() as T
        } catch (e: Exception) {
            throw RuntimeException(e)
        }
    }

}