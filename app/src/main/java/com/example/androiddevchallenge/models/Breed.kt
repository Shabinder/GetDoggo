package com.example.androiddevchallenge.models

import kotlinx.serialization.Serializable

@Serializable
data class Breed(
    val bred_for: String? = "Companion, Good Luck Charms",
    val height: Height,
    val life_span: String,
    val name: String,
    val temperament: String,
    val weight: Weight
)