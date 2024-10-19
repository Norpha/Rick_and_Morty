package com.example.network.models.remote

data class RemoteCharacter(
    val image: String,
    val name: String,
    val status: String,
    val species: String,
    val gender: String,
    val location: Location


)

{
    data class Location(
        val name: String,
        val url: String
    )

}
