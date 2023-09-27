package com.jetpack.compose.lunchtray.ui.common.states

data class LunchOptionUiState(
    var isSelected: Boolean = false,
    val title: String = "",
    val description: String = "",
    val price: Double = 0.0
)