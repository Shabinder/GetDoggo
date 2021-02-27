/*
 * Copyright 2021 The Android Open Source Project
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *     https://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package com.example.androiddevchallenge

import android.os.Bundle
import androidx.activity.compose.setContent
import androidx.activity.viewModels
import androidx.appcompat.app.AppCompatActivity
import androidx.compose.animation.ExperimentalAnimationApi
import androidx.compose.animation.core.MutableTransitionState
import androidx.compose.animation.core.Spring
import androidx.compose.animation.core.animateDp
import androidx.compose.animation.core.animateFloat
import androidx.compose.animation.core.spring
import androidx.compose.animation.core.tween
import androidx.compose.animation.core.updateTransition
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.material.MaterialTheme
import androidx.compose.material.Surface
import androidx.compose.material.Text
import androidx.compose.material.TopAppBar
import androidx.compose.runtime.Composable
import androidx.compose.runtime.LaunchedEffect
import androidx.compose.runtime.getValue
import androidx.compose.runtime.remember
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.alpha
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.unit.Dp
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.navigation.NavHostController
import androidx.navigation.compose.rememberNavController
import com.example.androiddevchallenge.models.getDoggoList
import com.example.androiddevchallenge.ui.navigation.ComposeNavigation
import com.example.androiddevchallenge.ui.screens.SplashScreen
import com.example.androiddevchallenge.ui.theme.MyTheme
import com.example.androiddevchallenge.ui.theme.appNameStyle
import dev.chrisbanes.accompanist.coil.CoilImage

@ExperimentalAnimationApi
class MainActivity : AppCompatActivity() {

    private lateinit var navController: NavHostController
    private val viewModel: MainViewModel by viewModels()

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            MyTheme {
                // A surface container using the 'background' color from the theme
                Surface(color = MaterialTheme.colors.background) {
                    navController = rememberNavController()
                    MainScreen(navController)

                    LaunchedEffect(Unit) {
                        viewModel.doggoList.addAll(getDoggoList())
                    }
                }
            }
        }
    }
    companion object {
        /*
        * God Activity so Active Throughout App.(Ignore Leak)
        * */
        lateinit var Instance: MainActivity
    }
    init {
        Instance = this
    }
}

@ExperimentalAnimationApi
@Composable
fun MainScreen(navController: NavHostController) {
    val transitionState = remember { MutableTransitionState(SplashState.Shown) }
    val transition = updateTransition(transitionState)
    val splashAlpha by transition.animateFloat(
        transitionSpec = { tween(durationMillis = 100) }
    ) {
        if (it == SplashState.Shown) 1f else 0f
    }
    val contentAlpha by transition.animateFloat(
        transitionSpec = { tween(durationMillis = 300) }
    ) {
        if (it == SplashState.Shown) 0f else 1f
    }
    val contentTopPadding by transition.animateDp(
        transitionSpec = { spring(stiffness = Spring.StiffnessLow) }
    ) {
        if (it == SplashState.Shown) 100.dp else 0.dp
    }

    Box {
        SplashScreen(
            modifier = Modifier.alpha(splashAlpha),
            onTimeout = { transitionState.targetState = SplashState.Completed }
        )
        MainContent(
            navController,
            modifier = Modifier.alpha(contentAlpha),
            topPadding = contentTopPadding
        )
    }
}

@ExperimentalAnimationApi
@Composable
fun MainContent(
    navController: NavHostController,
    modifier: Modifier,
    topPadding: Dp,
) {
    Column(
        modifier = modifier.fillMaxSize()
    ) {
        /*// Draw a scrim over the status bar which matches the app bar
        Spacer(
            Modifier.background(appBarColor).fillMaxWidth()
                .statusBarsHeight()
        )*/
        AppBar(
            modifier = Modifier.fillMaxWidth()
        )
        // Space for Animation
        Spacer(Modifier.padding(top = topPadding))
        ComposeNavigation(
            navController,
        )
    }
}

@Composable
fun AppBar(modifier: Modifier) {
    TopAppBar(
        backgroundColor = Color.White,
        title = {
            Row(verticalAlignment = Alignment.CenterVertically) {
                // fix on Lowed SDKs Tests on test(AVD) - 6.0 failed: Instrumentation run failed due to 'android.content.res.Resources$NotFoundException'
                /*Image(
                    painterResource(R.drawable.ic_dog),
                    "Logo",
                    Modifier.size(42.dp)
                )*/
                CoilImage(
                    "https://image.flaticon.com/icons/png/128/1303/1303561.png",
                    "Logo",
                    Modifier.size(42.dp)
                )

                Spacer(Modifier.padding(horizontal = 4.dp))
                Text(
                    text = "GetDoggo",
                    style = appNameStyle.copy(fontSize = 38.sp)
                )
            }
        },
        modifier = modifier,
    )
}

enum class SplashState { Shown, Completed }
