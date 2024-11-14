package com.example.il_task_app.presentation

import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.PaddingValues
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.lazy.grid.GridCells
import androidx.compose.foundation.lazy.grid.LazyVerticalGrid
import androidx.compose.foundation.lazy.grid.items
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.navigation.NavController
import androidx.navigation.compose.rememberNavController
import com.example.il_task_app.data.DummyData
import com.example.il_task_app.navigation.NavigationRoutes
import com.example.il_task_app.navigation.Screen
import com.example.il_task_app.presentation.component.ProductCardDdesign2
import com.example.il_task_app.ui.theme.ILtaskappTheme
import model.Product

@Composable
fun AllProduct(
    navController: NavController,
    products: List<Product> = DummyData.productcard
) {
    LazyVerticalGrid(
        //contentPadding = PaddingValues(16.dp),
        verticalArrangement = Arrangement.spacedBy(16.dp),
        horizontalArrangement = Arrangement.spacedBy(10.dp),
        columns = GridCells.Adaptive(180.dp),
        modifier = Modifier
            .padding(horizontal = 10.dp, vertical = 5.dp)
    ) {
        items(products, key = { it.id }) {
            ProductCardDdesign2(product = it) { productId ->
                navController.navigate(
                    Screen.detailProduct.route + "/$productId")
            }
        }
    }
}

@Preview(showBackground = true)
@Composable
private fun AllProductView() {
    ILtaskappTheme {
        AllProduct(products = DummyData.productcard,
            navController = rememberNavController())
    }

}