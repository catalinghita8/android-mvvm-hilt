package com.inspiringteam.mvvmdagger.ui.message

import com.inspiringteam.mvvmdagger.di.scopes.FragmentScoped
import dagger.Module
import dagger.android.ContributesAndroidInjector

@Module
abstract class MessageModule {
    @FragmentScoped
    @ContributesAndroidInjector
    abstract fun messageFragment(): MessageFragment?
}