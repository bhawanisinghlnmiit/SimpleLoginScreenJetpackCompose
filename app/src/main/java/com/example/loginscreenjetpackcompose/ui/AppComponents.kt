package com.example.loginscreenjetpackcompose.ui

import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.layout.wrapContentHeight
import androidx.compose.foundation.layout.wrapContentWidth
import androidx.compose.foundation.text.KeyboardActions
import androidx.compose.foundation.text.KeyboardOptions
import androidx.compose.material3.Card
import androidx.compose.material3.CardDefaults
import androidx.compose.material3.CardElevation
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.OutlinedTextField
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.platform.LocalFocusManager
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.input.ImeAction
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.TextUnit
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.loginscreenjetpackcompose.R

@Composable
fun TopBar(value : String){
    Row(
        modifier = Modifier
            .fillMaxWidth()
            .background(Color.White),
        verticalAlignment = Alignment.CenterVertically
    ) {
        Text(
            text = value,
            color = Color.Black,
            fontSize = 24.sp,
            fontWeight = FontWeight.Medium
        )
        Spacer(modifier = Modifier.weight(1f))
        Image(
            modifier = Modifier
                .size(80.dp),
            painter = painterResource(id = R.drawable.user_input_logo),
            contentDescription = "User"
        )
    }
}

@Preview
@Composable
fun TopBarPreview(){
    TopBar("Hi there")
}

@Composable
fun TextComponent(textValue: String, textSize: TextUnit, color: Color = Color.Black){
    Text(
        text = textValue,
        fontSize = textSize,
        color = color,
        fontWeight = FontWeight.Light
    )
}

@Preview
@Composable
fun TextComponentPreview(showBackground: Boolean = true){
    TextComponent(textValue = "Let's learn about you!", textSize = 24.sp)
}

@OptIn(ExperimentalMaterial3Api::class) @Composable
fun TextFieldComponent(
    onTextChanges: (name: String) -> Unit
) {
    var currentValue by remember{
        mutableStateOf("")
    }
    val localFocusManager = LocalFocusManager.current
    OutlinedTextField(
        modifier = Modifier.fillMaxWidth(),
        value = currentValue,
        onValueChange = {
            currentValue = it
            onTextChanges(it)
        },
        placeholder = {
            Text(text = "Enter your name", fontSize = 18.sp)
        },
        textStyle = TextStyle.Default.copy(fontSize = 24.sp),
        keyboardOptions = KeyboardOptions(
            imeAction = ImeAction.Done
        ),
        keyboardActions = KeyboardActions {
            localFocusManager.clearFocus()
        }
        )
}

@Preview
@Composable
fun TextFieldComponentPreview(showBackground: Boolean=true) {
//    TextFieldComponent()
}

@Composable
fun AnimalCard(image: Int) {
    Card(
        modifier = Modifier
            .padding(24.dp)
            .size(130.dp),
        elevation = CardDefaults.cardElevation(4.dp)
    ) {
        Image(
            modifier = Modifier
                .wrapContentHeight()
                .wrapContentWidth()
                .padding(16.dp),
            painter = painterResource(id = image),
            contentDescription = "animal")
    }
}