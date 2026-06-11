package com.yasu.lastfmapp.ui.screens

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Person
import androidx.compose.material3.Icon
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.constraintlayout.compose.ConstraintLayout

@Composable
fun ProfileScreen(modifier: Modifier = Modifier) {
    ConstraintLayout(
        modifier = modifier
            .fillMaxWidth()
            .padding(16.dp)
    ) {
        val (avatar, username, scrobbles, plays) = createRefs()

        Icon(
            imageVector = Icons.Default.Person,
            contentDescription = "Avatar",
            modifier = Modifier
                .size(80.dp)
                .clip(CircleShape)
                .background(MaterialTheme.colorScheme.primaryContainer)
                .padding(12.dp)
                .constrainAs(avatar) {
                    top.linkTo(parent.top)
                    start.linkTo(parent.start)
                }
        )

        Text(
            text = "yasuqm0",
            fontSize = 22.sp,
            fontWeight = FontWeight.Bold,
            modifier = Modifier.constrainAs(username) {
                top.linkTo(avatar.top)
                start.linkTo(avatar.end, margin = 16.dp)
            }
        )

        Text(
            text = "Scrobbles: 12,847",
            fontSize = 14.sp,
            color = Color.Gray,
            modifier = Modifier.constrainAs(scrobbles) {
                top.linkTo(username.bottom, margin = 4.dp)
                start.linkTo(avatar.end, margin = 16.dp)
            }
        )

        Text(
            text = "Artistas: 342",
            fontSize = 14.sp,
            color = Color.Gray,
            modifier = Modifier.constrainAs(plays) {
                top.linkTo(scrobbles.bottom, margin = 4.dp)
                start.linkTo(avatar.end, margin = 16.dp)
            }
        )
    }
}