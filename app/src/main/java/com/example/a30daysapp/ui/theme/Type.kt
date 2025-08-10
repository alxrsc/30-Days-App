package com.example.ui.theme

import androidx.compose.material3.Typography
import androidx.compose.ui.text.font.Font
import androidx.compose.ui.text.font.FontFamily
import androidx.compose.ui.text.font.FontStyle
import androidx.compose.ui.text.font.FontWeight
import com.example.a30daysapp.R

// Local font families
val AbrilFatface = FontFamily(
    Font(R.font.abril_fatface_regular, FontWeight.Normal)
)

val Bungee = FontFamily(
    Font(R.font.bungee_regular, FontWeight.Normal)
)

val Montserrat = FontFamily(
    Font(R.font.montserrat_variable, FontWeight.Normal),
    Font(R.font.montserrat_italic_variable, FontWeight.Normal, FontStyle.Italic)
)

val Roboto = FontFamily(
    Font(R.font.roboto_variable, FontWeight.Normal),
    Font(R.font.roboto_italic_variable, FontWeight.Normal, FontStyle.Italic)
)

// Default Material 3 typography values
val baseline = Typography()

// Apply custom fonts to your theme
val AppTypography = Typography(
    displayLarge = baseline.displayLarge.copy(fontFamily = Bungee),
    displayMedium = baseline.displayMedium.copy(fontFamily = Bungee),
    displaySmall = baseline.displaySmall.copy(fontFamily = Bungee),
    headlineLarge = baseline.headlineLarge.copy(fontFamily = AbrilFatface),
    headlineMedium = baseline.headlineMedium.copy(fontFamily = AbrilFatface),
    headlineSmall = baseline.headlineSmall.copy(fontFamily = AbrilFatface),
    titleLarge = baseline.titleLarge.copy(fontFamily = Bungee),
    titleMedium = baseline.titleMedium.copy(fontFamily = Bungee),
    titleSmall = baseline.titleSmall.copy(fontFamily = Bungee),
    bodyLarge = baseline.bodyLarge.copy(fontFamily = Roboto),
    bodyMedium = baseline.bodyMedium.copy(fontFamily = Roboto),
    bodySmall = baseline.bodySmall.copy(fontFamily = Roboto),
    labelLarge = baseline.labelLarge.copy(fontFamily = Montserrat),
    labelMedium = baseline.labelMedium.copy(fontFamily = Montserrat),
    labelSmall = baseline.labelSmall.copy(fontFamily = Montserrat),
)
