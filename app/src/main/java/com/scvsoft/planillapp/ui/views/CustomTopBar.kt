package com.scvsoft.planillapp.ui.views

import androidx.compose.material.MaterialTheme
import androidx.compose.material.Text
import androidx.compose.material.TopAppBar
import androidx.compose.runtime.Composable
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.tooling.preview.Preview
import com.scvsoft.planillapp.R
import com.scvsoft.planillapp.ui.theme.DarkColorPalette
import com.scvsoft.planillapp.ui.theme.LightColorPalette

@Composable
fun CustomTopBar(){
    TopAppBar(
        title = {
            Text(
                fontWeight = FontWeight.W700,
                text =stringResource(id = R.string.app_bar_title),
                color = MaterialTheme.colors.onBackground
            )
        },
        backgroundColor = MaterialTheme.colors.primary
    )
}

@Preview(name = "TopBar Normal")
@Composable
fun PreviewCustomTopAppBar(){
    MaterialTheme(colors = LightColorPalette) {
        CustomTopBar()
    }
}

@Preview(name = "TopBar Dark")
@Composable
fun PreviewCustomTopAppBarDark(){
    MaterialTheme(colors = DarkColorPalette) {
        CustomTopBar()
    }
}