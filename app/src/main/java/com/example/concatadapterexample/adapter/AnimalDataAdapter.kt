package com.example.concatadapterexample.adapter

import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.DiffUtil
import androidx.recyclerview.widget.ListAdapter
import com.example.concatadapterexample.R
import com.example.concatadapterexample.adapter.holder.AnimalDataViewHolder
import com.example.concatadapterexample.model.AnimalDataContent

class AnimalDataAdapter : ListAdapter<AnimalDataContent, AnimalDataViewHolder>(DIFFER) {
    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int) = AnimalDataViewHolder(
        LayoutInflater.from(parent.context).inflate(
            R.layout.animal_data_item, parent, false
        )
    )

    override fun onBindViewHolder(holder: AnimalDataViewHolder, position: Int) =
        holder.bind(getItem(position))

    companion object {
        private val DIFFER = object : DiffUtil.ItemCallback<AnimalDataContent>() {
            override fun areItemsTheSame(
                oldItem: AnimalDataContent,
                newItem: AnimalDataContent
            ) = oldItem == newItem

            override fun areContentsTheSame(
                oldItem: AnimalDataContent,
                newItem: AnimalDataContent
            ) = oldItem.imageUrl == newItem.imageUrl
        }
    }
}