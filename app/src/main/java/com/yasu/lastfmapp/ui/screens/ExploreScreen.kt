package com.yasu.lastfmapp.ui.screens

import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.lazy.grid.GridCells
import androidx.compose.foundation.lazy.grid.LazyVerticalGrid
import androidx.compose.foundation.lazy.grid.items
import androidx.compose.material3.Card
import androidx.compose.material3.CardDefaults
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp

val genreList = listOf(
    Pair("Rock", Color(0xFF1DB954)),
    Pair("Metal", Color(0xFF8B0000)),
    Pair("Punk", Color(0xFFFF6B00)),
    Pair("Gothic", Color(0xFF4A0080)),
    Pair("Jazz", Color(0xFF1A237E)),
    Pair("Electrónica", Color(0xFF006064)),
    Pair("Indie", Color(0xFFE65100)),
    Pair("Post-Punk", Color(0xFF212121)),
    Pair("Shoegaze", Color(0xFF880E4F)),
    Pair("Darkwave", Color(0xFF1B0000)),
    Pair("Ambient", Color(0xFF01579B)),
    Pair("Hip-Hop", Color(0xFF33691E))
)

@Composable
fun ExploreScreen(modifier: Modifier = Modifier) {
    LazyVerticalGrid(
        columns = GridCells.Fixed(2),
        modifier = modifier.fillMaxSize().padding(8.dp),
        verticalArrangement = Arrangement.spacedBy(8.dp),
        horizontalArrangement = Arrangement.spacedBy(8.dp)
    ) {
        items(genreList) { (genre, color) ->
            Card(
                modifier = Modifier
                    .fillMaxWidth()
                    .height(80.dp),
                colors = CardDefaults.cardColors(containerColor = color)
            ) {
                Text(
                    text = genre,
                    modifier = Modifier.padding(12.dp),
                    fontSize = 16.sp,
                    fontWeight = FontWeight.Bold,
                    color = Color.White
                )
            }
        }
    }
}