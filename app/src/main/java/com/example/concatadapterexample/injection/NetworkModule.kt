package com.example.concatadapterexample.injection

import com.example.concatadapterexample.repository.Repository
import com.example.concatadapterexample.repository.RepositoryImpl
import dagger.Module
import dagger.Provides

@Module
class NetworkModule {

    @Provides
    fun provideRepository(): Repository = RepositoryImpl()

}