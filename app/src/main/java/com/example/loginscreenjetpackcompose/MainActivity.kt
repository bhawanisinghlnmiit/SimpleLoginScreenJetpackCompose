package com.example.loginscreenjetpackcompose

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import com.example.loginscreenjetpackcompose.ui.screens.AppNavigation
import com.example.loginscreenjetpackcompose.ui.theme.LoginScreenJetpackComposeTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            LoginScreenJetpackComposeTheme {
                AppNavigation()
            }
        }
    }
}