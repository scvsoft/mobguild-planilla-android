package com.scvsoft.planillapp.ui

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import androidx.compose.material.MaterialTheme
import androidx.compose.material.Surface
import androidx.compose.ui.platform.setContent
import androidx.navigation.compose.rememberNavController
import com.scvsoft.planillapp.ui.theme.PlanillappTheme
import com.scvsoft.planillapp.ui.views.PlanillapHome

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            PlanillappTheme {
                // A surface container using the 'background' color from the theme
                Surface(color = MaterialTheme.colors.background) {
                    PlanillapHome()
                }
            }
        }
    }
}


