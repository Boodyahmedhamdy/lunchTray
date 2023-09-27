package com.jetpack.compose.lunchtray.data

import com.jetpack.compose.lunchtray.ui.common.states.LunchOptionUiState

object DataSource {

    val entreeOptions: List<LunchOptionUiState> = listOf(
        LunchOptionUiState(
            title = "Cauliflower",
            description = "whole cauliflower, briend, roasted, and deep fried",
            price = 7.0
        ),
        LunchOptionUiState(
            title = "Three Bean Chili",
            description = "black beans, red beans, kidney beans, slow cooked, topped with onion",
            price = 4.0
        ),
        LunchOptionUiState(
            title = "Mushroom Pasta",
            description = "penne pasta, mashrooms, basil, with plum tomatoes cooked in garlic and olive oil",
            price = 5.5
        ),
        LunchOptionUiState(
            title = "Spicy Black Bean Skillet",
            description = "penne pasta, mashrooms, basil, with plum tomatoes cooked in garlic and olive oil",
            price = 5.5
        ),
    )

}