package com.yasu.lastfmapp.ui.screens

import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.lazy.items
import androidx.compose.material3.Card
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp

val artistList = listOf(
    "Arctic Monkeys", "Radiohead", "The Cure", "Joy Division",
    "Bauhaus", "Siouxsie and the Banshees", "Nick Cave", "Portishead",
    "Massive Attack", "Cocteau Twins", "Dead Can Dance", "The Sisters of Mercy"
)

@Composable
fun HomeScreen(modifier: Modifier = Modifier) {
    LazyColumn(
        modifier = Modifier
            .fillMaxSize()
            .padding(horizontal = 16.dp)
    ) {
        items(artistList) { artist ->
            Card(
                modifier = Modifier
                    .fillMaxWidth()
                    .padding(vertical = 8.dp)
            ) {
                Text(
                    text = artist,
                    modifier = Modifier.padding(16.dp),
                    fontSize = 18.sp
                )
            }
        }
    }
}