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

import androidx.compose.foundation.Image
import androidx.compose.foundation.border
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
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
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.text.style.TextOverflow
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.core.net.toUri
import com.example.androiddevchallenge.R
import com.example.androiddevchallenge.models.Breed
import com.example.androiddevchallenge.models.Doggo
import com.example.androiddevchallenge.ui.theme.shapes
import com.example.androiddevchallenge.ui.theme.typography
import dev.chrisbanes.accompanist.coil.CoilImage

@Composable
fun DetailScreen(doggo: Doggo, navigate: () -> Unit) {
    val info = doggo.breeds.first()
    Column() {
        DoggoImage(info.name, doggo.url)
        Spacer(modifier = Modifier.padding(vertical = 4.dp))
        DetailCard(info)
        // FavouriteButton()
    }
}

@Composable
fun FavouriteButton() {
    Column(horizontalAlignment = Alignment.CenterHorizontally, modifier = Modifier.fillMaxWidth()) {
        Image(painterResource(id = R.drawable.ic_heart_paw), "Favourite Button", Modifier.size(72.dp).clip(RoundedCornerShape(percent = 50)).padding(4.dp))
    }
}

@Composable
fun DetailCard(info: Breed) {
    Column(
        verticalArrangement = Arrangement.SpaceEvenly, horizontalAlignment = Alignment.CenterHorizontally,
        modifier = Modifier
            .padding(16.dp)
            .border(2.dp, Color.DarkGray, RoundedCornerShape(size = 12.dp))
            .padding(24.dp)
    ) {
        Row(horizontalArrangement = Arrangement.SpaceBetween, verticalAlignment = Alignment.CenterVertically, modifier = Modifier.fillMaxWidth()) {
            Text("Bred For", style = typography.h6, maxLines = 1, overflow = TextOverflow.Ellipsis)
            Text(" : ", fontSize = 13.sp, maxLines = 1, overflow = TextOverflow.Ellipsis)
            Text(info.bred_for ?: "Unknown", style = typography.body1, maxLines = 2, overflow = TextOverflow.Ellipsis)
        }
        Spacer(Modifier.padding(vertical = 8.dp))
        Row(horizontalArrangement = Arrangement.SpaceBetween, verticalAlignment = Alignment.CenterVertically, modifier = Modifier.fillMaxWidth()) {
            Text("Life Span", style = typography.h6, maxLines = 1, overflow = TextOverflow.Ellipsis)
            Text(" : ", fontSize = 13.sp, maxLines = 1, overflow = TextOverflow.Ellipsis)
            Text(info.life_span, style = typography.body1, maxLines = 2, overflow = TextOverflow.Ellipsis)
        }
        Spacer(Modifier.padding(vertical = 12.dp))
        Row(horizontalArrangement = Arrangement.SpaceBetween, verticalAlignment = Alignment.Top, modifier = Modifier.fillMaxWidth()) {
            Text("Qualities", style = typography.h6, maxLines = 1, overflow = TextOverflow.Ellipsis)
            Text(" : ", fontSize = 13.sp, maxLines = 1, overflow = TextOverflow.Ellipsis)
            LazyColumn() {
                itemsIndexed(info.temperament.split(',')) { i: Int, s: String ->
                    Text("${i + 1}) $s", style = typography.body1, maxLines = 1, overflow = TextOverflow.Ellipsis)
                    Spacer(modifier = Modifier.padding(vertical = 2.dp))
                }
            }
        }
        Spacer(Modifier.padding(vertical = 8.dp))
        Row(horizontalArrangement = Arrangement.SpaceBetween, verticalAlignment = Alignment.CenterVertically, modifier = Modifier.fillMaxWidth()) {
            Text("Height", style = typography.h6, maxLines = 1, overflow = TextOverflow.Ellipsis)
            Text(" : ", fontSize = 13.sp, maxLines = 1, overflow = TextOverflow.Ellipsis)
            Text(info.height.imperial + " Inches", style = typography.body1, maxLines = 2, overflow = TextOverflow.Ellipsis)
        }
        Spacer(Modifier.padding(vertical = 8.dp))
        Row(horizontalArrangement = Arrangement.SpaceBetween, verticalAlignment = Alignment.CenterVertically, modifier = Modifier.fillMaxWidth()) {
            Text("Weight", style = typography.h6, maxLines = 1, overflow = TextOverflow.Ellipsis)
            Text(" : ", fontSize = 13.sp, maxLines = 1, overflow = TextOverflow.Ellipsis)
            Text(info.weight.imperial + " Pounds", style = typography.body1, maxLines = 2, overflow = TextOverflow.Ellipsis)
        }
        Spacer(Modifier.padding(vertical = 8.dp))
    }
}

@Composable
fun DoggoImage(
    title: String,
    url: String,
    modifier: Modifier = Modifier,
) {
    Column(
        modifier
            .padding(vertical = 8.dp)
            .fillMaxWidth(),
        horizontalAlignment = Alignment.CenterHorizontally
    ) {
        val imgUri = url.toUri().buildUpon().scheme("https").build()
        CoilImage(
            data = imgUri,
            "Doggo's Image",
            contentScale = ContentScale.Crop,
            //loading = { Image(painterResource(id = R.drawable.ic_dog), "") },
            //error = { Image(painterResource(id = R.drawable.ic_dog), "") },
            modifier = Modifier
                .width(210.dp)
                .height(230.dp)
                .clip(shapes.medium)
        )
        Text(
            text = title,
            style = typography.h5,
            maxLines = 2,
            textAlign = TextAlign.Center,
            overflow = TextOverflow.Ellipsis,
            // color = colorAccent,
        )
    }
}
