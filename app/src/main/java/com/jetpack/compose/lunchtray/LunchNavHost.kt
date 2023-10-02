package com.jetpack.compose.lunchtray

import androidx.compose.runtime.Composable
import androidx.compose.runtime.collectAsState
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import androidx.navigation.NavController
import androidx.navigation.NavHostController
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import com.jetpack.compose.lunchtray.data.DataSource
import com.jetpack.compose.lunchtray.ui.screens.AccompanimentScreen
import com.jetpack.compose.lunchtray.ui.screens.CheckoutScreen
import com.jetpack.compose.lunchtray.ui.screens.EntreeScreen
import com.jetpack.compose.lunchtray.ui.screens.Screens
import com.jetpack.compose.lunchtray.ui.screens.SideDishScreen
import com.jetpack.compose.lunchtray.ui.screens.StartOrderScreen

@Composable
fun LunchNavHost(
    navController: NavHostController,
    viewModel: OrderViewModel,
    modifier: Modifier = Modifier
) {
    val uiState = viewModel.state.collectAsState()

    NavHost(
        navController = navController, startDestination = Screens.Start.name,
        modifier = modifier
    ) {
        composable(
            Screens.Start.name
        ) {
            StartOrderScreen(
                onStartButtonClicked = {
                    navController.navigate(Screens.Entree.name)
                }
            )
        }

        composable(Screens.Entree.name) {
            EntreeScreen(
                entreeOptions = DataSource.entreeOptions,
                onNextButtonClicked = {
                    navController.navigate(Screens.SideDish.name)
                    println("${viewModel.state.value}")
                },
                onCancelButtonClicked = {
                    resetOrder(navController, viewModel)
                },
                onOptionSelected = { entree ->
                    viewModel.setEntree(entree)
                }
            )
        }

        composable(Screens.SideDish.name) {
            SideDishScreen(
                sideDishes = DataSource.sideDishes,
                onNextButtonClicked = {
                    navController.navigate(Screens.Accompaniment.name)
                    println("${viewModel.state.value}")
                },
                onCancelButtonClicked = {
                    resetOrder(navController, viewModel)
                },
                onSideDishSelected = { sideDish ->
                    viewModel.setSideDish(sideDish)
                }
            )
        }

        composable(Screens.Accompaniment.name) {
            AccompanimentScreen(
                accompaniments = DataSource.accompaniments,
                onNextButtonClicked = {
                    println("${viewModel.state.value}")
                    viewModel.updateSubtotal()
                    navController.navigate(Screens.Checkout.name)
                },
                onCancelButtonClicked = {
                    resetOrder(navController, viewModel)
                },
                onAccompanimentSelected = { accompaniment ->
                    viewModel.setAccompaniment(accompaniment)
                }
            )
        }

        composable(Screens.Checkout.name) {
            CheckoutScreen(
                state = uiState.value,
                onSubmitButtonClicked = {
//                    navController.navigate(Screens.Start.name)
                    resetOrder(navController, viewModel)
                },
                onCancelButtonClicked = {
                    resetOrder(navController, viewModel)
                }
            )
        }
    }
}

private fun resetOrder(
    navController: NavController,
    viewModel: OrderViewModel
) {
    navController.popBackStack(Screens.Start.name, inclusive = false)
    viewModel.resetOrder()
}

@Preview
@Composable
fun LunchNavHostPreview() {
//    LunchNavHost()
}