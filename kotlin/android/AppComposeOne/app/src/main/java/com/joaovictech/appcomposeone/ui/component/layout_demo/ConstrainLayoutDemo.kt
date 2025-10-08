package com.joaovictech.appcomposeone.ui.component.layout_demo

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.constraintlayout.compose.ConstraintLayout
import com.joaovictech.appcomposeone.ui.theme.AppComposeOneTheme

/**
 * Aqui temos um exemplo de como usar o ConstraintLayout (Para ligar componentes entre si)
 *
 * Antes de iniciar devemos inserir em bluid.gradle.kts o plugin:
 * * implementation(libs.androidx.constraintlayout.compose.android)
 */
@Composable
fun ConstrainLayoutDemo(modifier: Modifier = Modifier) {
    ConstraintLayout(modifier = modifier
        .fillMaxSize()
        .padding(16.dp)) {
        val (title, subtitle, boxRed, boxGreen, boxBlue) = createRefs()

        Text(
            text = "Título",
            style = MaterialTheme.typography.headlineMedium,
            modifier = Modifier.constrainAs(title) {
                top.linkTo(parent.top)
                start.linkTo(parent.start)
            }
        )
        Text(
            text = "Subtítulo",
            style = MaterialTheme.typography.headlineLarge,
            modifier = Modifier.constrainAs(subtitle) {
                top.linkTo(title.bottom)
                start.linkTo(parent.start)
            }
        )
        Box(
            modifier = Modifier
                .fillMaxWidth()
                .height(100.dp)
                .background(Color.Red)
                .constrainAs(boxRed) {
                    top.linkTo(subtitle.bottom, margin = 8.dp)
                    start.linkTo(parent.start)
                }
        )
        Box(
            modifier = Modifier
                .fillMaxWidth()
                .height(100.dp)
                .background(Color.Green)
                .constrainAs(boxGreen) {
                    top.linkTo(boxRed.bottom, margin = 8.dp)
                    start.linkTo(parent.start)
                }
        )
        Box(
            modifier = Modifier
                .fillMaxWidth()
                .height(100.dp)
                .background(Color.Blue)
                .constrainAs(boxBlue) {
                    top.linkTo(boxGreen.bottom, margin = 8.dp)
                    start.linkTo(parent.start)
                }
        )
    }
}

@Preview(showBackground = true)
@Composable
private fun ConstrainLayoutDemoPreview() {
    AppComposeOneTheme {
        ConstrainLayoutDemo()
    }
}