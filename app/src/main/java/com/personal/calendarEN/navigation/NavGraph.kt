package com.personal.calendarEN.navigation

import androidx.compose.runtime.Composable
import androidx.navigation.NavHostController
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import com.personal.calendarEN.ui.screens.calendar.CalendarSection


@Composable
fun SetupNavGraph(
    navController: NavHostController,
) {
    NavHost(
        navController = navController,
        startDestination = Screen.Calendar.route
    ) {

        composable(route = Screen.Calendar.route) {
            CalendarSection(navController = navController)
        }


    }
}