package com.yasu.lastfmapp

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.material3.Surface
import androidx.compose.ui.Modifier
import com.yasu.lastfmapp.ui.screens.MainScreen
import com.yasu.lastfmapp.ui.theme.LastFMAppTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstance: Bundle?) {
        super.onCreate(savedInstance)
        enableEdgeToEdge()
        setContent {
            LastFMAppTheme() {
                Surface(modifier = Modifier.fillMaxSize()) {
                    MainScreen()
                }
            }
        }
    }
}