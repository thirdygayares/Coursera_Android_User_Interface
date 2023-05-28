package com.thirdy.courserakotlin

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.material3.Button
import androidx.compose.material3.Text
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.unit.sp
import androidx.leanback.widget.Row


class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent{
            Column() {
                Text(
                    text = "Little Lemon", fontSize = 32.sp,
                    color= Color(0xFFF4CE14)
                )
                Text(
                    text = stringResource(id = R.string.firstname), fontSize = 32.sp,
                    color= Color(0xFFF4CE14)
                )

                Row(){
                    Button(onClick = { /*TODO*/ }) {
                        Text(text = stringResource(id = R.string.send))
                    }
                    Button(onClick = { /*TODO*/ }) {
                        Text(text = stringResource(id = R.string.receive))
                    }
                }


            }


        }

    }
}