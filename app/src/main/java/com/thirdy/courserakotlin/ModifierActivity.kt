package com.thirdy.courserakotlin

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.BorderStroke
import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Button
import androidx.compose.material3.ButtonDefaults
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp

class Modifier : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            MainComponent()
        }
    }
}


@Composable
fun MainComponent() {
    Column(
        verticalArrangement = Arrangement.Top,
        horizontalAlignment = Alignment.Start,
        modifier = Modifier
            .fillMaxSize()
            .background(Color(0XFF495E57))
        ) {
        Text(
            text = "Thirdy Graphics",
            fontSize = 32.sp,
            color = Color(0xFFF4CE14),
            modifier = Modifier.padding(start = 20.dp, top = 20.dp)

        )
        Text(
            text ="Pasig",
            fontSize = 32.sp,
            color = Color(0xFFF4CE14),
            modifier = Modifier.padding(start = 20.dp)
        )
        Row(
            Modifier.fillMaxSize(),
            horizontalArrangement = Arrangement.Center,
            ) {
            Button(onClick = { /*TODO*/ },
                border = BorderStroke(1.dp, Color.Red),
                colors = ButtonDefaults.buttonColors(Color.Blue)
                ) {
                Text(text = stringResource(R.string.Order))
            }
            Image(painter = painterResource(id = R.drawable.tagaytay),
                contentDescription = "tagayta",
                Modifier.height(100.dp)
                )
        }

    }
}



