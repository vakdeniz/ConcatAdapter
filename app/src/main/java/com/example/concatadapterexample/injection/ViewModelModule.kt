package com.example.concatadapterexample.injection

import androidx.lifecycle.ViewModel
import androidx.lifecycle.ViewModelProvider
import com.example.concatadapterexample.viewmodel.ConcatAdapterViewModel
import dagger.Binds
import dagger.Module
import dagger.multibindings.IntoMap

@Module
abstract class ViewModelModule {
    @Binds
    abstract fun bindViewModelFactory(factory: ViewModelFactory): ViewModelProvider.Factory

    @Binds
    @IntoMap
    @ViewModelKey(ConcatAdapterViewModel::class)
    abstract fun concatAdapterViewModel(viewModel: ConcatAdapterViewModel): ViewModel

}