package com.joaovictech.appcomposeone.ui.component.modifier_demo

import androidx.compose.foundation.background
import androidx.compose.foundation.border
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.shadow
import androidx.compose.ui.graphics.Brush
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.graphicsLayer
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.joaovictech.appcomposeone.ui.theme.AppComposeOneTheme

const val X = 100

@Composable
fun VisualPropertiesDemo(modifier: Modifier = Modifier) {
    Column(
        modifier = modifier
            .fillMaxSize()
            .padding(16.dp),
        horizontalAlignment = Alignment.CenterHorizontally,
        verticalArrangement = Arrangement.spacedBy(16.dp),
    ) {
        // Background color
        Box(
            modifier = Modifier
                .size(100.dp)
                .background(
                    brush = Brush.radialGradient(
                        listOf(
                            Color.Red,
                            Color.Yellow,
                            Color.Transparent
                        )
                    )
                )
        )
        Box(
            modifier = Modifier
                .size(100.dp)
                .background(
                    Color(red = 0, green = 255, blue = 0, alpha = 255),
                )
        )

        // Borda E Sombras
        Box(modifier = Modifier
            .size(100.dp)
            .shadow(elevation = 8.dp, shape = RoundedCornerShape(8.dp)) // CircleShape
            .border(
                width = 3.dp,
                color = Color.Yellow,
                shape = RoundedCornerShape(8.dp), // CircleShape
            )
            .background( Color.Blue ))

        // Graphics Layer
        Box(modifier = Modifier
            .size(200.dp)
            .graphicsLayer {
                val rotationZ = X * 0.15f
                this.rotationZ = rotationZ
                rotationX = 15f
                scaleY = 2f
                alpha = 0.5f
            }
            .shadow(elevation = 8.dp, shape = RoundedCornerShape(8.dp))
            .border(
                width = 6.dp,
                color = Color.Red,
                shape = RoundedCornerShape(8.dp),
            )
            .background( Color.Blue ))
    }
}

@Preview(showBackground = true)
@Composable
private fun VisualPropertiesDemoPreview() {
    AppComposeOneTheme {
        VisualPropertiesDemo()
    }
}