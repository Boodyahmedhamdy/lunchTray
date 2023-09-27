package com.jetpack.compose.lunchtray.ui.screens

import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Divider
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.Dp
import androidx.compose.ui.unit.dp
import com.jetpack.compose.lunchtray.OrderUiState
import com.jetpack.compose.lunchtray.ui.common.components.FormattedPriceLabel
import com.jetpack.compose.lunchtray.ui.common.components.PositiveAndNegativeButtonsInRow
import com.jetpack.compose.lunchtray.ui.common.states.LunchOptionUiState

@Composable
fun CheckoutScreen(
    modifier: Modifier = Modifier,
    state: OrderUiState = OrderUiState(),
    onSubmitButtonClicked: () -> Unit = {},
    onCancelButtonClicked: () -> Unit = {}
) {
    Column(
        modifier.fillMaxWidth()
    ) {
        Text(text = "Order Summary",
            fontWeight = FontWeight.Bold)

        PriceDetailsItem(state = state.entree)
        PriceDetailsItem(state = state.sideDish)
        PriceDetailsItem(state = state.accompaniment)

        Divider(thickness = Dp.Hairline)

        Box(
            modifier = Modifier.fillMaxWidth(),
            contentAlignment = Alignment.BottomEnd
        ) {
            FormattedPriceLabel(
                price = state.subtotal,
                prefixString = "Subtotal: "
            )
        }
        Box(
            modifier = Modifier.fillMaxWidth(),
            contentAlignment = Alignment.BottomEnd
        ) {
            FormattedPriceLabel(
                price = state.tax,
                prefixString = "Tax: "
            )
        }
        Box(
            modifier = Modifier.fillMaxWidth(),
            contentAlignment = Alignment.BottomEnd
        ) {
            FormattedPriceLabel(
                price = state.total,
                prefixString = "Total: "
            )
        }

        PositiveAndNegativeButtonsInRow(
            onPositiveButtonClicked = onSubmitButtonClicked,
            onNegativeButtonClicked = onCancelButtonClicked,
            positiveButtonText = "Submit"
        )

    }

    // summary section
    // divider
    // price section
    // buttons


}

@Composable
private fun PriceDetailsItem(
    modifier: Modifier = Modifier,
    state: LunchOptionUiState = LunchOptionUiState()
) {
    Row(
        horizontalArrangement = Arrangement.SpaceBetween,
        modifier = modifier
            .fillMaxWidth()
            .padding(8.dp)
    ) {
        // name
        Text(text = state.title)

        // price using formatted label
        FormattedPriceLabel(price = state.price)
    }
}


@Preview(showSystemUi = true)
@Composable
fun CheckoutScreenPreview() {
    CheckoutScreen()
}