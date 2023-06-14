package com.example.to_docompose.navigation.destinations

import androidx.compose.material.ExperimentalMaterialApi
import androidx.navigation.NavGraphBuilder
import androidx.navigation.NavType
import androidx.navigation.compose.composable
import androidx.navigation.navArgument
import com.example.to_docompose.ui.screens.list.ListScreen
import com.example.to_docompose.ui.viewmodels.SharedViewModel
import com.example.to_docompose.util.Constants.LIST_ARGUMENT_KEY
import com.example.to_docompose.util.Constants.LIST_SCREEN

@ExperimentalMaterialApi
fun NavGraphBuilder.listComposable(
    navigateToTaskScreen: (Int) -> Unit,
    sharedViewModel: SharedViewModel
){
    composable(
        route = LIST_SCREEN,
        arguments = listOf(navArgument(LIST_ARGUMENT_KEY){
            type = NavType.StringType
        })
    ){
        val action = it.arguments?.getString(LIST_ARGUMENT_KEY)

        ListScreen(navigateToTaskScreen = navigateToTaskScreen, sharedViewModel)
    }
}