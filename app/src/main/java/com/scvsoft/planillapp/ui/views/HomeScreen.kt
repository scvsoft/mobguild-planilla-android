package com.scvsoft.planillapp.ui.views

import androidx.compose.material.Scaffold
import androidx.compose.runtime.Composable
import androidx.compose.ui.tooling.preview.Preview
import androidx.navigation.compose.rememberNavController
import com.scvsoft.planillapp.ui.theme.PlanillappTheme
import com.scvsoft.planillapp.ui.nav.MainScreenNavigationConfigurations


@Composable
fun PlanillapHome(){
    val navController = rememberNavController()
    Scaffold(
        topBar = { CustomTopBar() },
        bottomBar = {
            BottomNavigationBar(navController)
        },
    ) {
        MainScreenNavigationConfigurations(navController)
    }
}

@Preview(showBackground = true)
@Composable
fun previewHomeScreen(){
    PlanillappTheme() {
        PlanillapHome()
    }
}