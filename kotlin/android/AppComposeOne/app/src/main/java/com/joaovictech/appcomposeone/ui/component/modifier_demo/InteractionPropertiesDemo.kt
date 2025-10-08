package com.joaovictech.appcomposeone.ui.component.modifier_demo

import android.widget.Toast
import androidx.compose.foundation.ExperimentalFoundationApi
import androidx.compose.foundation.background
import androidx.compose.foundation.clickable
import androidx.compose.foundation.combinedClickable
import androidx.compose.foundation.gestures.Orientation
import androidx.compose.foundation.gestures.detectTapGestures
import androidx.compose.foundation.gestures.draggable
import androidx.compose.foundation.gestures.rememberDraggableState
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.offset
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.input.pointer.pointerInput
import androidx.compose.ui.platform.LocalContext
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.IntOffset
import androidx.compose.ui.unit.dp
import com.joaovictech.appcomposeone.ui.theme.AppComposeOneTheme
import kotlin.math.roundToInt

@OptIn(ExperimentalFoundationApi::class)
@Composable
fun InteractionPropertiesDemo(modifier: Modifier = Modifier) {
    val context = LocalContext.current

    Column(
        modifier = modifier
            .fillMaxSize()
            .padding(16.dp),
        verticalArrangement = Arrangement.spacedBy(16.dp),
        horizontalAlignment = Alignment.CenterHorizontally
    ) {
        // Clicavel (simples)
        Box(
            modifier = Modifier
                .size(width = 300.dp, height = 100.dp)
                .background(Color.Green)
                .clickable {
                    Toast.makeText(context, "Box clicado!", Toast.LENGTH_SHORT).show()
                }
        )

        // Combinacão de clicaveis (clique curto e longo)
        Box(
            modifier = Modifier
                .size(width = 300.dp, height = 100.dp)
                .background(Color.Red)
                .combinedClickable(
                    onClick = {
                        Toast.makeText(context, "Box clicado!", Toast.LENGTH_SHORT).show()
                    },
                    onLongClick = {
                        Toast.makeText(context, "Box longo clicado!", Toast.LENGTH_SHORT).show()
                    },
                    onDoubleClick = {
                        Toast.makeText(context, "Box duplo clicado!", Toast.LENGTH_SHORT).show()
                    }
                )
        )

        // Draggable - arraste horizontal
        var offsetX by remember { mutableStateOf(0f) }
        Box(
            modifier = Modifier
                .offset { IntOffset(x = offsetX.roundToInt(), y = 0) }
                .size(width = 300.dp, height = 100.dp)
                .background(Color.Blue)
                .draggable(
                    orientation = Orientation.Horizontal,
                    state = rememberDraggableState { delta ->
                        offsetX += delta
                    }
                )
        )

        // Point Input
        Box(
            modifier = Modifier
                .size(width = 300.dp, height = 100.dp)
                .background(Color.Magenta)
                .pointerInput(Unit) {
                    detectTapGestures(
                        onTap = {
                            Toast.makeText(context, "Tap!", Toast.LENGTH_SHORT).show()
                        }
                    )
                }
        )
    }
}

@Preview(showBackground = true)
@Composable
private fun InteractionPropertiesDemoPreview() {
    AppComposeOneTheme {
        InteractionPropertiesDemo()
    }
}