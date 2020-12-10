package com.scvsoft.planillapp.ui.views

import androidx.compose.material.MaterialTheme
import androidx.compose.material.Text
import androidx.compose.material.TopAppBar
import androidx.compose.runtime.Composable
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.tooling.preview.Preview
import com.scvsoft.planillapp.R

@Composable
fun CustomTopBar(){
    TopAppBar(
        title = {
            Text(
                stringResource(id = R.string.app_bar_title),
                color = MaterialTheme.colors.onBackground
            )
        },
        backgroundColor = MaterialTheme.colors.primary
    )
}

@Preview(showBackground = true)
@Composable
fun previewCustomTopAppBar(){
    CustomTopBar()
}