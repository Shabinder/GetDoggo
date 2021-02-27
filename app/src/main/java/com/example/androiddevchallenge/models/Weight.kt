package com.example.androiddevchallenge.models

import kotlinx.serialization.Serializable

@Serializable
data class Weight(
    val imperial: String,
    val metric: String
)