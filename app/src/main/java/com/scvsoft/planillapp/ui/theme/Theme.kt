package com.scvsoft.planillapp.ui.theme

import androidx.compose.foundation.isSystemInDarkTheme
import androidx.compose.material.MaterialTheme
import androidx.compose.material.darkColors
import androidx.compose.material.lightColors
import androidx.compose.runtime.Composable
import androidx.compose.ui.graphics.Color

val DarkColorPalette = darkColors(
    primary = Color(0xFF20233A),
    primaryVariant = darkBackground,
    surface = darkBackground,
    onBackground = Color.White,
    background = darkBackground,
    secondary = mutedDarK
)
 val LightColorPalette = lightColors(
    primary = Color.White,
    primaryVariant = Color.White,
    surface = Color.White,
    onBackground = Color.Black,
    background = Color(0xFFF7F7F7),
    secondaryVariant = Color.White,
    secondary = Color.White

    /* Other default colors to override
surface = Color.White,
onPrimary = Color.White,
onSecondary = Color.Black,
onBackground = Color.Black,
onSurface = Color.Black,
*/
)

@Composable
fun PlanillappTheme(darkTheme: Boolean = isSystemInDarkTheme(), content: @Composable() () -> Unit) {
    val colors = if (darkTheme) {
        DarkColorPalette
    } else {
        LightColorPalette
    }

    MaterialTheme(
        colors = colors,
        typography = typography,
        shapes = shapes,
        content = content
    )
}