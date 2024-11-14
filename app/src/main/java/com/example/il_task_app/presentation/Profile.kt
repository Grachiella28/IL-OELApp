package com.example.il_task_app.presentation

import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.offset
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.Icon
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.navigation.NavController
import androidx.navigation.compose.rememberNavController
import com.example.il_task_app.R

@Composable
fun Profile(
    navController: NavController
) {
    Box(
        modifier = Modifier
            .background(Color.White)
            .fillMaxSize(),
        contentAlignment = Alignment.Center
    )
    {
        Box(
            modifier = Modifier
                .height(608.dp)
                .width(372.dp)
                .offset(y = 40.dp)
                .background(
                    color = Color.LightGray,
                    shape = RoundedCornerShape(16.dp)
                ),
            contentAlignment = Alignment.Center
        ) {
            Box(
                modifier = Modifier
                    .height(606.dp)
                    .width(370.dp)
                    //.offset(y = 40.dp)
                    .background(
                        color = Color.White,
                        shape = RoundedCornerShape(16.dp)
                    ),
            ) {
                Column(
                    modifier = Modifier
                        .padding(start = 25.dp, end = 25.dp)
                ) {
                    Spacer(modifier = Modifier.height(60.dp))
                    Text(
                        text = "Nama",
                        style = MaterialTheme.typography.titleLarge,
                        fontWeight = FontWeight.Bold
                    )
                    Text(
                        text = "Grachiella Dian Malemukur",
                        style = MaterialTheme.typography.bodyLarge
                    )
                    Spacer(modifier = Modifier.height(8.dp))
                    Text(
                        text = "Email",
                        style = MaterialTheme.typography.titleLarge,
                        fontWeight = FontWeight.Bold
                    )
                    Text(
                        text = "grachielladian@gmail.com",
                        style = MaterialTheme.typography.bodyLarge
                    )
                    Spacer(modifier = Modifier.height(8.dp))
                    Text(
                        text = "Perguruan Tinggi",
                        style = MaterialTheme.typography.titleLarge,
                        fontWeight = FontWeight.Bold
                    )
                    Text(
                        text = "Universitas Maritim Raja Ali Haji",
                        style = MaterialTheme.typography.bodyLarge
                    )
                    Spacer(modifier = Modifier.height(8.dp))
                    Text(
                        text = "Jurusan",
                        style = MaterialTheme.typography.titleLarge,
                        fontWeight = FontWeight.Bold
                    )
                    Text(
                        text = "Teknik Informatika",
                        style = MaterialTheme.typography.bodyLarge
                    )
                    Spacer(modifier = Modifier.height(8.dp))
                    Text(
                        text = "\"Halo, perkenalkan saya Grachiella, seorang mahasiswa Teknik Informatika yang saat ini mengikuti program studi independen di Infinite Learning. Saya berada di divisi Android Developer dan UI/UX Design, di mana saya belajar dan mengembangkan keterampilan dalam pengembangan aplikasi Android dan desain antarmuka pengguna. Saya tertarik untuk terus mengasah kemampuan dalam menciptakan solusi digital yang bermanfaat.\" \n" +
                                "\n" +
                                "Semoga perkenalan ini dapat membantu Anda!",
                        textAlign = TextAlign.Justify,
                        style = MaterialTheme.typography.bodyMedium
                    )
                }
            }
        }

        Box(
            modifier = Modifier
                .height(130.dp)
                .width(106.dp)
                .offset(x = -110.dp, y = -280.dp)
                .background(
                    color = Color.LightGray,
                    shape = RoundedCornerShape(16.dp)
                ),
            contentAlignment = Alignment.Center
        ) {
            Box(
                modifier = Modifier
                    .height(128.dp)
                    .width(104.dp)
                    .background(
                        color = Color.White,
                        shape = RoundedCornerShape(16.dp)
                    ),
                //contentAlignment = Alignment.BottomEnd
            ) {
                Image(
                    painter = painterResource(id = R.drawable.profile_age),
                    contentDescription = "Logo PT",
                    contentScale = ContentScale.Crop,
                    modifier = Modifier
                        .fillMaxSize()
                        .clip(RoundedCornerShape(16.dp))
                )
            }
        }
    }
}

@Preview
@Composable
private fun ProfileView() {
    Profile(navController = rememberNavController())
}