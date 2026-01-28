package com.example.dreamteamapp.ui.Bio.Student2

import androidx.compose.foundation.Image
import androidx.compose.foundation.border
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.automirrored.filled.ArrowBack
import androidx.compose.material3.*
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.text.font.FontFamily
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.navigation.NavHostController
import com.example.dreamteamapp.R

val LeafGreen = Color(0xFF4CAF50)
val EarthBrown = Color(0xFF795548)
val SoftCream = Color(0xFFF5F5DC)

@OptIn(ExperimentalMaterial3Api::class)
@Composable
fun BioStudentScreen2(navController: NavHostController) {
    Scaffold(
        topBar = {
            TopAppBar(
                title = {
                    Text(
                        //surname
                        "Bon",
                        style = TextStyle(
                            color = Color.White,
                            fontSize = 18.sp,
                            fontWeight = FontWeight.Black,
                            letterSpacing = 2.sp,
                            fontFamily = FontFamily.SansSerif
                        )
                    )
                },
                navigationIcon = {
                    IconButton(onClick = { navController.popBackStack() }) {
                        Icon(
                            imageVector = Icons.AutoMirrored.Filled.ArrowBack,
                            contentDescription = "Back",
                            tint = Color.White
                        )
                    }
                },
                colors = TopAppBarDefaults.topAppBarColors(
                    containerColor = LeafGreen
                )
            )
        },
        containerColor = SoftCream
    ) { innerPadding ->
        Box(
            modifier = Modifier
                .fillMaxSize()
                .padding(innerPadding),
            contentAlignment = Alignment.Center
        ) {
            Column(
                modifier = Modifier
                    .fillMaxWidth()
                    .padding(24.dp),
                horizontalAlignment = Alignment.CenterHorizontally,
                verticalArrangement = Arrangement.Center
            ) {
                Surface(
                    modifier = Modifier
                        .size(170.dp)
                        .border(6.dp, EarthBrown, CircleShape),
                    shape = CircleShape,
                    color = Color.White,
                    shadowElevation = 12.dp
                ) {
                    Image(
                        //picture
                        painter = painterResource(id = R.drawable.gershancarl_bon),
                        contentDescription = "Profile Picture",
                        contentScale = ContentScale.Crop,
                        modifier = Modifier
                            .fillMaxSize()
                            .clip(CircleShape)
                    )
                }

                Spacer(modifier = Modifier.height(32.dp))

                Text(
                    //fullname
                    text = "Bon, Gershan Carl G.",
                    style = TextStyle(
                        fontSize = 30.sp,
                        fontWeight = FontWeight.ExtraBold,
                        color = EarthBrown,
                        fontFamily = FontFamily.Serif,
                        letterSpacing = 1.sp
                    ),
                    textAlign = TextAlign.Center
                )

                Surface(
                    color = LeafGreen,
                    shape = RoundedCornerShape(20.dp),
                    modifier = Modifier.padding(top = 8.dp)
                ) {
                    Text(
                        //section & student ID
                        text = "3IT-A || 2300366 ",
                        modifier = Modifier.padding(horizontal = 12.dp, vertical = 4.dp),
                        style = TextStyle(
                            fontSize = 14.sp,
                            fontWeight = FontWeight.Bold,
                            color = Color.White,
                            fontFamily = FontFamily.SansSerif
                        )
                    )
                }

                Spacer(modifier = Modifier.height(32.dp))

                Card(
                    modifier = Modifier
                        .fillMaxWidth()
                        .wrapContentHeight(),
                    shape = RoundedCornerShape(24.dp),
                    colors = CardDefaults.cardColors(containerColor = Color.White),
                    elevation = CardDefaults.cardElevation(defaultElevation = 6.dp)
                ) {
                    Column(
                        modifier = Modifier.padding(24.dp),
                        horizontalAlignment = Alignment.CenterHorizontally
                    ) {
                        Text(
                            text = "BIO",
                            style = TextStyle(
                                fontSize = 16.sp,
                                fontWeight = FontWeight.Black,
                                color = EarthBrown,
                                letterSpacing = 1.5.sp
                            )
                        )

                        HorizontalDivider(
                            modifier = Modifier
                                .width(50.dp)
                                .padding(vertical = 12.dp),
                            thickness = 3.dp,
                            color = LeafGreen
                        )

                        Text(
                            //short bio
                            text = "I am the leader and I facilitate how my members work throughout this semester, I try to lead them by looking for their capabilities and skills to help them succeed.",
                            style = TextStyle(
                                fontSize = 15.sp,
                                lineHeight = 24.sp,
                                color = Color.Gray,
                                fontWeight = FontWeight.Medium,
                                fontFamily = FontFamily.SansSerif,
                                textAlign = TextAlign.Center
                            )
                        )
                    }
                }
            }
        }
    }
}