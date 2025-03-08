package com.personal.calendarEN.navigation

sealed class Screen(val route: String) {

    data object Splash : Screen("splash_screen")
    data object SignIn : Screen("sing_in_screen")
    //Bottom Navigation
    data object Reports : Screen("reports_screen")
    data object Calendar : Screen("calendar_screen")
    data object Setting : Screen("setting_screen")
    data object Utils : Screen("utils_screen")




}