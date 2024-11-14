package com.example.il_task_app.presentation

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.lazy.LazyRow
import androidx.compose.foundation.lazy.items
import androidx.compose.runtime.Composable
import androidx.compose.runtime.key
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.navigation.NavController
import androidx.navigation.compose.rememberNavController
import com.example.il_task_app.data.DummyData
import com.example.il_task_app.navigation.NavigationRoutes
import com.example.il_task_app.navigation.Screen
import com.example.il_task_app.presentation.component.DiscountCardDesign
import com.example.il_task_app.presentation.component.ProductCardDesign
import model.Discount
import model.Product

@Composable
fun Homepage(
    navController: NavController,
    discounts: List<Discount> = DummyData.discountcard,
    products: List<Product> = DummyData.productcard
) {
    Box(
        modifier = Modifier
            .background(color = Color.White)
            .fillMaxSize()
    )
    {
        LazyColumn(
            verticalArrangement = Arrangement.spacedBy(8.dp),
            horizontalAlignment = Alignment.CenterHorizontally,
            modifier = Modifier
                .fillMaxSize()
        ) {
            item {
                LazyRow(
                    //modifier = Modifier.padding(top = 80.dp),
                    horizontalArrangement = Arrangement.spacedBy(5.dp)
                ) {
                    items(discounts, key = { it.id }) {
                        DiscountCardDesign(
                            discount = it, modifier = Modifier
                                .padding(5.dp)
                        )
                    }
                }
            }
            items(products, key = { it.id }) {
                ProductCardDesign(product = it) { productId ->
                    navController.navigate(
                        Screen.detailProduct.route + "/$productId")
                }
            }

        }
    }


}

@Preview
@Composable
private fun test() {
    Homepage(navController = rememberNavController())

}