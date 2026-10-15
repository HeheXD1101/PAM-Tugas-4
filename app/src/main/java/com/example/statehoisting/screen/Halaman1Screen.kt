package com.example.statehoisting.screen

import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Button
import androidx.compose.material3.Card
import androidx.compose.material3.CardDefaults
import androidx.compose.material3.OutlinedButton
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.lifecycle.viewmodel.compose.viewModel
import com.example.statehoisting.ui.theme.StateHoistingTheme
import com.example.statehoisting.viewmodel.MainViewModel

@Composable
fun Halaman1(
    modifier: Modifier = Modifier,
    viewModel: MainViewModel = viewModel()
) {
    Halaman1Content(
        nim = viewModel.nim,
        nama = viewModel.nama,
        counter = viewModel.counter,
        onUpClick = { viewModel.onUpClick() },
        onDownClick = { viewModel.onDownClick() },
        onResetClick = { viewModel.onResetClick() },
        modifier = modifier
    )
}

@Composable
fun Halaman1Content(
    nim: String,
    nama: String,
    counter: Int,
    onUpClick: () -> Unit,
    onDownClick: () -> Unit,
    onResetClick: () -> Unit,
    modifier: Modifier = Modifier
) {
    Column(
        modifier = modifier
            .fillMaxSize()
            .padding(24.dp),
        horizontalAlignment = Alignment.CenterHorizontally,
        verticalArrangement = Arrangement.Center
    ) {
        Card(
            modifier = Modifier
                .fillMaxWidth()
                .padding(bottom = 24.dp),
            elevation = CardDefaults.cardElevation(defaultElevation = 4.dp)
        ) {
            Column(
                modifier = Modifier
                    .fillMaxWidth()
                    .padding(16.dp)
            ) {
                Spacer(modifier = Modifier.height(8.dp))
                Text(
                    text = "NIM : $nim",
                    fontSize = 16.sp,
                    fontWeight = FontWeight.Medium
                )
                Spacer(modifier = Modifier.height(4.dp))
                Text(
                    text = "Nama: $nama",
                    fontSize = 16.sp,
                    fontWeight = FontWeight.Medium
                )
            }
        }

        Text(
            text = counter.toString(),
            fontSize = 64.sp,
            fontWeight = FontWeight.Bold,
            modifier = Modifier.padding(vertical = 16.dp)
        )

        Spacer(modifier = Modifier.height(16.dp))

        Tombol(text = "Up (+1)", onBtnClick = onUpClick)
        Spacer(modifier = Modifier.height(8.dp))
        Tombol(text = "Down (-1)", onBtnClick = onDownClick)
        Spacer(modifier = Modifier.height(8.dp))

        OutlinedButton(
            onClick = onResetClick,
            modifier = Modifier
                .fillMaxWidth()
                .padding(horizontal = 10.dp)
        ) {
            Text(text = "Reset (0)", fontSize = 24.sp)
        }
    }
}

@Composable
fun Tombol(text: String, onBtnClick: () -> Unit) {
    Button(
        onClick = onBtnClick,
        modifier = Modifier
            .fillMaxWidth()
            .padding(horizontal = 10.dp)
    ) {
        Text(text = text, fontSize = 24.sp)
    }
}

@Preview(showBackground = true)
@Composable
fun Halaman1Preview() {
    StateHoistingTheme {
        Halaman1Content(
            nim = "245150407111037",
            nama = "Muhammad Murfid Kharomen",
            counter = 0,
            onUpClick = {},
            onDownClick = {},
            onResetClick = {}
        )
    }
}
