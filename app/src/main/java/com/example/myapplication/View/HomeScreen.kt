package com.example.myapplication.View
import androidx.compose.foundation.background
import androidx.compose.foundation.border
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.offset
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.lazy.items
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.Card
import androidx.compose.material3.CardDefaults
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.myapplication.data.ActivityItem
import com.example.myapplication.data.DummyActivity

@Preview
@Composable
fun HomeScreen() {
    Row(
        modifier = Modifier
            .offset(x = 16.dp, y = 16.dp)
    ) {

        //Circle to display level.
        Box(
            contentAlignment = Alignment.Center,
            modifier = Modifier
                .clip(CircleShape)
                .background(Color(0xFF00A200))
                .size(70.dp)
        ) {
            Text(
                text = "4",
                color = Color.White,
                fontSize = 36.sp
            )
        }

        Column(
            modifier = Modifier
                .offset(x = 16.dp, y = 16.dp)
        ) {
            Text(
                text = "Kiet Tuan Nguyen",
                color = Color(0xFF00A200),
                fontSize = 26.sp,
                fontWeight = FontWeight.Bold
            )
        }
    }

    //Experience bar
    Row(modifier = Modifier.offset(x = 100.dp, y = 100.dp)) {
        Box(
            contentAlignment = Alignment.CenterStart,
            modifier = Modifier
                .clip(RoundedCornerShape(10.dp))
                .width(200.dp)
                .height(30.dp)
                .background(Color.White)
                .border(width = 2.dp, color = Color.LightGray)
        ) {

            Box(
                modifier = Modifier
                    .size(50.dp)  // Set size of inner box
                    .background(Color(0xFF00A200))  // Set background color
                    .align(Alignment.CenterStart)  // Position the inner box
            )
        }
    }

    //Display activity
    Row(modifier = Modifier.offset(0.dp, 200.dp)) {
        LazyColumn(
            modifier = Modifier.fillMaxSize()
        ) {
            items(DummyActivity.activityList) { activity ->
                ActivityItem(activity = activity) {

                }
            }
        }

    }
}

@Composable
fun ActivityItem(activity: ActivityItem, onClick: () -> Unit) {
    Card(
        modifier = Modifier
            .fillMaxWidth()
            .padding(top = 20.dp, start = 8.dp, end = 8.dp)
            .clickable {
                onClick()
            },
        elevation = CardDefaults.cardElevation(10.dp),
        colors = CardDefaults.cardColors(Color.White)
    ) {
        Column(
            modifier = Modifier
                .padding(16.dp)
        ) {
            Text(text = activity.title, fontWeight = FontWeight.ExtraBold)
            Text(text = activity.description, fontWeight = FontWeight.ExtraLight)
        }
    }
}





