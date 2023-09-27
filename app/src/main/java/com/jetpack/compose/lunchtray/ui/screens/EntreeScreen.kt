package com.jetpack.compose.lunchtray.ui.screens

import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.lazy.items
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.jetpack.compose.lunchtray.data.DataSource
import com.jetpack.compose.lunchtray.ui.common.components.LunchOptionItem
import com.jetpack.compose.lunchtray.ui.common.components.PositiveAndNegativeButtonsInRow
import com.jetpack.compose.lunchtray.ui.common.states.LunchOptionUiState

@Composable
fun EntreeScreen(
    modifier: Modifier = Modifier,
    entreeOptions: List<LunchOptionUiState> = emptyList(),
    onOptionSelected: (LunchOptionUiState) -> Unit = {},
    onNextButtonClicked: () -> Unit = {},
    onCancelButtonClicked: () -> Unit = {}
) {
    var selectedItemTitle by remember {
        mutableStateOf("")
    }
    LazyColumn(
        modifier = modifier
    ) {
        items(entreeOptions) {
            LunchOptionItem(
                state = it.copy(
                    isSelected = it.title == selectedItemTitle
                ),
                onClick = {
                    selectedItemTitle = it.title
                    onOptionSelected(it.copy(isSelected = true))
                }
            )
        }

        item {
            PositiveAndNegativeButtonsInRow(
                onPositiveButtonClicked = onNextButtonClicked,
                onNegativeButtonClicked = onCancelButtonClicked,
                modifier = Modifier.fillMaxWidth().padding(8.dp)
            )
        }
    }
}

@Preview(showSystemUi = true)
@Composable
fun EntreeScreenPreview() {
    EntreeScreen(
        entreeOptions = DataSource.entreeOptions
    )
}