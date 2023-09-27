package com.jetpack.compose.lunchtray

import androidx.compose.foundation.layout.padding
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.ArrowBack
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.Icon
import androidx.compose.material3.IconButton
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Text
import androidx.compose.material3.TopAppBar
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import androidx.lifecycle.viewmodel.compose.viewModel
import androidx.navigation.NavController
import androidx.navigation.NavHostController
import androidx.navigation.compose.currentBackStackEntryAsState
import androidx.navigation.compose.rememberNavController
import com.jetpack.compose.lunchtray.ui.screens.Screens

@OptIn(ExperimentalMaterial3Api::class)
@Composable
fun LunchApp(
    navController: NavController = rememberNavController(),
    viewModel: OrderViewModel = viewModel()
) {
    val backStackEntry by navController.currentBackStackEntryAsState()
    val currentScreen = Screens.valueOf(
        backStackEntry?.destination?.route ?: Screens.Start.name
    )
    Scaffold(
        topBar = {
            LunchTopAppBar(
                currentScreen = currentScreen,
                canNavigateBack = navController.previousBackStackEntry != null,
                onClickNavigateBackIcon = {
                    navController.navigateUp()
                }
            )
        }
    ) {
        LunchNavHost(
            navController = navController as NavHostController, viewModel = viewModel,
            modifier = Modifier.padding(it)
        )
    }
}

@OptIn(ExperimentalMaterial3Api::class)
@Composable
private fun LunchTopAppBar(
    currentScreen: Screens,
    canNavigateBack: Boolean,
    onClickNavigateBackIcon: () -> Unit = {},
    modifier: Modifier = Modifier
) {
    TopAppBar(
        title = {
            Text(text = currentScreen.title)
        },
        navigationIcon = {
            if (canNavigateBack) {
                IconButton(onClick = onClickNavigateBackIcon) {
                    Icon(imageVector = Icons.Default.ArrowBack, contentDescription = null)
                }
            }
        },
        modifier = modifier

    )


}


@Preview
@Composable
fun LunchAppPreview() {
    LunchApp()
}