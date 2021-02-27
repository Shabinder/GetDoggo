package com.example.androiddevchallenge.ui.screens

import androidx.compose.animation.AnimatedVisibility
import androidx.compose.animation.ExperimentalAnimationApi
import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.*
import androidx.compose.material.Text
import androidx.compose.runtime.*
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.unit.dp
import com.example.androiddevchallenge.R
import com.example.androiddevchallenge.ui.theme.appNameStyle
import kotlinx.coroutines.delay

private const val SplashWaitTime: Long = 2000

@ExperimentalAnimationApi
@Composable
fun SplashScreen(modifier: Modifier = Modifier, onTimeout: () -> Unit) {
    Box(modifier = modifier.fillMaxSize(), contentAlignment = Alignment.Center) {
        // Adds composition consistency. Use the value when LaunchedEffect is first called
        val currentOnTimeout by rememberUpdatedState(onTimeout)
        var visible by remember{ mutableStateOf(false) }

        LaunchedEffect(Unit) {
            delay(100)
            visible = true
            delay(1750)
            visible = false
            delay(150)
            currentOnTimeout()
        }
        Column {
            Column(Modifier.fillMaxSize(),verticalArrangement = Arrangement.Center,horizontalAlignment = Alignment.CenterHorizontally){
                AnimatedVisibility(visible = visible) {
                    Image(painterResource(id = R.drawable.ic_dog), contentDescription = "App Logo")
                }
                Spacer(Modifier.padding(vertical = 2.dp))
                Text("GetDoggo",style = appNameStyle)
            }
        }
    }
}