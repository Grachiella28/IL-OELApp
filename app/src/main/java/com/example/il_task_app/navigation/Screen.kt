package com.example.il_task_app.navigation

sealed class Screen (val route: String){
    data object beranda : Screen("HomePage")
    data object allProduct: Screen("AllProduct")
    data object detailProduct: Screen("DetailProduct")
    data object profile: Screen("Profile")
}