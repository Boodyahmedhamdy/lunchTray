package com.jetpack.compose.lunchtray.ui.screens

import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.material3.Button
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.tooling.preview.Preview
import com.jetpack.compose.lunchtray.R


/**
 * @param modifier is passed to the first element in this composable but also it performs fillMaxSize() on it
 */
@Composable
fun StartOrderScreen(
    modifier: Modifier = Modifier, 
    onStartButtonClicked: () -> Unit = {}
) {
    Box(
        modifier = modifier.fillMaxSize(),
        contentAlignment = Alignment.Center
    ) {
        Button(onClick = onStartButtonClicked) {
            Text(text = stringResource(R.string.start_order))
        }
    }

}

@Preview
@Composable
fun StartOrderScreenPreview() {
    StartOrderScreen()
}