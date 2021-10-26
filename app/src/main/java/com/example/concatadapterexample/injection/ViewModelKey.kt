package com.example.concatadapterexample.injection

import androidx.lifecycle.ViewModel
import dagger.MapKey
import kotlin.annotation.AnnotationRetention.RUNTIME
import kotlin.annotation.AnnotationTarget.*
import kotlin.reflect.KClass

@Target(
    FUNCTION,
    PROPERTY_GETTER,
    PROPERTY_SETTER
)
@kotlin.annotation.Retention(RUNTIME)
@MapKey
internal annotation class ViewModelKey(val value: KClass<out ViewModel>)
