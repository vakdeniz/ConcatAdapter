package com.example.concatadapterexample

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.appcompat.widget.Toolbar
import com.example.concatadapterexample.fragments.ConcatAdapterFragment
import com.example.concatadapterexample.injection.FragmentFactory
import com.example.concatadapterexample.injection.MyApplication
import javax.inject.Inject

class MainActivity : AppCompatActivity(R.layout.activity_main) {

    @Inject
    lateinit var fragmentFactory: FragmentFactory
    private lateinit var toolbar: Toolbar

    override fun onCreate(savedInstanceState: Bundle?) {
        injectDaggerApplication()
        setFragmentFactory()
        super.onCreate(savedInstanceState)
        initializeToolbar()
        showConcatAdapterFragment()
    }

    private fun injectDaggerApplication() {
        (application as MyApplication).appComponent.inject(this)
    }

    private fun setFragmentFactory() {
        supportFragmentManager.fragmentFactory = fragmentFactory
    }

    private fun initializeToolbar() {
        toolbar = findViewById(R.id.custom_toolbar)
        setSupportActionBar(toolbar)
    }

    private fun showConcatAdapterFragment() =
        supportFragmentManager
            .beginTransaction()
            .add(R.id.fragmentContainerView, ConcatAdapterFragment::class.java, null)
            .commit()
}