package com.example.concatadapterexample.adapter

import android.content.Context
import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.GridLayoutManager
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.ListAdapter
import androidx.recyclerview.widget.RecyclerView
import com.example.concatadapterexample.R
import com.example.concatadapterexample.adapter.holder.CustomConcatViewHolder
import com.example.concatadapterexample.model.AdapterType
import com.example.concatadapterexample.model.ConcatAdapterViewHolderModel
import java.io.Serializable

class CustomConcatAdapter(
    private val context: Context,
    private val title: String,
    private val adapterType: AdapterType,
    private val adapter: ListAdapter<out Serializable, out RecyclerView.ViewHolder>,
) : RecyclerView.Adapter<CustomConcatViewHolder>() {

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): CustomConcatViewHolder {
        val view = LayoutInflater
            .from(context)
            .inflate(R.layout.concat_row, parent, false)

        val concatAdapterRecyclerView = view.findViewById<RecyclerView>(R.id.concatAdapterRV)

        val layoutManager = getLayoutManager(viewType)

        concatAdapterRecyclerView.layoutManager = layoutManager

        return CustomConcatViewHolder(view)
    }

    private fun getLayoutManager(viewType: Int): RecyclerView.LayoutManager = when (viewType) {
        AdapterType.HORIZONTAL_ADAPTER.id -> LinearLayoutManager(context, RecyclerView.HORIZONTAL, false)
        AdapterType.GRID_ADAPTER.id -> GridLayoutManager(context, 2)
        else -> LinearLayoutManager(context, RecyclerView.VERTICAL, false)
    }

    override fun onBindViewHolder(holder: CustomConcatViewHolder, position: Int) =
        holder.bind(ConcatAdapterViewHolderModel(title, adapter))

    override fun getItemCount(): Int = 1

    override fun getItemViewType(position: Int): Int = adapterType.id
}