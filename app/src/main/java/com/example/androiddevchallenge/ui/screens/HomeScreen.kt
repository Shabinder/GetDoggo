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
package com.example.androiddevchallenge.ui.screens

import android.widget.Toast
import androidx.compose.animation.ExperimentalAnimationApi
import androidx.compose.foundation.Image
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.lazy.itemsIndexed
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.snapshots.SnapshotStateList
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.style.TextOverflow
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.core.net.toUri
import com.example.androiddevchallenge.MainActivity
import com.example.androiddevchallenge.R
import com.example.androiddevchallenge.models.Doggo
import com.example.androiddevchallenge.ui.theme.typography
import dev.chrisbanes.accompanist.coil.CoilImage

@ExperimentalAnimationApi
@Composable
fun HomeScreen(list: SnapshotStateList<Doggo>, navigate: (index: Int) -> Unit) {
    LazyColumn(verticalArrangement = Arrangement.spacedBy(8.dp), modifier = Modifier.padding(top = 8.dp).fillMaxSize()) {
        itemsIndexed(list) { i: Int, doggo: Doggo ->
            Item(i, doggo, navigate)
        }
    }
}

@ExperimentalAnimationApi
@Composable
fun Item(index: Int, doggo: Doggo, onClick: (Int) -> Unit) {
    val info = doggo.breeds.first()
    Row(verticalAlignment = Alignment.CenterVertically, modifier = Modifier.padding(horizontal = 8.dp).fillMaxWidth().clickable { onClick(index) }) {
        val imgUri = doggo.url.toUri().buildUpon().scheme("https").build()
        CoilImage(
            data = imgUri,
            "Dogo's Pic",
            // fix on Lowed SDKs Tests on test(AVD) - 6.0 failed: Instrumentation run failed due to 'android.content.res.Resources$NotFoundException'
            //loading = { Image(painterResource(id = R.drawable.ic_dog), "", Modifier.size(65.dp)) },
            //error = { Image(painterResource(id = R.drawable.ic_dog), "", Modifier.size(65.dp)) },
            contentScale = ContentScale.Crop,
            fadeIn = true,
            modifier = Modifier.height(75.dp).width(90.dp).clip(RoundedCornerShape(size = 8.dp))
        )
        Column(modifier = Modifier.padding(horizontal = 8.dp).height(60.dp).weight(1f), verticalArrangement = Arrangement.SpaceEvenly) {
            Text(info.name, maxLines = 1, overflow = TextOverflow.Ellipsis, style = typography.h6,)
            Text(info.bred_for ?: "", fontSize = 13.sp, maxLines = 1, overflow = TextOverflow.Ellipsis)
        }
        CoilImage(
            "https://image.flaticon.com/icons/png/128/760/760993.png",
            "Favourite",
            modifier = Modifier.clip(RoundedCornerShape(percent = 30)).clickable(
                onClick = {
                    Toast.makeText(MainActivity.Instance, "TODO: Favourite Functionality", Toast.LENGTH_SHORT).show()
                }
            )
        )
        // fix on Lowed SDKs Tests on test(AVD) - 6.0 failed: Instrumentation run failed due to 'android.content.res.Resources$NotFoundException'
        /*Image(
            painterResource(id = R.drawable.ic_heart_paw),
            "Favourite",
            modifier = Modifier.clip(RoundedCornerShape(percent = 30)).clickable(
                onClick = {
                    Toast.makeText(MainActivity.Instance, "TODO: Favourite Functionality", Toast.LENGTH_SHORT).show()
                }
            )
        )*/

    }
}
