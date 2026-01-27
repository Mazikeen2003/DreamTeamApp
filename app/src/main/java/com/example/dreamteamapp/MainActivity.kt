package com.example.dreamteamapp

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import androidx.navigation.compose.rememberNavController
import com.example.dreamteamapp.Navigation.Routes
import com.example.dreamteamapp.ui.homescreen.HomeScreen
import com.example.dreamteamapp.ui.theme.DreamTeamAppTheme
// Correct imports based on your structure
import com.example.dreamteamapp.ui.Bio.Student1.BioStudentScreen1
import com.example.dreamteamapp.ui.Bio.Student2.BioStudentScreen2
import com.example.dreamteamapp.ui.Bio.Student3.BioStudentScreen3
import com.example.dreamteamapp.ui.Bio.Student4.BioStudentScreen4
import com.example.dreamteamapp.ui.Bio.Student5.BioStudentScreen5

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContent {
            DreamTeamAppTheme {
                val navController = rememberNavController()

                NavHost(
                    navController = navController,
                    startDestination = Routes.HomeScreen
                ) {
                    composable(Routes.HomeScreen) {
                        HomeScreen(navController)
                    }

                    // Now navigating to your ACTUAL created screens
                    composable(Routes.Student1) { BioStudentScreen1(navController) }
                    composable(Routes.Student2) { BioStudentScreen2(navController) }
                    composable(Routes.Student3) { BioStudentScreen3(navController) }
                    composable(Routes.Student4) { BioStudentScreen4(navController) }
                    composable(Routes.Student5) { BioStudentScreen5(navController) }
                }
            }
        }
    }
}