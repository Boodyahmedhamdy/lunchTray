package com.jetpack.compose.lunchtray.ui.screens

import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.lazy.items
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import com.jetpack.compose.lunchtray.ui.common.components.LunchOptionItem
import com.jetpack.compose.lunchtray.ui.common.components.PositiveAndNegativeButtonsInRow
import com.jetpack.compose.lunchtray.ui.common.states.LunchOptionUiState

@Composable
fun SideDishScreen(
    modifier: Modifier = Modifier,
    sideDishes: List<LunchOptionUiState> = emptyList(),
    onSideDishSelected: (LunchOptionUiState) -> Unit = {},
    onNextButtonClicked: () -> Unit = {},
    onCancelButtonClicked: () -> Unit = {}
) {
    var selectedItemTitle by remember {
        mutableStateOf("")
    }
    LazyColumn(
        modifier = modifier
    ) {
        items(sideDishes) {
            LunchOptionItem(
                state = it.copy(
                    isSelected = it.title == selectedItemTitle
                ),
                onClick = {
                    selectedItemTitle = it.title
                    onSideDishSelected(it.copy(isSelected = true))
                }
            )
        }
        item {
            PositiveAndNegativeButtonsInRow(
                onPositiveButtonClicked = onNextButtonClicked,
                onNegativeButtonClicked = onCancelButtonClicked
            )
        }
    }

}

@Preview
@Composable
fun SideDishScreenPreview() {
    SideDishScreen()
}