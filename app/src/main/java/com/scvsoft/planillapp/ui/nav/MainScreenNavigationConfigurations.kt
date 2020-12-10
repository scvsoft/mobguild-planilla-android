package com.scvsoft.planillapp.ui.nav

import androidx.compose.runtime.Composable
import androidx.navigation.NavHostController
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import com.scvsoft.planillapp.ui.views.BottomNavigationScreens
import com.scvsoft.planillapp.ui.views.HistoryContent
import com.scvsoft.planillapp.ui.views.mockData

@Composable
fun MainScreenNavigationConfigurations(
    navController: NavHostController
) {
    NavHost(navController, startDestination = BottomNavigationScreens.Payment.route) {
        composable(BottomNavigationScreens.Payment.route) {
        }
        composable(BottomNavigationScreens.History.route) {
            HistoryContent(payments = mockData())
        }
        composable(BottomNavigationScreens.Contacts.route) {
            //ScaryScreen(ScaryAnimation.Ghost)
        }
        composable(BottomNavigationScreens.Settings.route) {
          //  ScaryScreen(ScaryAnimation.ScaryBag)
        }
    }
}