package com.example.dreamteamapp.ui.homescreen

import androidx.compose.foundation.layout.*
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.*
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.text.font.FontFamily
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.navigation.NavHostController
import com.example.dreamteamapp.Navigation.Routes

val LeafGreen = Color(0xFF4CAF50)
val EarthBrown = Color(0xFF795548)
val SoftCream = Color(0xFFF5F5DC)

@OptIn(ExperimentalMaterial3Api::class)
@Composable
fun HomeScreen(navController: NavHostController) {
    Scaffold(
        topBar = {
            TopAppBar(
                title = {
                    Text(
                        "The Dream Team",
                        style = TextStyle(
                            color = Color.White,
                            fontSize = 20.sp,
                            fontWeight = FontWeight.ExtraBold,
                            fontFamily = FontFamily.SansSerif
                        )
                    )
                },
                colors = TopAppBarDefaults.topAppBarColors(
                    containerColor = LeafGreen
                )
            )
        },
        containerColor = SoftCream
    ) { innerPadding ->
        Column(
            modifier = Modifier
                .fillMaxSize()
                .padding(innerPadding),
            horizontalAlignment = Alignment.CenterHorizontally,
            verticalArrangement = Arrangement.Center
        ) {
            Surface(
                modifier = Modifier
                    .fillMaxWidth(0.85f)
                    .wrapContentHeight(),
                shape = RoundedCornerShape(20.dp),
                color = Color.White,
                shadowElevation = 8.dp
            ) {
                Column(
                    modifier = Modifier.padding(vertical = 25.dp, horizontal = 15.dp),
                    horizontalAlignment = Alignment.CenterHorizontally
                ) {
                    Text(
                        text = "TEAM MEMBERS",
                        style = TextStyle(
                            fontSize = 12.sp,
                            color = EarthBrown,
                            fontWeight = FontWeight.Bold,
                            letterSpacing = 1.5.sp
                        ),
                        modifier = Modifier.padding(bottom = 15.dp)
                    )

                    TeamButton(label = "Student One") {
                        navController.navigate(Routes.Student1)
                    }

                    TeamButton(label = "Student Two") {
                        navController.navigate(Routes.Student2)
                    }

                    TeamButton(label = "Student Three") {
                        navController.navigate(Routes.Student3)
                    }

                    TeamButton(label = "Student Four") {
                        navController.navigate(Routes.Student4)
                    }

                    TeamButton(label = "Student Five") {
                        navController.navigate(Routes.Student5)
                    }
                }
            }
        }
    }
}

@Composable
fun TeamButton(label: String, onClick: () -> Unit) {
    Button(
        onClick = onClick,
        modifier = Modifier
            .width(245.dp)
            .height(75.dp)
            .padding(vertical = 4.dp),
        colors = ButtonDefaults.buttonColors(
            containerColor = EarthBrown,
            contentColor = Color.White
        ),
        shape = RoundedCornerShape(25.dp)
    ) {
        Text(
            text = label,
            style = TextStyle(
                fontSize = 17.sp,
                fontWeight = FontWeight.SemiBold,
                fontFamily = FontFamily.SansSerif
            )
        )
    }
}