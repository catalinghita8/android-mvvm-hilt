package com.inspiringteam.mvvmdagger.di

import androidx.lifecycle.ViewModel
import androidx.lifecycle.ViewModelProvider
import com.inspiringteam.mvvmdagger.di.message.MessageViewModelFactory
import com.inspiringteam.mvvmdagger.di.scopes.AppScoped
import com.inspiringteam.mvvmdagger.ui.message.MessageViewModel
import dagger.Binds
import dagger.Module
import dagger.multibindings.IntoMap

@Module
abstract class ViewModelModule {
    @Binds
    @IntoMap
    @ViewModelKey(MessageViewModel::class)
    abstract fun bindMessageViewModel(messageViewModel: MessageViewModel?): ViewModel?

    @Binds
    @AppScoped
    abstract fun bindViewModelFactory(factory: MessageViewModelFactory?): ViewModelProvider.Factory?
}