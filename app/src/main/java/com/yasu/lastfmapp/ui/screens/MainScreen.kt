package com.yasu.lastfmapp.ui.screens

import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Text
import androidx.compose.material3.TopAppBar
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableIntStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.Modifier
import com.yasu.lastfmapp.ui.components.BottomNavBar

@OptIn(ExperimentalMaterial3Api::class)
@Composable
fun MainScreen() {
    var selectedIndex by remember { mutableIntStateOf(0) }

    Scaffold(
        modifier = Modifier.fillMaxSize(),
        topBar = {
            TopAppBar(
                title = { Text(text = "LastFM App") }
            )
        },
        bottomBar = {
            BottomNavBar(
                selectedIndex = selectedIndex,
                onItemSelected = { selectedIndex = it }
            )
        }
    ) { innerPadding ->
        when (selectedIndex) {
            0 -> HomeScreen(modifier = Modifier.padding(innerPadding))
            1 -> ExploreScreen(modifier = Modifier.padding(innerPadding))
            2 -> ProfileScreen(modifier = Modifier.padding(innerPadding))
        }
    }
}