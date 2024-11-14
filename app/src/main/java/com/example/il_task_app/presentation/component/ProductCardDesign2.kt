package com.example.il_task_app.presentation.component

import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.offset
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.example.il_task_app.R
import model.Product

@Composable
fun ProductCardDdesign2(
       product: Product,
       onItemClicked: (Int) -> Unit
) {
    Box(
        modifier = Modifier
            .background(
                color = Color.LightGray,
                shape = RoundedCornerShape(16.dp)
            )
            .size(width = 182.dp, height = 252.dp)
            .clickable {
                onItemClicked(product.id)},
        contentAlignment = Alignment.Center
    ){
        Box(
            modifier = Modifier
                .background(
                    color = Color(color = 0xFFF8EDDA),
                    shape = RoundedCornerShape(16.dp)
                )
                .size(width = 180.dp, height = 250.dp)
        ){
            Column(
                modifier = Modifier
                    .fillMaxWidth(),
                verticalArrangement = Arrangement.Center,
                horizontalAlignment = Alignment.CenterHorizontally
            ) {
                Spacer(modifier = Modifier.height(4.dp))
                Image(
                    painter = painterResource(id = product.img),
                    contentDescription = "product",
                    contentScale = ContentScale.Crop,
                    modifier = Modifier
                        .clip(RoundedCornerShape(16.dp))
                        .size(170.dp)
                )
                Text(
                    text = product.judul,
                    style = MaterialTheme.typography.titleMedium
                )
                Text(
                    text = product.detail,
                    style = MaterialTheme.typography.bodySmall
                )
                Text(
                    text = formatHarga(product.harga),
                    style = MaterialTheme.typography.bodyMedium
                )
            }
        }
    }
}

@Preview
@Composable
private fun ProdcutCardDesign2view() {
    ProductCardDdesign2(
        Product(
            id = 1,
            img = R.drawable.product_baccaros,
            judul = "Baccaros",
            detail = "Eau De Parfume",
            harga = 88000
        ),
        onItemClicked = { productId ->
            println("Product Id : $productId")
        }
    )
}