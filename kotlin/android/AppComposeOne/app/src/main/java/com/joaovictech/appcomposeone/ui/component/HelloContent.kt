package com.joaovictech.appcomposeone.ui.component

import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.OutlinedTextField
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.Modifier
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.joaovictech.appcomposeone.R
import com.joaovictech.appcomposeone.ui.theme.AppComposeOneTheme
import com.joaovictech.appcomposeone.ui.theme.Typography

@Composable
fun HelloContent(modifier: Modifier = Modifier) {
    Column(modifier = modifier.padding(16.dp)) {
        var name by remember { mutableStateOf("") }
        if (name.isNotEmpty()) {
            Text(
                text = stringResource(R.string.hello_name, name),
                modifier = Modifier.padding(bottom = 8.dp),
                style = Typography.bodyMedium
            )
        }
        OutlinedTextField(
            value = name,
            onValueChange = { updatedText -> name = updatedText },
            label = { Text(text = stringResource(id = R.string.name)) },
        )
    }
}

@Preview(showBackground = true)
@Composable
fun HelloContentPreview() {
    AppComposeOneTheme {
        HelloContent()
    }
}