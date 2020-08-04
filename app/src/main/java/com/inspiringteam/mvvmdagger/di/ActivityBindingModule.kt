package com.inspiringteam.mvvmdagger.di

import com.inspiringteam.mvvmdagger.di.scopes.ActivityScoped
import com.inspiringteam.mvvmdagger.ui.message.MessageActivity
import com.inspiringteam.mvvmdagger.ui.message.MessageModule
import dagger.Module
import dagger.android.ContributesAndroidInjector

@Module
abstract class ActivityBindingModule {
    @ActivityScoped
    @ContributesAndroidInjector(modules = [MessageModule::class])
    abstract fun messageActivity(): MessageActivity?
}