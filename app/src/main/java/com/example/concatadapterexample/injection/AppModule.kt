package com.example.concatadapterexample.injection

import android.app.Application
import dagger.Module
import dagger.Provides
import javax.inject.Singleton


@Module
class AppModule {

    @Provides
    @Singleton
    fun providesApplication(): Application = MyApplication()

}