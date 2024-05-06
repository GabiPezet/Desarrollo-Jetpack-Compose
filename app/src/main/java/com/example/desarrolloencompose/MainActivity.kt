package com.example.desarrolloencompose

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.lazy.LazyRow
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.saveable.rememberSaveable
import androidx.compose.runtime.setValue
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontFamily
import androidx.compose.ui.text.font.FontStyle
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.desarrolloencompose.ui.theme.DesarrolloEnComposeTheme
import java.time.format.TextStyle

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            appComposeExample()
        }
    }
}

@Preview(showBackground = true)
@Composable
fun appComposeExample(){
    var counterLike by rememberSaveable {mutableStateOf(0)}
    var counterFav by rememberSaveable {mutableStateOf(0)}
    var counterComment by rememberSaveable {mutableStateOf(0)}

    LazyColumn(modifier = Modifier
        .fillMaxSize()
        .background(Color.LightGray)){
        item {
            Text(
                text = "Artistas",
                color = Color.Magenta,
                fontSize = 32.sp,
                fontFamily = FontFamily.Serif,
                textAlign = TextAlign.Center,
                modifier = Modifier.fillMaxWidth()
            )
            Text(
                text = "Lana Del Rey",
                fontStyle = FontStyle.Italic,
                fontWeight = FontWeight.Bold,
                letterSpacing = 1.sp
            )
            Image(
                modifier = Modifier
                    .fillMaxWidth()
                    .height(400.dp),
                painter = painterResource(id = R.drawable.lanadelreycover),
                contentDescription = "Cover Lana Del Rey"
            )
            Row(modifier = Modifier.padding(top = 10.dp)) {
                Image(
                    painter = painterResource(id = R.drawable.baseline_favorite_24),
                    contentDescription = "Like",
                    modifier = Modifier.clickable {counterLike++})
                Text(text = counterLike.toString(), color = Color.Black, modifier = Modifier.padding(start = 3.dp))
                Image(
                    painter = painterResource(id = R.drawable.circulo_guardado),
                    contentDescription = "Save",
                    modifier = Modifier.clickable {counterFav++}
                )
                Text(text = counterFav.toString(), color = Color.Black, modifier = Modifier.padding(start = 3.dp))
                Image(
                    painter = painterResource(id = R.drawable.agregar_comentario),
                    contentDescription = "Comment",
                    modifier = Modifier.clickable {counterComment++}
                )
                Text(text = counterComment.toString(), color = Color.Black, modifier = Modifier.padding(start = 3.dp))
            }

            LazyRow(horizontalArrangement = Arrangement.SpaceBetween,
                modifier = Modifier
                    .fillMaxWidth()
                    .padding(16.dp)){
                item {
                    Text(text = "Born To Die ", color = Color.Gray, fontStyle = FontStyle.Italic)}
                item {
                    Text(text = "Ultraviolence ", color = Color.DarkGray, fontStyle = FontStyle.Italic)
                    Text(text = "Honeymoon ", color = Color.Gray, fontStyle = FontStyle.Italic)
                    Text(text = "Lust For Life ", color = Color.DarkGray, fontStyle = FontStyle.Italic)
                    Text(text = "Norman Fucking Rockwell ", color = Color.Gray, fontStyle = FontStyle.Italic)
                    Text(text = "Chemtrails Over The Country Club ", color = Color.Gray, fontStyle = FontStyle.Italic)
                    Text(text = "Blue Banisters ", color = Color.Gray, fontStyle = FontStyle.Italic)
                    Text(text = "Did You Know That There's a Tunnel Under Ocean Blvd", color = Color.Gray, fontStyle = FontStyle.Italic)
                }
            }

            Text(
                text = "Anitta",
                fontStyle = FontStyle.Italic,
                fontWeight = FontWeight.Bold,
                letterSpacing = 1.sp
            )
            Image(
                modifier = Modifier
                    .fillMaxWidth()
                    .height(400.dp),
                painter = painterResource(id = R.drawable.anittacover),
                contentDescription = "Cover Anitta"
            )
            Row(modifier = Modifier.padding(top = 10.dp)) {
                Image(
                    painter = painterResource(id = R.drawable.baseline_favorite_24),
                    contentDescription = "Like",
                    modifier = Modifier.clickable {counterLike++})
                Text(text = counterLike.toString(), color = Color.Black, modifier = Modifier.padding(start = 3.dp))
                Image(
                    painter = painterResource(id = R.drawable.circulo_guardado),
                    contentDescription = "Save",
                    modifier = Modifier.clickable {counterFav++}
                )
                Text(text = counterFav.toString(), color = Color.Black, modifier = Modifier.padding(start = 3.dp))
                Image(
                    painter = painterResource(id = R.drawable.agregar_comentario),
                    contentDescription = "Comment",
                    modifier = Modifier.clickable {counterComment++}
                )
                Text(text = counterComment.toString(), color = Color.Black, modifier = Modifier.padding(start = 3.dp))
            }

            LazyRow(horizontalArrangement = Arrangement.SpaceBetween,
                modifier = Modifier
                    .fillMaxWidth()
                    .padding(5.dp)){
                item {
                    Text(text = "Anitta ", color = Color.Gray, fontStyle = FontStyle.Italic)
                    Text(text = "Ritmo Perfeito ", color = Color.DarkGray, fontStyle = FontStyle.Italic)
                    Text(text = "Bang! ", color = Color.Gray, fontStyle = FontStyle.Italic)
                    Text(text = "Kisses ", color = Color.DarkGray, fontStyle = FontStyle.Italic)
                    Text(text = "Versions Of Me ", color = Color.Gray, fontStyle = FontStyle.Italic)
                    Text(text = "Funk Generation", color = Color.Gray, fontStyle = FontStyle.Italic)
                   }
            }

            Text(
                text = "Taylor Swift",
                fontStyle = FontStyle.Italic,
                fontWeight = FontWeight.Bold,
                letterSpacing = 1.sp
            )
            Image(
                modifier = Modifier
                    .fillMaxWidth()
                    .height(400.dp),
                painter = painterResource(id = R.drawable.taylorcover),
                contentDescription = "Cover Taylor Swift"
            )
            Row(modifier = Modifier.padding(top = 10.dp)) {
                Image(
                    painter = painterResource(id = R.drawable.baseline_favorite_24),
                    contentDescription = "Like",
                    modifier = Modifier.clickable {counterLike++})
                Text(text = counterLike.toString(), color = Color.Black, modifier = Modifier.padding(start = 3.dp))
                Image(
                    painter = painterResource(id = R.drawable.circulo_guardado),
                    contentDescription = "Save",
                    modifier = Modifier.clickable {counterFav++}
                )
                Text(text = counterFav.toString(), color = Color.Black, modifier = Modifier.padding(start = 3.dp))
                Image(
                    painter = painterResource(id = R.drawable.agregar_comentario),
                    contentDescription = "Comment",
                    modifier = Modifier.clickable {counterComment++}
                )
                Text(text = counterComment.toString(), color = Color.Black, modifier = Modifier.padding(start = 3.dp))
            }

            LazyRow(horizontalArrangement = Arrangement.SpaceBetween,
                modifier = Modifier
                    .fillMaxWidth()
                    .padding(5.dp)){
                item {
                    Text(text = "Taylor Swift ", color = Color.Gray, fontStyle = FontStyle.Italic)
                    Text(text = "Fearless (Taylor's Version) ", color = Color.DarkGray, fontStyle = FontStyle.Italic)
                    Text(text = "Speak Now (Taylor's Version) ", color = Color.Gray, fontStyle = FontStyle.Italic)
                    Text(text = "Red (Taylor's Version) ", color = Color.DarkGray, fontStyle = FontStyle.Italic)
                    Text(text = "1989 (Taylor's Version) ", color = Color.Gray, fontStyle = FontStyle.Italic)
                    Text(text = "Reputation ", color = Color.Gray, fontStyle = FontStyle.Italic)
                    Text(text = "Lover ", color = Color.Gray, fontStyle = FontStyle.Italic)
                    Text(text = "Folklore ", color = Color.DarkGray, fontStyle = FontStyle.Italic)
                    Text(text = "Evermore ", color = Color.Gray, fontStyle = FontStyle.Italic)
                    Text(text = "Midnights ", color = Color.DarkGray, fontStyle = FontStyle.Italic)
                    Text(text = "The Tortured Poets Department", color = Color.Gray, fontStyle = FontStyle.Italic)
                }
            }
            Text(
                text = "Miley Cyrus",
                fontStyle = FontStyle.Italic,
                fontWeight = FontWeight.Bold, letterSpacing = 1.sp
            )
            Image(
                modifier = Modifier
                    .fillMaxWidth()
                    .height(400.dp),
                painter = painterResource(id = R.drawable.mileycover),
                contentDescription = "Cover Miley Cyrus"
            )
            Row(modifier = Modifier.padding(top = 10.dp)) {
                Image(
                    painter = painterResource(id = R.drawable.baseline_favorite_24),
                    contentDescription = "Like",
                    modifier = Modifier.clickable {counterLike++})
                Text(text = counterLike.toString(), color = Color.Black, modifier = Modifier.padding(start = 3.dp))
                Image(
                    painter = painterResource(id = R.drawable.circulo_guardado),
                    contentDescription = "Save",
                    modifier = Modifier.clickable {counterFav++}
                )
                Text(text = counterFav.toString(), color = Color.Black, modifier = Modifier.padding(start = 3.dp))
                Image(
                    painter = painterResource(id = R.drawable.agregar_comentario),
                    contentDescription = "Comment",
                    modifier = Modifier.clickable {counterComment++}
                )
                Text(text = counterComment.toString(), color = Color.Black, modifier = Modifier.padding(start = 3.dp))
            }
            LazyRow(horizontalArrangement = Arrangement.SpaceBetween,
                modifier = Modifier
                    .fillMaxWidth()
                    .padding(5.dp)){
                item {
                    Text(text = "Miley Cyrus", color = Color.Gray, fontStyle = FontStyle.Italic)
                    Text(text = "Breakout", color = Color.DarkGray, fontStyle = FontStyle.Italic)
                    Text(text = "Can't Be Tamed", color = Color.Gray, fontStyle = FontStyle.Italic)
                    Text(text = "Bangerz", color = Color.DarkGray, fontStyle = FontStyle.Italic)
                    Text(text = "Miley Cyrus & Her Dead Petz", color = Color.Gray, fontStyle = FontStyle.Italic)
                    Text(text = "Younger Now", color = Color.Gray, fontStyle = FontStyle.Italic)
                    Text(text = "Plastic Hearts", color = Color.Gray, fontStyle = FontStyle.Italic)
                    Text(text = "Endless Summer Vacation", color = Color.DarkGray, fontStyle = FontStyle.Italic)
                }
            }

        }
    }
}

