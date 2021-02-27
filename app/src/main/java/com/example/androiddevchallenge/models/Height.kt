package com.example.androiddevchallenge.models

import kotlinx.serialization.Serializable

@Serializable
data class Height(
    val imperial: String,
    val metric: String
)