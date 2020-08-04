package com.inspiringteam.mvvmdagger.di.message

import com.inspiringteam.mvvmdagger.data.ISharedStorage
import com.inspiringteam.mvvmdagger.data.SharedStorage
import dagger.Binds
import dagger.Module
import dagger.hilt.InstallIn
import dagger.hilt.android.components.ApplicationComponent

@InstallIn(ApplicationComponent::class)
@Module
abstract class SharedStorageModule {

    // Makes Dagger provide SharedPreferencesStorage when a Storage type is requested
    @Binds
    abstract fun provideStorage(storage: SharedStorage): ISharedStorage
}
