package com.example.a30daysapp.ui.screens

import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.lazy.items
import androidx.compose.foundation.lazy.itemsIndexed
import androidx.compose.runtime.Composable
import androidx.navigation.NavController
import com.example.a30daysapp.sampledata.tips
import com.example.a30daysapp.ui.components.TipCard

@Composable
fun TipsListScreen(navController: NavController) {
    LazyColumn {
        itemsIndexed(tips) { index, tip ->
            TipCard(
                tip = tip,
                onCardClick = { navController.navigate("tipDetail/$index") },
                onImageClick = { navController.navigate("imageFull/${tip.imageResourceId}") }
            )

        }
    }
}