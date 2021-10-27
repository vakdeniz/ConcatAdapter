package com.example.concatadapterexample.adapter.holder

import android.view.View
import android.widget.ImageView
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import com.bumptech.glide.Glide
import com.bumptech.glide.load.engine.DiskCacheStrategy.AUTOMATIC
import com.example.concatadapterexample.R
import com.example.concatadapterexample.adapter.AnimalAdapterListener
import com.example.concatadapterexample.model.AnimalDataContent

class AnimalDataViewHolder(
    view: View,
    listener: AnimalAdapterListener
) : RecyclerView.ViewHolder(view) {
    private lateinit var animalTitle: String
    private val animalTitleTextView by lazy { itemView.findViewById<TextView>(R.id.animalItemTitleTV) }
    private val animalImageImageView by lazy { itemView.findViewById<ImageView>(R.id.animalItemIV) }

    init {
        itemView.setOnClickListener { listener.animalItemClick(animalTitle) }
    }

    fun bind(animalDataContent: AnimalDataContent) {
        animalTitle = animalDataContent.title
        animalTitleTextView.text = animalDataContent.title

        Glide.with(itemView.context)
            .load(animalDataContent.imageUrl)
            .diskCacheStrategy(AUTOMATIC)
            .into(animalImageImageView)
    }
}