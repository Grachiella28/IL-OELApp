package com.example.il_task_app.presentation.component

import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.KeyboardArrowRight
import androidx.compose.material3.IconButton
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.example.il_task_app.R
import model.Product
import java.text.NumberFormat
import java.util.Locale


fun formatHarga(harga: Int): String{
    val formatter = NumberFormat.getNumberInstance(Locale("in", "ID"))
    val newHarga = formatter.format(harga)
    return "Rp.$newHarga"
}

@Composable
fun ProductCardDesign(
    product: Product,
    onItemClicked: (Int) -> Unit
) {
    Box(
        modifier = Modifier
            .background(
                color = Color.LightGray,
                shape = RoundedCornerShape(16.dp)
            )
            .size(width = 382.dp, height = 122.dp),
        contentAlignment = Alignment.Center
    ){
        Box(
            modifier = Modifier
                .background(
                    color = Color(color = 0xFFF8EDDA),
                    shape = RoundedCornerShape(16.dp)
                )
                .size(width = 380.dp, height = 120.dp)
        ){
            Row (
                verticalAlignment = Alignment.CenterVertically
            ){
                Image(
                    painter = painterResource(id = product.img),
                    contentDescription = "product",
                    contentScale = ContentScale.Crop,
                    modifier = Modifier
                        .clip(shape = RoundedCornerShape(16.dp))
                        .size(120.dp)
                )
                Column(
                    modifier = Modifier
                        .padding(start = 16.dp)
                        .width(160.dp)
                ) {
                    Text(
                        text = product.judul,
                        style = MaterialTheme.typography.titleLarge,
                        fontWeight = FontWeight.Bold
                    )
                    Text(
                        text = product.detail,
                        style = MaterialTheme.typography.bodyLarge
                    )
                    Text(
                        text = formatHarga(product.harga),
                        style = MaterialTheme.typography.bodySmall
                    )
                }
                IconButton(onClick = {onItemClicked(product.id)},
                    modifier = Modifier
                        .fillMaxSize()
                ) {
                    Image(
                        imageVector = Icons.Default.KeyboardArrowRight,
                        contentDescription = "arrow",
                        modifier = Modifier
                            .size(40.dp)
                    )
                }


            }

        }
    }
}

@Preview
@Composable
private fun ProductCardDesignView() {
    ProductCardDesign(
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