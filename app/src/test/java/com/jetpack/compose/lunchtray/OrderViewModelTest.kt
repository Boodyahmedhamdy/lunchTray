package com.jetpack.compose.lunchtray

import com.jetpack.compose.lunchtray.ui.common.states.LunchOptionUiState
import org.junit.Assert.assertEquals
import org.junit.Test

class OrderViewModelTest {

    @Test
    fun testInitialState()  {
        val viewModel = OrderViewModel()
        val expectedState = OrderUiState()
        assertEquals(expectedState, viewModel.state.value)
    }
    @Test
    fun testSetEntree() {
        val viewModel = OrderViewModel()
        val entree = LunchOptionUiState(title = "Entree", price = 10.0)
        viewModel.setEntree(entree)
        val expectedState = OrderUiState(entree = entree)
        assertEquals(expectedState, viewModel.state.value)
    }
}