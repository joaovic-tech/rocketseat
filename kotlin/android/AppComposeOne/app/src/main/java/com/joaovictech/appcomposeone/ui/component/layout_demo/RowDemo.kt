package com.joaovictech.appcomposeone.ui.component.layout_demo

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxHeight
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.width
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.joaovictech.appcomposeone.ui.theme.AppComposeOneTheme

@Composable
fun RowDemo(modifier: Modifier = Modifier) {
    Row (
        modifier = modifier.fillMaxSize(),
        horizontalArrangement = Arrangement.SpaceBetween,
        verticalAlignment = Alignment.CenterVertically
    ) {
        Text("Hello Row Android!", fontWeight = FontWeight.Bold)
        Box(modifier = Modifier.fillMaxHeight().width(20.dp).background(Color.Yellow))
        Box(modifier = Modifier.fillMaxHeight().width(20.dp).background(Color.Red))
        Box(modifier = Modifier.fillMaxHeight().width(20.dp).background(Color.Green))
        Box(modifier = Modifier.fillMaxHeight().width(20.dp).background(Color.Blue))
        Box(modifier = Modifier.fillMaxHeight().width(20.dp).background(Color.Magenta))
    }
}

@Preview(showBackground = true, showSystemUi = true)
@Composable
private fun RowPreview() {
    AppComposeOneTheme {
        Scaffold { innerPadding ->
            RowDemo(modifier = Modifier.padding(innerPadding))
        }
    }
}