package com.example.network.models.remote

import com.example.network.models.domain.Character
import com.example.network.models.domain.CharacterGender
import com.example.network.models.domain.CharacterStatus


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

//mapping the remote character to the domain character

fun RemoteCharacter.toDomainCharacter(): Character {

    val characterGender = when (gender.lowercase()) {
        "female" -> CharacterGender.Female
        "male" -> CharacterGender.Male
        "genderless" -> CharacterGender.Genderless
        else -> CharacterGender.Unknown
    }
    val characterStatus = when (status.lowercase()) {
        "alive" -> CharacterStatus.Alive
        "dead" -> CharacterStatus.Dead
        else -> CharacterStatus.Unknown
    }

    return Character(
        image = image,
        name = name,
        status = characterStatus,
        species = species,
        gender = characterGender,
        location = Character.Location(name = location.name , url = location.url)





    )

}
