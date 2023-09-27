package com.jetpack.compose.lunchtray.ui.common.components

import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Divider
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.RadioButton
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.Dp
import androidx.compose.ui.unit.dp
import com.jetpack.compose.lunchtray.ui.common.states.LunchOptionUiState

@Composable
fun LunchOptionItem(
    modifier: Modifier = Modifier,
    state: LunchOptionUiState = LunchOptionUiState(),
    onClick: () -> Unit = {}
) {
    Row(modifier = modifier.padding(8.dp).clickable { onClick() }) {
        // radio button
        Column {
            RadioButton(
                selected = state.isSelected,
                onClick = {

                },
                modifier = Modifier
            )
        }

        // details
        Column {
            // title
            Text(
                text = state.title,
                style = MaterialTheme.typography.bodyLarge,

            )
            Spacer(modifier = Modifier.height(4.dp))
            // description
            Text(
                text = state.description,
                style = MaterialTheme.typography.bodySmall
            )
            Spacer(modifier = Modifier.height(4.dp))
            // formatted price label
            FormattedPriceLabel(
                price = state.price
            )
            Spacer(modifier = Modifier.height(4.dp))
            Divider(thickness = Dp.Hairline)
        }
    }
}

@Preview
@Composable
fun LunchOptionItemPreview() {
    LunchOptionItem()
}