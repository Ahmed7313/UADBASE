package com.example.uadadvertisore.navigation

import androidx.compose.runtime.Composable
import androidx.navigation.NavHostController
import androidx.navigation.Navigation
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable

import com.example.uadadvertisore.UIscreens.AddBusinessCategoryScreen
import com.example.uadadvertisore.UIscreens.CompanyProfileScreen
import com.example.uadadvertisore.UIscreens.LogInScreen
import com.example.uadadvertisore.UIscreens.OTBScreen
import com.example.ui_component.ui.theme.ui.IntroScreen

@Composable
fun SetUpNavGraph (navController : NavHostController){

    NavHost(navController  = navController, startDestination = Screen.IntroScreen.route ){

        composable(route = Screen.IntroScreen.route){
            IntroScreen(navController)
        }
        composable(route = Screen.LoginScreen.route){
            LogInScreen(navController)
        }
        composable(route = Screen.OTPScreen.route){
            OTBScreen(navController)
        }
        composable(route = Screen.CompanyProfileScreen.route){
            CompanyProfileScreen(navController)
        }
        composable(Screen.AddBusinessCategoryScreen.route){
            AddBusinessCategoryScreen()
        }
    }
}