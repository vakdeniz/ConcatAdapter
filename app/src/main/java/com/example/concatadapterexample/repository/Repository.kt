package com.example.concatadapterexample.repository

import com.example.concatadapterexample.model.AnimalDataContent

interface Repository {
    fun getCats(): List<AnimalDataContent>
    fun getDogs(): List<AnimalDataContent>
    fun getCows(): List<AnimalDataContent>
}