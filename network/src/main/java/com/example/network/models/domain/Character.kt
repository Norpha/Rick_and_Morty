package com.example.network.models.domain

data class Character(
    val image: String,
    val name: String,
    val status: CharacterStatus,
    val species: String,
    val gender: CharacterGender,
    val location: Location


)

{
    data class Location(
        val name: String,
        val url: String
    )

}



