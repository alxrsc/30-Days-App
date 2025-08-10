package com.example.a30daysapp.ui.screens

import androidx.compose.foundation.background
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.navigation.NavController
import com.example.a30daysapp.sampledata.tips
import com.example.a30daysapp.ui.components.TipCard

@Composable
fun TipDetailScreen (
    tipId: Int?,
    navController: NavController
) {
    Box(
        modifier = Modifier
            .fillMaxSize()
            .background(Color.Gray)
            .clickable { navController.popBackStack() }, // tap anywhere to go back
        contentAlignment = Alignment.Center
    ) {
        tipId?.let { id ->
            val tip = tips.getOrNull(id)
            tip?.let {
                TipCard(
                    tip = it,
                    onCardClick = { /* TODO unknown yet*/ },
                    onImageClick = { navController.navigate("imageFull/${tip.imageResourceId}") }
                )
            }
        }
    }
}