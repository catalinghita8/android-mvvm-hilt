package com.inspiringteam.mvvmdagger.ui.message

import androidx.lifecycle.ViewModel
import com.inspiringteam.mvvmdagger.data.MessageRepository
import com.inspiringteam.mvvmdagger.di.scopes.AppScoped
import javax.inject.Inject

@AppScoped
class MessageViewModel @Inject constructor(private val repository: MessageRepository) : ViewModel() {

    val uiModel: MessageUiModel
        get() = MessageUiModel(repository.data)

}