package com.jetpack.compose.lunchtray.ui.common.components

import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.width
import androidx.compose.material3.Button
import androidx.compose.material3.OutlinedButton
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp

@Composable
fun PositiveAndNegativeButtonsInRow(
    modifier: Modifier = Modifier,
    onPositiveButtonClicked: () -> Unit = {},
    onNegativeButtonClicked: () -> Unit = {},
    positiveButtonText: String = "Next",
    negativeButtonText: String = "Cancel",
) {
    Row(
        modifier = modifier,
        verticalAlignment = Alignment.CenterVertically
    ) {
        // negative button
        OutlinedButton(onClick = onNegativeButtonClicked,
            modifier = Modifier.weight(0.5f)
        ) {
            Text(text = negativeButtonText)
        }
        Spacer(modifier = Modifier.width(8.dp))

        Button(onClick = onPositiveButtonClicked,
            modifier = Modifier.weight(0.5f)
        ) {
            Text(text = positiveButtonText)
        }
    }
}

@Preview
@Composable
fun NextAndCancelButtonsInRowPreview() {
    PositiveAndNegativeButtonsInRow()
}