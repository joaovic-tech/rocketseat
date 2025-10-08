package com.joaovictech.appcomposeone

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.PaddingValues
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Scaffold
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.joaovictech.appcomposeone.ui.component.ChooseMyFavoriteHeroScreen
import com.joaovictech.appcomposeone.ui.theme.AppComposeOneTheme
import com.joaovictech.appcomposeone.ui.component.HelloContent
import com.joaovictech.appcomposeone.ui.component.basic_demo.BasicDemo
import com.joaovictech.appcomposeone.ui.component.modifier_demo.InteractionPropertiesDemo

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContent {
            AppComposeOneTheme {
                Scaffold { innerPadding ->
//                    InitialComponents(innerPadding)
//                    BasicDemo(Modifier.padding(innerPadding))
                    ChooseMyFavoriteHeroScreen(Modifier.padding(innerPadding))
                }
            }
        }
    }
}

@Composable
fun InitialComponents(padding: PaddingValues) {
    Column(
        modifier = Modifier
            .fillMaxSize()
            .padding(16.dp)
            .padding(padding),
        horizontalAlignment = Alignment.CenterHorizontally,
        verticalArrangement = Arrangement.spacedBy(16.dp)
    ) {
        HelloContent(Modifier.padding(padding))
        InteractionPropertiesDemo(Modifier.padding(padding))
    }
}

@Preview(showBackground = true)
@Composable
private fun InitialComponentsPreview() {
    InitialComponents(PaddingValues())
}
