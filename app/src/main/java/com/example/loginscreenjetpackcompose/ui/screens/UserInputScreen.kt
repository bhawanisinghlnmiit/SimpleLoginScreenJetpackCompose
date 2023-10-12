package com.example.loginscreenjetpackcompose.ui.screens

import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.material3.Surface
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.navigation.compose.rememberNavController
import com.example.loginscreenjetpackcompose.R
import com.example.loginscreenjetpackcompose.data.UserDataUiEvents
import com.example.loginscreenjetpackcompose.ui.AnimalCard
import com.example.loginscreenjetpackcompose.ui.TextComponent
import com.example.loginscreenjetpackcompose.ui.TextFieldComponent
import com.example.loginscreenjetpackcompose.ui.TopBar
import com.example.loginscreenjetpackcompose.ui.UserInputViewModel

@Composable
fun UserInputScreen(userInputViewModel: UserInputViewModel) {
    Surface(
        modifier = Modifier
            .fillMaxSize()
    ) {
        Column(
            modifier = Modifier
                .fillMaxSize()
                .padding(18.dp)
        ) {
            TopBar("Hi there \uD83D\uDE0A")
            TextComponent(
                textValue = "Let's learn about you!",
                textSize = 24.sp
            )
            Spacer(modifier = Modifier.size(20.dp))
            TextComponent(textValue = "This app will provide a details page based on input provided by you!", textSize = 18.sp)
            Spacer(modifier = Modifier.size(80.dp))

            TextComponent(textValue = "Name", textSize = 18.sp)
            Spacer(modifier = Modifier.size(10.dp))
            TextFieldComponent(
                onTextChanges = {
                    userInputViewModel.onEvent(
                        UserDataUiEvents.UserNameEntered(nameValue = it)
                    )
                }
            )
            Spacer(modifier = Modifier.size(24.dp))
            TextComponent(textValue = "What do you like", textSize = 18.sp)
            Row(
                modifier = Modifier.fillMaxWidth()
            ) {
                AnimalCard(image = R.drawable.icon_cat)
                AnimalCard(image = R.drawable.icon_dog)
            }
        }
    }
}

@Preview
@Composable
fun UserInputScreenPreview(){
//    UserInputScreen()
}