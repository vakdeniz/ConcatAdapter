package com.example.concatadapterexample.adapter.holder

import android.view.View
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import com.example.concatadapterexample.R
import com.example.concatadapterexample.model.ConcatAdapterViewHolderModel

class CustomConcatViewHolder(
    itemView: View
) : RecyclerView.ViewHolder(itemView) {
    private val concatAdapterRecyclerView
            by lazy { itemView.findViewById<RecyclerView>(R.id.concatAdapterRV) }
    private val concatTitleTextView
            by lazy { itemView.findViewById<TextView>(R.id.concatAdapterTitleTV) }

    fun bind(concatAdapterViewHolderModel: ConcatAdapterViewHolderModel) {
        concatTitleTextView.text = concatAdapterViewHolderModel.title
        concatAdapterRecyclerView.adapter = concatAdapterViewHolderModel.adapter
    }

}
