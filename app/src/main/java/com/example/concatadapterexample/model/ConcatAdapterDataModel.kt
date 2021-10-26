package com.example.concatadapterexample.model

data class ConcatAdapterDataModel(
    val title: String,
    val animalDataContentList: List<AnimalDataContent>,
    val adapterType: AdapterType
)
