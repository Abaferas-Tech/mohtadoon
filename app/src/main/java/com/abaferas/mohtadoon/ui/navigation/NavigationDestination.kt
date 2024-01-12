package com.abaferas.mohtadoon.ui.navigation

sealed class NavigationDestination(
    val route: String,
) {
    data object HOME: NavigationDestination("screen_home")
}

