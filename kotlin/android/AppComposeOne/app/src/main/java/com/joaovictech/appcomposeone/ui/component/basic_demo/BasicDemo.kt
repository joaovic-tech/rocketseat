package com.joaovictech.appcomposeone.ui.component.basic_demo

import android.widget.Toast
import androidx.compose.foundation.BorderStroke
import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.AccountCircle
import androidx.compose.material.icons.filled.Close
import androidx.compose.material.icons.filled.Favorite
import androidx.compose.material3.Button
import androidx.compose.material3.ButtonColors
import androidx.compose.material3.ButtonDefaults
import androidx.compose.material3.Card
import androidx.compose.material3.CardDefaults
import androidx.compose.material3.Checkbox
import androidx.compose.material3.CheckboxDefaults
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.Icon
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.OutlinedButton
import androidx.compose.material3.OutlinedTextField
import androidx.compose.material3.RadioButton
import androidx.compose.material3.Switch
import androidx.compose.material3.SwitchDefaults
import androidx.compose.material3.Text
import androidx.compose.material3.TextField
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Brush
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.platform.LocalContext
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.joaovictech.appcomposeone.R
import com.joaovictech.appcomposeone.ui.theme.AppComposeOneTheme

@OptIn(ExperimentalMaterial3Api::class)
@Composable
fun BasicDemo(modifier: Modifier = Modifier) {
    Column(
        modifier = modifier.fillMaxSize().padding(16.dp),
        verticalArrangement = Arrangement.SpaceBetween,
        horizontalAlignment = Alignment.CenterHorizontally
    ) {
        // Text
        Text(text = "Texto")
        // Buttons
        val context = LocalContext.current
        Button(
            modifier = Modifier.fillMaxWidth(),
            shape = RoundedCornerShape(size = 8.dp),
            border = BorderStroke(
                width = 2.dp, brush = Brush.linearGradient(
                    colors = listOf(
                        Color.Red, Color.Blue
                    )
                )
            ),
            colors = ButtonColors(
                containerColor = Color.DarkGray,
                contentColor = Color.Black,
                disabledContainerColor = Color.LightGray,
                disabledContentColor = Color.DarkGray
            ),
            elevation = ButtonDefaults.elevatedButtonElevation(defaultElevation = 8.dp),
            onClick = {
                Toast.makeText(context, "Click", Toast.LENGTH_SHORT).show()
            }
        ) {
            Row {
                // Imagem
                Image(
                    modifier = Modifier.size(33.dp),
                    painter = painterResource(R.drawable.ic_launcher_foreground),
                    contentDescription = null
                )

                // Espacamento
                Spacer(modifier = Modifier.width(8.dp))

                // Text
                Text(text = "Button", color = Color.White)

                // Espacamento
                Spacer(modifier = Modifier.width(8.dp))

                // Icon
                Icon(
                    imageVector = Icons.Default.Favorite,
                    contentDescription = null,
                    tint = Color.Red
                )
            }
        }
        OutlinedButton(
            modifier = Modifier.fillMaxWidth(),
            shape = RoundedCornerShape(size = 8.dp),
            border = BorderStroke(
                width = 2.dp, brush = Brush.linearGradient(
                    colors = listOf(
                        Color.Red, Color.Blue
                    )
                )
            ),
            onClick = {
                Toast.makeText(context, "Click", Toast.LENGTH_SHORT).show()
            }
        ) {
            Row {
                // Text
                Text(text = "Button")

                // Icon
                Icon(
                    imageVector = Icons.Default.Favorite,
                    contentDescription = null,
                    tint = Color.Red
                )
            }
        }

        // Checkbox
        Column {
            var isChecked1 by remember { mutableStateOf(true) }
            var isChecked2 by remember { mutableStateOf(false) }

            Row(
                modifier = Modifier.fillMaxWidth(),
                verticalAlignment = Alignment.CenterVertically
            ) {
                Checkbox(
                    checked = isChecked1,
                    onCheckedChange = { isChecked1 = it },
                    colors = CheckboxDefaults.colors(checkedColor = Color.Magenta)
                )
                Text(text = "Item 1")
            }
            Row(
                modifier = Modifier.fillMaxWidth(),
                verticalAlignment = Alignment.CenterVertically
            ) {
                Checkbox(
                    checked = isChecked2,
                    onCheckedChange = { isChecked2 = it },
                    colors = CheckboxDefaults.colors(checkedColor = Color.Magenta)
                )
                Text(text = "Item 2")
            }
        }

        // Switch
        var isChecked by remember { mutableStateOf(false) }
        Switch(
            checked = isChecked,
            onCheckedChange = { isChecked = it },
            colors = SwitchDefaults.colors(
                checkedThumbColor = Color.Magenta,
                checkedTrackColor = Color.Magenta.copy(alpha = 0.5f),
                uncheckedThumbColor = Color.Gray,
                uncheckedTrackColor = Color.Gray.copy(alpha = 0.5f)
            ),
            thumbContent = {
                Icon(
                    imageVector = Icons.Default.Close,
                    contentDescription = null
                )
            }
        )

        // Card
        var username by remember { mutableStateOf("João Victor") }
        Card(
            colors = CardDefaults.cardColors(
                containerColor = MaterialTheme.colorScheme.surfaceVariant,
            ),
            modifier = Modifier.fillMaxWidth(),
            elevation = CardDefaults.cardElevation(defaultElevation = 4.dp),
            border = BorderStroke(width = 2.dp, color = Color.Red)
        ) {
            Column(Modifier.padding(24.dp)) {
                Row {
                    Icon(
                        imageVector = Icons.Default.AccountCircle,
                        contentDescription = "Account",
                        tint = Color.Red
                    )
                    Spacer(modifier = Modifier.width(8.dp))
                    Column {
                        Text(username, fontWeight = FontWeight.W700)
                        Text("+55 (48) 9 99227431")
                        Text("Santa Catarina, Brasil", color = Color.Gray)
                    }
                }
            }
        }

        // TextField
        TextField(
            value = username,
            onValueChange = { text ->
                username = text
            },
            placeholder = {
                Text("Placeholder")
            },
            supportingText = {
                Text(text = "(Edite o nome do usuário no card acima)")
            },
            label = {
                Text("Label")
            },
            leadingIcon = {
                Icon(imageVector = Icons.Default.AccountCircle, contentDescription = "Account")
            }
        )

        // OutlinedTextField
        OutlinedTextField(
            value = username,
            onValueChange = { text ->
                username = text
            },
            placeholder = {
                Text("Placeholder")
            },
            supportingText = {
                Text(text = "(Edite o nome do usuário no card acima)")
            },
            label = {
                Text("Label")
            },
            leadingIcon = {
                Icon(imageVector = Icons.Default.AccountCircle, contentDescription = "Account")
            }
        )

        // Botão de selecao unica
        Row(verticalAlignment = Alignment.CenterVertically) {
            RadioButton(
                selected = true,
                onClick = {
                    Toast.makeText(context, "Click", Toast.LENGTH_SHORT).show()
                }
            )
            Text(text = "Botão de selecao unica")
        }
    }
}

@Preview(showBackground = true)
@Composable
private fun BasicDemoPreview() {
    AppComposeOneTheme {
        BasicDemo()
    }
}