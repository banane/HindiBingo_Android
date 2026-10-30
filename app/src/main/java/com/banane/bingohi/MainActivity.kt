package com.banane.bingohi

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import com.banane.bingokit.BingoApp

/** The whole app: BingoKit on Hindi Bingo's content in assets/content/. */
class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent { BingoApp() }
    }
}
