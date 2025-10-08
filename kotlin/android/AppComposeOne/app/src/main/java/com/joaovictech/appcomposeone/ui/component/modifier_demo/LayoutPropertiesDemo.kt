package com.joaovictech.appcomposeone.ui.component.modifier_demo

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.aspectRatio
import androidx.compose.foundation.layout.fillMaxHeight
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.offset
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.layout.width
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.joaovictech.appcomposeone.ui.theme.AppComposeOneTheme

@Composable
fun LayoutPropertiesDemo(modifier: Modifier = Modifier) {
    Column(
        modifier = modifier
            .fillMaxSize()
            .padding(start = 16.dp, end = 16.dp, top = 8.dp, bottom = 8.dp),
        verticalArrangement = Arrangement.spacedBy(16.dp),
        horizontalAlignment = Alignment.CenterHorizontally
    ) {
        // Tamanho fixo
        Box(
            modifier = Modifier
//                .size(100.dp)
                .width(100.dp)
                .height(50.dp)
                .background(Color.Green)
        )

        // Preechimento baseado em largura e altura total
        Box(
            modifier = Modifier
                .fillMaxHeight(0.5f) // 0.5f -> 50%
                .width(100.dp)
                .background(Color.Red)
        )

        // Offset de posicão
        Box(
            modifier = Modifier
                .size(100.dp)
                .offset(x = (-100).dp, y = 25.dp)
                .background(Color.Blue)
        )

        // Aspect ratio fixo
        Box(
            modifier = Modifier
                .height(100.dp)
                .aspectRatio(16f / 9f)
                .background(Color.Magenta)
        )

        // Distribuicão de espaco
        Row(
            modifier = Modifier
                .fillMaxWidth()
                .height(300.dp)
                .background(Color.Gray),
        ) {
            Box(
                modifier = Modifier
                    .weight(1f)
                    .fillMaxHeight()
                    .background(Color.Green)
            )

            Box(
                modifier = Modifier
                    .weight(3f)
                    .fillMaxHeight()
                    .background(Color.Yellow)
            )
        }
    }
}

@Preview(showBackground = true)
@Composable
private fun LayoutPropertiesDemoPreview() {
    AppComposeOneTheme {
        LayoutPropertiesDemo()
    }
}
