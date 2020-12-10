package com.scvsoft.planillapp.ui.views

import androidx.annotation.StringRes
import androidx.compose.foundation.isSystemInDarkTheme
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.preferredSize
import androidx.compose.material.*
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Favorite
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.res.imageResource
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.res.vectorResource
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.navigation.NavHostController
import androidx.navigation.compose.KEY_ROUTE
import androidx.navigation.compose.currentBackStackEntryAsState
import androidx.navigation.compose.navigate
import androidx.navigation.compose.rememberNavController
import com.scvsoft.planillapp.R

@Composable
fun BottomNavigationBar(
    navController: NavHostController,
) {

    val bottomNavigationItems = listOf(
        BottomNavigationScreens.Payment,
        BottomNavigationScreens.History,
        BottomNavigationScreens.Contacts,
        BottomNavigationScreens.Settings
    )

    BottomNavigation(backgroundColor = MaterialTheme.colors.primary) {
        val currentRoute = currentRoute(navController)
        bottomNavigationItems.forEach { screen ->
            Column() {
                BottomNavigationItem(
                    selectedContentColor = if (isSystemInDarkTheme()) Color(0xFFD6C1F4) else Color(0xFF804BD7),
                    icon = { Icon(vectorResource(id = screen.icon),Modifier.preferredSize(30.dp)) },
                    unselectedContentColor = if (isSystemInDarkTheme()) Color(0xFFE3EBF2) else Color(0xFF66687B),
                    label = { Text(stringResource(id = screen.resourceId)) },
                    selected = currentRoute == screen.route,
                    alwaysShowLabels = true, // This hides the title for the unselected items
                    onClick = {
                        // This if check gives us a "singleTop" behavior where we do not create a
                        // second instance of the composable if we are already on that destination
                        if (currentRoute != screen.route) {
                            navController.navigate(screen.route)
                        }
                    }
                )
            }

        }
    }
}

@Preview
@Composable
fun previewbottomBarPreview() {
    BottomNavigationBar(rememberNavController())
}

@Composable
private fun currentRoute(navController: NavHostController): String? {
    val navBackStackEntry by navController.currentBackStackEntryAsState()
    return navBackStackEntry?.arguments?.getString(KEY_ROUTE)
}

sealed class BottomNavigationScreens(
    val route: String,
    @StringRes val resourceId: Int,
    val icon: Int
) {
    object Payment : BottomNavigationScreens("Payment", R.string.payment_route, R.drawable.ic_payment)

    object History : BottomNavigationScreens("History", R.string.history_screen_route, R.drawable.ic_history)

    object Contacts : BottomNavigationScreens("Contacts", R.string.contacts_screen_route, R.drawable.ic_contacts)

    object Settings : BottomNavigationScreens("Settings", R.string.setetings_screen_route, R.drawable.ic_settings)
}