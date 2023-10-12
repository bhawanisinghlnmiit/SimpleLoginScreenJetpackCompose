package com.example.loginscreenjetpackcompose.ui

import android.service.autofill.UserData
import androidx.compose.runtime.mutableStateOf
import androidx.lifecycle.ViewModel
import com.example.loginscreenjetpackcompose.data.UserDataUiEvents
import com.example.loginscreenjetpackcompose.data.UserInputScreenState

class UserInputViewModel : ViewModel(){
    var uiState = mutableStateOf(UserInputScreenState())

    fun onEvent(event: UserDataUiEvents) { // this function will be triggered from the screen by user
        when(event) {
            is UserDataUiEvents.UserNameEntered -> {
                uiState.value.copy(
                    nameEntered = event.nameValue
                )
            }
            is UserDataUiEvents.AnimalSelected -> {
                uiState.value.copy(
                    animalSelected = event.animalValue
                )
            }
        }
    }
}
