package com.example.loginscreenjetpackcompose.data


sealed class UserDataUiEvents {
    data class UserNameEntered(val nameValue: String): UserDataUiEvents()
    data class AnimalSelected(val animalValue: String): UserDataUiEvents()
}
