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


    val sideDishes: List<LunchOptionUiState> = listOf(
        LunchOptionUiState(
            title = "Cum luna tolerare, omnes rumores imitari primus, pius gloses. ",
            description = "Faith happens when you gain shame so substantially that whatsoever you are empowering is your tantra.",
            price = 6.0
        ),
        LunchOptionUiState(
            title = "pull",
            description = "A falsis, exemplar talis aonides.",
            price = 4.0
        ),
        LunchOptionUiState(
            title = "rent",
            description = "It is an ancient collision course, sir.",
            price = 3.0
        )
    )

    val accompaniments: List<LunchOptionUiState> = listOf(
        LunchOptionUiState(
            title = "invent",
            description = "Sunt elevatuses carpseris velox, bi-color devirginatoes.",
            price = 2.0
        ),
        LunchOptionUiState(
            title = "behind",
            description = "Cur canis trabem?",
            price = 6.0
        )
    )
}