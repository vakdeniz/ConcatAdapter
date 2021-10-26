package com.example.concatadapterexample.repository

import com.example.concatadapterexample.model.AnimalDataContent

class RepositoryImpl : Repository {
    override fun getCats(): List<AnimalDataContent> = listOf(
        AnimalDataContent("Cat 1", CAT_IMAGE_URL),
        AnimalDataContent("Cat 2", CAT_IMAGE_URL),
        AnimalDataContent("Cat 3", CAT_IMAGE_URL),
        AnimalDataContent("Cat 4", CAT_IMAGE_URL),
        AnimalDataContent("Cat 5", CAT_IMAGE_URL),
        AnimalDataContent("Cat 6", CAT_IMAGE_URL),
        AnimalDataContent("Cat 7", CAT_IMAGE_URL),
        AnimalDataContent("Cat 8", CAT_IMAGE_URL),
        AnimalDataContent("Cat 9", CAT_IMAGE_URL),
        AnimalDataContent("Cat 10", CAT_IMAGE_URL)
    )

    override fun getDogs(): List<AnimalDataContent> = listOf(
        AnimalDataContent("Golden Retriever 1", DOG_IMAGE_URL),
        AnimalDataContent("Golden Retriever 2", DOG_IMAGE_URL),
        AnimalDataContent("Golden Retriever 3", DOG_IMAGE_URL),
        AnimalDataContent("Golden Retriever 4", DOG_IMAGE_URL),
        AnimalDataContent("Golden Retriever 5", DOG_IMAGE_URL),
        AnimalDataContent("Golden Retriever 5", DOG_IMAGE_URL)
    )

    override fun getCows(): List<AnimalDataContent> = listOf(
        AnimalDataContent("Cow 1", COW_IMAGE_URL),
        AnimalDataContent("Cow 2", COW_IMAGE_URL),
        AnimalDataContent("Cow 3", COW_IMAGE_URL)
    )

    companion object {
        const val CAT_IMAGE_URL =
            "https://cdn.pixabay.com/photo/2014/11/30/14/11/cat-551554_1280.jpg"
        const val DOG_IMAGE_URL =
            "https://cdn-prod.medicalnewstoday.com/content/images/articles/322/322868/golden-retriever-puppy.jpg"
        const val COW_IMAGE_URL =
            "https://cdn.pixabay.com/photo/2016/10/04/23/52/cow-1715829_1280.jpg"
    }
}