package com.scvsoft.planillapp.ui.theme

import androidx.compose.material.Typography
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.text.font.*
import androidx.compose.ui.unit.sp
import com.scvsoft.planillapp.R

private val appFontFamily = fontFamily(
        fonts = listOf(
                ResourceFont(
                        resId = R.font.manrope_regular,
                        weight = FontWeight.W700,
                        style = FontStyle.Normal
                ),
                ResourceFont(
                        resId = R.font.manrope_bold,
                        weight = FontWeight.W900,
                )

)
)

// Set of Material typography styles to start with
val typography = Typography(

        body1 = TextStyle(
                fontFamily = appFontFamily,
                fontWeight = FontWeight.Normal,
                fontSize = 16.sp
        )
        /* Other default text styles to override
    button = TextStyle(
        fontFamily = FontFamily.Default,
        fontWeight = FontWeight.W500,
        fontSize = 14.sp
    ),
    caption = TextStyle(
        fontFamily = FontFamily.Default,
        fontWeight = FontWeight.Normal,
        fontSize = 12.sp
    )
    */
)