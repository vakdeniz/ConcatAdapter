package com.example.concatadapterexample.model

import androidx.recyclerview.widget.ListAdapter
import androidx.recyclerview.widget.RecyclerView.ViewHolder
import java.io.Serializable


data class ConcatAdapterViewHolderModel(
    val title: String? = null,
    val adapter: ListAdapter<out Serializable,out ViewHolder>
)
