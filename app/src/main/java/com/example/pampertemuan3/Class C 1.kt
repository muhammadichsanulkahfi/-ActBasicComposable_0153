package com.example.pampertemuan3

import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.rememberScrollState
import androidx.compose.foundation.verticalScroll
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp

// ===== Identitas =====
@Composable
fun Identitas(modifier: Modifier = Modifier) {
    Column(modifier = modifier.padding(20.dp)) {
        Text(text = "Muhammad Ikhsanul Kahfi", fontWeight = FontWeight.Bold)
        Text(text = "NIM 20240140153")
    }
}

// ===== 1. Column =====
@Composable
fun TataletakColumn(modifier: Modifier = Modifier) {
    Column(modifier = modifier.padding(top = 20.dp, start = 20.dp, end = 20.dp)) {
        Text(text = "Komponen1")
        Text(text = "Komponen2")
        Text(text = "Komponen3")
        Text(text = "Komponen4")
    }
}

// ===== 2. Row =====
@Composable
fun TataletakRow(modifier: Modifier = Modifier) {
    Row(
        modifier = modifier.fillMaxWidth(),
        horizontalArrangement = Arrangement.SpaceEvenly
    ) {
        Text(text = "Komponen1")
        Text(text = "Komponen2")
        Text(text = "Komponen3")
        Text(text = "Komponen4")
    }
}

// ===== 3. Box =====
@Composable
fun TataletakBox(modifier: Modifier = Modifier) {
    Box(
        modifier = modifier.fillMaxWidth().padding(vertical = 20.dp),
        contentAlignment = Alignment.Center
    ) {
        Text(text = "Box 1")
        Column {
            Text(text = "Column 1")
            Text(text = "Column 2")
        }
        Row {
            Text(text = "Row 1")
        }
        Text(text = "Box 2")
    }
}

// ===== 4. Column berisi Row =====
@Composable
fun TataletakColumnRow(modifier: Modifier = Modifier) {
    Column(modifier = modifier) {
        // Baris 1
        Row(
            modifier = Modifier.fillMaxWidth(),
            horizontalArrangement = Arrangement.SpaceEvenly
        ) {
            Text(text = "Komponen1Baris1")
            Text(text = "Komponen2Baris1")
            Text(text = "Komponen3Baris1")
        }
        // Baris 2
        Row(
            modifier = Modifier.fillMaxWidth(),
            horizontalArrangement = Arrangement.SpaceEvenly
        ) {
            Text(text = "Komponen1Baris2")
            Text(text = "Komponen2Baris2")
            Text(text = "Komponen3Baris2")
        }
    }
}

// ===== 5. Row berisi Column =====
@Composable
fun TataletakRowColumn(modifier: Modifier = Modifier) {
    Row(
        modifier = modifier.fillMaxWidth(),
        horizontalArrangement = Arrangement.SpaceEvenly
    ) {
        // Kolom 1
        Column {
            Text(text = "Komponen1Kolom1")
            Text(text = "Komponen2Kolom1")
            Text(text = "Komponen3Kolom1")
        }
        // Kolom 2
        Column {
            Text(text = "Komponen1Kolom2")
            Text(text = "Komponen2Kolom2")
            Text(text = "Komponen3Kolom2")
        }
    }
}

// ===== Halaman gabungan =====
@Composable
fun HalamanTataletak(modifier: Modifier = Modifier) {
    Column(
        modifier = modifier
            .fillMaxSize()
            .verticalScroll(rememberScrollState())
    ) {
        Identitas()
        TataletakColumn()
        TataletakRow(Modifier.padding(vertical = 16.dp))
        TataletakBox()
        TataletakColumnRow(Modifier.padding(vertical = 16.dp))
        TataletakRowColumn()
    }
}

@Preview(showBackground = true)
@Composable
fun HalamanTataletakPreview() {
    MaterialTheme { HalamanTataletak() }
}
@Composable
fun TataletakBox(modifier: Modifier = Modifier) {
    Box(
        modifier = modifier
            .fillMaxWidth()
            .padding(vertical = 20.dp),
        contentAlignment = Alignment.Center
    ) {
        Text(text = "Box 1")
        Column {
            Text(text = "Column 1")
            Text(text = "Column 2")
        }
        Row {
            Text(text = "Row 1")
        }
        Text(text = "Box 2")
    }
}