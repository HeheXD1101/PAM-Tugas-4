package com.example.statehoisting

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Scaffold
import androidx.compose.ui.Modifier
import com.example.statehoisting.screen.Halaman1
import com.example.statehoisting.ui.theme.StateHoistingTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContent {
            StateHoistingTheme {
                Scaffold(modifier = Modifier.fillMaxSize()) { innerPadding ->
                    Halaman1(modifier = Modifier.padding(innerPadding))
                }
            }
        }
    }
}
