package com.example.androiddevchallenge.ui.screens

import android.widget.Toast
import androidx.compose.animation.ExperimentalAnimationApi
import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.lazy.itemsIndexed
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.snapshots.SnapshotStateList
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Color
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
fun HomeScreen(list:SnapshotStateList<Doggo>,navigate: (index:Int)->Unit) {
    LazyColumn(verticalArrangement = Arrangement.spacedBy(8.dp),modifier = Modifier.padding(top = 8.dp).fillMaxSize()){
        itemsIndexed(list){ i: Int, doggo: Doggo ->
            Item(i,doggo,navigate)
        }
    }
}

@ExperimentalAnimationApi
@Composable
fun Item(index:Int,doggo: Doggo,onClick:(Int)->Unit) {
    val info = doggo.breeds.first()
    Row(verticalAlignment = Alignment.CenterVertically,modifier = Modifier.padding(horizontal = 8.dp).fillMaxWidth().clickable { onClick(index) }) {
        val imgUri = doggo.url.toUri().buildUpon().scheme("https").build()
        CoilImage(
            data = imgUri,
            "Dogo's Pic",
            loading = { Image(painterResource(id = R.drawable.ic_dog),"",Modifier.size(65.dp)) },
            error = {Image(painterResource(id = R.drawable.ic_dog),"",Modifier.size(65.dp))},
            contentScale = ContentScale.Crop,
            fadeIn = true,
            modifier = Modifier.height(75.dp).width(90.dp).clip(RoundedCornerShape(size = 8.dp))
        )
        Column(modifier = Modifier.padding(horizontal = 8.dp).height(60.dp).weight(1f),verticalArrangement = Arrangement.SpaceEvenly) {
            Text(info.name,maxLines = 1,overflow = TextOverflow.Ellipsis,style = typography.h6,)
            Text(info.bred_for ?: "",fontSize = 13.sp,maxLines = 1,overflow = TextOverflow.Ellipsis)
        }
        Image(
            painterResource(id = R.drawable.ic_heart_paw),
            "Favourite",
            modifier = Modifier.clip(RoundedCornerShape(percent = 30)).clickable(onClick = {
                Toast.makeText(MainActivity.Instance,"TODO: Favourite Functionality",Toast.LENGTH_SHORT).show()
            })
        )
    }
}
