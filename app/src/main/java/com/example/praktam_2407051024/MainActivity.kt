package com.example.praktam_2407051024

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.lazy.items
import androidx.compose.material3.*
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.example.prakTAM_2407051024.model.ActivityItem
import com.example.praktam_2407051024.model.ActivitySource
import com.example.praktam_2407051024.ui.theme.PrakTAM_2407051024Theme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
//        enableEdgeToEdge()
        setContent {
            PrakTAM_2407051024Theme {
                Surface(modifier = Modifier.fillMaxSize()) {
                    ActivityList()
                }
            }
        }
    }
}

@Composable
fun ActivityList() {
    LazyColumn(
        modifier = Modifier
            .fillMaxSize()
            .padding(16.dp),
        verticalArrangement = Arrangement.spacedBy(12.dp)
    ) {
        items(ActivitySource.dummyActivity) { activity: ActivityItem ->
            ActivityCard(activity)
        }
    }
}

@Composable
fun ActivityCard(activity: ActivityItem) {
    Card(
        modifier = Modifier.fillMaxWidth(),
        elevation = CardDefaults.cardElevation(4.dp)
    ){
        Row(
            modifier = Modifier.padding(16.dp)
        ){
            Image(
                painter = painterResource(id = activity.imageRes),
                contentDescription = activity.nama,
                modifier = Modifier.size(80.dp)
            )

            Spacer(modifier = Modifier.width(12.dp))

            Column {
                Text(text = "Nama: ${activity.nama}")
                Text(text = "Deskripsi: ${activity.deskripsi}")
                Text(text = "Waktu: ${activity.waktu}")
            }
        }
    }
}

@Preview(showBackground = true)
@Composable
fun PreviewActivity() {
    PrakTAM_2407051024Theme {
        ActivityList()
    }
}