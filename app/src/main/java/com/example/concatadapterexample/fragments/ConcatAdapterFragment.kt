package com.example.concatadapterexample.fragments

import android.os.Bundle
import android.view.View
import androidx.fragment.app.Fragment
import androidx.fragment.app.viewModels
import androidx.recyclerview.widget.ConcatAdapter
import androidx.recyclerview.widget.RecyclerView
import com.example.concatadapterexample.R
import com.example.concatadapterexample.adapter.AnimalDataAdapter
import com.example.concatadapterexample.adapter.CustomConcatAdapter
import com.example.concatadapterexample.injection.ViewModelFactory
import com.example.concatadapterexample.model.ConcatAdapterDataModel
import com.example.concatadapterexample.viewmodel.ConcatAdapterViewModel

class ConcatAdapterFragment(
    private val viewModelFactory: ViewModelFactory
) : Fragment(R.layout.fragment_concat_adapter) {

    private val viewModel: ConcatAdapterViewModel by viewModels { viewModelFactory }

    private lateinit var concatRecyclerView: RecyclerView
    private val concatAdapter: ConcatAdapter by lazy { ConcatAdapter() }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        initViews()
        bindViewModel()
    }

    private fun bindViewModel() {
        viewModel.catsList.observe(viewLifecycleOwner, { updateConcatAdapter(it) })
        viewModel.dogsList.observe(viewLifecycleOwner, { updateConcatAdapter(it) })
        viewModel.cowsList.observe(viewLifecycleOwner, { updateConcatAdapter(it) })
    }

    private fun updateConcatAdapter(concatAdapterDataModel: ConcatAdapterDataModel) {

        val animalDataAdapter = AnimalDataAdapter() // Different ListAdapters can be created here

        val newAdapter = CustomConcatAdapter(
            requireContext(),
            concatAdapterDataModel.title,
            concatAdapterDataModel.adapterType,
            animalDataAdapter
        )

        concatAdapter.addAdapter(newAdapter)
        animalDataAdapter.submitList(concatAdapterDataModel.animalDataContentList)
    }

    private fun initViews() {
        concatRecyclerView = requireView().findViewById(R.id.concatRV)
        concatRecyclerView.adapter = concatAdapter
    }
}