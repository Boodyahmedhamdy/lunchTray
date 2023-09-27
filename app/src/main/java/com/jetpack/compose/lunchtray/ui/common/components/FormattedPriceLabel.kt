package com.jetpack.compose.lunchtray.ui.common.components

import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.tooling.preview.Preview


/**
 * @param price the value to be represented
 * @param currencySign the sign for the currency that the [price] is
 * @param style to control the style of the text, its type is [TextStyle]
 * @param modifier to control the composable
 */

@Composable
fun FormattedPriceLabel(
    modifier: Modifier = Modifier,
    price: Double = 0.0,
    currencySign: String = "$",
    style: TextStyle = MaterialTheme.typography.labelSmall,
    prefixString: String = ""
) {
    Text(
        text = "$prefixString$currencySign $price",
        modifier = modifier,
        style = style
    )
}

@Preview
@Composable
fun FormattedPriceLabelPreview() {
    FormattedPriceLabel()
}