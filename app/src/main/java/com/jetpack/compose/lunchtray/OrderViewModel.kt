package com.jetpack.compose.lunchtray

import androidx.lifecycle.ViewModel
import com.jetpack.compose.lunchtray.ui.common.states.LunchOptionUiState
import kotlinx.coroutines.flow.MutableStateFlow
import kotlinx.coroutines.flow.asStateFlow
import kotlinx.coroutines.flow.update

class OrderViewModel: ViewModel() {

    private val _state = MutableStateFlow(OrderUiState())
    val state = _state.asStateFlow()

    fun setEntree(entree: LunchOptionUiState) {
        _state.update {
            it.copy(entree = entree)
        }
    }
    fun setSideDish(sideDish: LunchOptionUiState) {
        _state.update {
            it.copy(sideDish = sideDish)
        }
    }
    fun setAccompaniment(accompaniment: LunchOptionUiState) {
        _state.update {
            it.copy(accompaniment = accompaniment)
        }
    }
    fun updateSubtotal() {
        val subtotal = _state.value.entree.price +
                _state.value.sideDish.price +
                _state.value.accompaniment.price
        _state.update {
            it.copy(
                subtotal = subtotal,
                total = subtotal + it.tax
            )
        }
    }
    fun resetOrder() {
        _state.value = OrderUiState()
    }

}