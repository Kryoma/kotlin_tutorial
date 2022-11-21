package com.example.codelab

import android.os.Bundle
import android.os.Message
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.material.Button
import androidx.compose.material.MaterialTheme
import androidx.compose.material.Surface
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.geometry.Offset
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.Shadow
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.sp
import com.example.codelab.ui.theme.CodeLabTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            CodeLabTheme {
                // A surface container using the 'background' color from the theme
                Surface(
                    modifier = Modifier.fillMaxSize(),
                    color = MaterialTheme.colors.background
                ) {
                    HappyBirthdayWithText(message = "お誕生日おめでとう!", from = "久保ちゃんより")
                }
            }
        }
    }
}

@Composable
fun HappyBirthdayWithText(message: String, from: String) {
    Column {
        Text(text = message, fontSize = 36.sp)
        val offset = Offset(5.0f, 10.0f)
        Text(
            text = from,
            style = TextStyle(
                fontSize = 24.sp,
                shadow = Shadow(
                    color = Color.Cyan,
                    offset = offset,
                    blurRadius = 3f
                )
            )
        )
    }
}
@Preview(showBackground = true)
@Composable
fun DefaultPreview() {
    CodeLabTheme {
        HappyBirthdayWithText(message = "お誕生日おめでとう", from = "久保ちゃんより")
    }
}
