package com.inspiringteam.mvvmdagger.ui.message

import android.content.Context
import androidx.hilt.lifecycle.ViewModelInject
import androidx.lifecycle.ViewModel
import com.inspiringteam.mvvmdagger.data.MessageRepository
import dagger.hilt.android.qualifiers.ApplicationContext
import dagger.hilt.android.scopes.ActivityScoped

@ActivityScoped
class MessageViewModel @ViewModelInject constructor(@ApplicationContext context: Context,
                                                    private val repository: MessageRepository) : ViewModel() {

    val uiModel: MessageUiModel
        get() = MessageUiModel(repository.data)

}