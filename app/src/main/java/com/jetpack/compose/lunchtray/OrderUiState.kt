package com.jetpack.compose.lunchtray

import com.jetpack.compose.lunchtray.ui.common.states.LunchOptionUiState

data class OrderUiState(
    val entree: LunchOptionUiState = LunchOptionUiState(),
    val sideDish: LunchOptionUiState = LunchOptionUiState(),
    val accompaniment: LunchOptionUiState = LunchOptionUiState(),
    val subtotal: Double = 0.0,
    val tax: Double = 0.0,
    val total: Double = subtotal + tax
) {

}
