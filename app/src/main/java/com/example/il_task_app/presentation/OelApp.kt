package com.example.il_task_app.presentation

import androidx.compose.foundation.layout.padding
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.ArrowBack
import androidx.compose.material.icons.filled.Home
import androidx.compose.material.icons.filled.Person
import androidx.compose.material.icons.filled.ShoppingCart
import androidx.compose.material3.BottomAppBarState
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.Icon
import androidx.compose.material3.IconButton
import androidx.compose.material3.NavigationBar
import androidx.compose.material3.NavigationBarItem
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Text
import androidx.compose.material3.TopAppBar
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.ui.Modifier
import androidx.compose.ui.platform.LocalContext
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.tooling.preview.Preview
import androidx.navigation.NavController
import androidx.navigation.NavGraph.Companion.findStartDestination
import androidx.navigation.NavHostController
import androidx.navigation.NavType
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import androidx.navigation.compose.currentBackStackEntryAsState
import androidx.navigation.compose.rememberNavController
import androidx.navigation.navArgument
import com.example.il_task_app.R
import com.example.il_task_app.navigation.NavigationItem
import com.example.il_task_app.navigation.NavigationRoutes
import com.example.il_task_app.navigation.Screen

@OptIn(ExperimentalMaterial3Api::class)
@Composable
fun OelScreen(
    navController: NavHostController = rememberNavController()
) {
    val context = LocalContext.current
    val navBackStackEntry by navController.currentBackStackEntryAsState()
    val currentRoute = navBackStackEntry?.destination?.route

    Scaffold (
        topBar = {
            TopAppBar(
                title = {
                   Text(
                       text = when (currentRoute) {
                           Screen.beranda.route -> stringResource(id = R.string.menu_home)
                           Screen.allProduct.route -> stringResource(id = R.string.menu_allproduct)
                           //currentRoute?.startsWith(Screen.detailProduct.route) == true -> "Detail Product"
                           Screen.profile.route -> stringResource(id = R.string.menu_profil)
                           else -> "Detail Product"

                       }
                   )
                },
                actions = {
                    if (navController.previousBackStackEntry != null) {
                        // Show back button if there's a previous entry
                        IconButton(
                            onClick = { navController.navigateUp() }) {
                            Icon(
                                imageVector = Icons.Default.ArrowBack,
                                contentDescription = stringResource(id = R.string.menu_back),
                            )
                        }
                    }
                }
            )
        },
        bottomBar = {
            BottomBar(navController)
        }
    ){  contentPadding ->
        NavHost(
            navController = navController,
            startDestination = Screen.beranda.route,
            modifier = Modifier.padding(contentPadding),
            builder = {
                composable(Screen.beranda.route) {
                    Homepage(navController)
                }
                composable(Screen.allProduct.route) {
                    AllProduct(navController)
                }
                composable(
                    Screen.detailProduct.route + "/{productId}",
                    arguments = listOf(navArgument("productId")
                    { type = NavType.IntType})
                ){
                    navBackStackEntry ->
                    DetailProduct(
                        navController = navController,
                        productsId = navBackStackEntry.arguments?.
                        getInt("productId")
                    )
                }
                composable(Screen.profile.route) {
                    Profile(navController)
                }
            }
        )

    }
}

@Composable
fun BottomBar(
    navController: NavHostController
) {
    NavigationBar {
        val navBackStackEntry by navController.currentBackStackEntryAsState()
        val currentRoute = navBackStackEntry?.destination?.route

        val navigationItems = listOf(
            NavigationItem(
                title = stringResource(id = R.string.menu_home),
                icon = Icons.Default.Home,
                screen = Screen.beranda
            ),
            NavigationItem(
                title = stringResource(id = R.string.menu_allproduct),
                icon = Icons.Default.ShoppingCart,
                screen = Screen.allProduct
            ),
            NavigationItem(
                title = stringResource(id = R.string.menu_profil),
                icon = Icons.Default.Person,
                screen = Screen.profile
            ),

        )
        navigationItems.map { item ->
            NavigationBarItem(
                selected = currentRoute == item.screen.route,
                onClick = {
                    navController.navigate(item.screen.route) {
                        popUpTo(navController.graph.findStartDestination().id) {
                            saveState = true
                        }
                        restoreState = true
                        launchSingleTop = true
                    }
                },
                icon = { Icon(imageVector = item.icon, contentDescription = item.title) },
                label = { Text(text = item.title) }

            )
        }
    }

}

@Preview
@Composable
private fun OelAppView() {
    OelScreen()
}




