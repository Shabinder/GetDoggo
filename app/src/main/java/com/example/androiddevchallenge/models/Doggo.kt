package com.example.androiddevchallenge.models

import com.example.androiddevchallenge.models.Breed
import kotlinx.serialization.Serializable

@Serializable
data class Doggo(
    val breeds: List<Breed> = emptyList(),
    val height: Int,
    val id: String,
    val url: String,
    val width: Int
)