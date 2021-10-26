package com.example.concatadapterexample.viewmodel

import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import com.example.concatadapterexample.model.AdapterType.*
import com.example.concatadapterexample.model.AnimalDataContent
import com.example.concatadapterexample.model.ConcatAdapterDataModel
import com.example.concatadapterexample.repository.Repository
import javax.inject.Inject

class ConcatAdapterViewModel @Inject constructor(
    repository: Repository
) : ViewModel() {

    private val _catsList = MutableLiveData<ConcatAdapterDataModel>()
    val catsList: LiveData<ConcatAdapterDataModel> = _catsList

    private val _dogsList = MutableLiveData<ConcatAdapterDataModel>()
    val dogsList: LiveData<ConcatAdapterDataModel> = _dogsList

    private val _cowsList = MutableLiveData<ConcatAdapterDataModel>()
    val cowsList: LiveData<ConcatAdapterDataModel> = _cowsList

    init {
        val cats = repository.getCats()
        val dogs = repository.getDogs()
        val cows = repository.getCows()

        _catsList.value = ConcatAdapterDataModel(
            title = "Cats",
            animalDataContentList = cats,
            adapterType = HORIZONTAL_ADAPTER
        )

        _dogsList.value = ConcatAdapterDataModel(
            title = "Dogs",
            animalDataContentList = dogs,
            adapterType = GRID_ADAPTER
        )

        _cowsList.value = ConcatAdapterDataModel(
            title = "Cows",
            animalDataContentList = cows,
            adapterType = VERTICAL_ADAPTER
        )
    }
}