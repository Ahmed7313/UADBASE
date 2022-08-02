package com.example.uadadvertisore.navigation

sealed class Screen (val route : String) {

    object IntroScreen : Screen("intro_screen")
    object LoginScreen : Screen("login_screen")
    object OTPScreen : Screen("otp_screen")
    object CompanyProfileScreen : Screen("company_profile_screen")
    object AddBusinessCategoryScreen : Screen("add_business_category_screen")
}
