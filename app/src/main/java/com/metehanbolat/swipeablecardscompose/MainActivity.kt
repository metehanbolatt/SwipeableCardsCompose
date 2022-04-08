package com.metehanbolat.swipeablecardscompose

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import com.metehanbolat.swipeablecardscompose.ui.theme.SwipeableCardsComposeTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            SwipeableCardsComposeTheme {

            }
        }
    }
}
