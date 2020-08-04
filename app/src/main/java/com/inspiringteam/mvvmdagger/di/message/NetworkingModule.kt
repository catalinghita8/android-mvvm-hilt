package com.inspiringteam.mvvmdagger.di.message


import dagger.Module
import dagger.Provides
import dagger.hilt.InstallIn
import dagger.hilt.android.components.ApplicationComponent
import okhttp3.OkHttpClient
import retrofit2.Retrofit
import javax.inject.Singleton

@InstallIn(ApplicationComponent::class)
@Module
class NetworkingModule {

    @Provides
    @Singleton
    fun provideAuthInterceptorOkHttpClient(): OkHttpClient {
        return OkHttpClient.Builder()
                .build()
    }

    @Provides
    @Singleton
    fun provideRetrofit(
            okHttpClient: OkHttpClient
    ): Retrofit {
        return Retrofit.Builder()
                .client(okHttpClient)
                .baseUrl("https://codingtroops.com")
                .build()
    }

}