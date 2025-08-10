package com.example.a30daysapp

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import androidx.compose.runtime.Composable
import androidx.compose.ui.tooling.preview.Preview
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import androidx.navigation.compose.rememberNavController
import com.example.a30daysapp.ui.screens.ImageFullScreen
import com.example.a30daysapp.ui.screens.TipDetailScreen
import com.example.a30daysapp.ui.screens.TipsListScreen
import com.example.compose.AppTheme


class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContent {
                _30DaysAppTheme()
        }
    }
}

@Composable
fun _30DaysAppTheme() {
    AppTheme {
        val navController = rememberNavController()
        NavHost(navController, startDestination = "tipsList") {
            composable("tipsList") {
                TipsListScreen(navController)
            }
            composable("tipDetail/{tipId}") { backStackEntry ->
                val tipId = backStackEntry.arguments?.getString("tipId")?.toInt() // nullable
                TipDetailScreen(tipId = tipId, navController)
            }
            composable("imageFull/{imageRes}") { backStackEntry ->
                val imageRes = backStackEntry.arguments?.getString("imageRes")?.toInt() // nullable
                ImageFullScreen(imageRes = imageRes, navController)
            }
        }
    }
}

@Preview(showBackground = true)
@Composable
fun AppPreview() {
    _30DaysAppTheme()
}