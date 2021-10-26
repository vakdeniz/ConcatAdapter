package com.example.concatadapterexample.injection

import com.example.concatadapterexample.MainActivity
import dagger.Component
import javax.inject.Singleton

@Component(
    modules = [
        AppModule::class,
        ViewModelModule::class,
        NetworkModule::class
    ]
)

@Singleton
interface AppComponent {
    fun inject(activity: MainActivity)
}