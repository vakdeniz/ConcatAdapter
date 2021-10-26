package com.example.concatadapterexample.injection

import androidx.fragment.app.FragmentFactory
import com.example.concatadapterexample.fragments.ConcatAdapterFragment
import javax.inject.Inject

class FragmentFactory @Inject constructor(
    private val viewModelFactory: ViewModelFactory
) : FragmentFactory() {
    override fun instantiate(classLoader: ClassLoader, className: String) =
        when (className) {
            ConcatAdapterFragment::class.java.name -> ConcatAdapterFragment(viewModelFactory)
            else -> super.instantiate(classLoader, className)
        }
}