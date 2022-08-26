package com.example.weatherapp.models

import java.io.Serializable

data class Coordinates(
    val lon: Double,
    val lat: Double
) : Serializable