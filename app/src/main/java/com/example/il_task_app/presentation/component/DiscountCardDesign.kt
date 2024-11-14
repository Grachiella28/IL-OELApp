package com.example.il_task_app.presentation.component

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Favorite
import androidx.compose.material3.Icon
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import model.Discount


@Composable
fun DiscountCardDesign(
    discount: Discount,
    modifier: Modifier = Modifier
    //discounts: List<Discount> = DummyData.discountcard
) {
    Box(
        modifier = Modifier
            .background(
                color = Color.LightGray,
                shape = RoundedCornerShape(16.dp)
            )
            .size(width = 212.dp, height = 82.dp),
        contentAlignment = Alignment.Center

    ){
        Box(
            modifier = Modifier
                .background(
                    color = Color.White,
                    shape = RoundedCornerShape(16.dp)
                )
                .size(width = 210.dp, height = 80.dp)
                //.padding(all = 2.dp),
        ){
            Row {
                Box(
                    modifier = Modifier
                        .background(
                            color = Color.LightGray,
                            shape = RoundedCornerShape(topStart = 16.dp, bottomStart = 16.dp)
                        )
                        .size(width = 50.dp, height = 120.dp),
                    contentAlignment = Alignment.Center
                ){
                    Icon(
                        imageVector = Icons.Default.Favorite,
                        contentDescription = "star"
                    )
                }
                Column (
                    modifier = Modifier
                        .padding(top = 2.dp, start = 5.dp)
                ){
                    Text(
                        text = discount.judul,
                        style = MaterialTheme.typography.titleMedium
                    )
                    Text(
                        text = discount.detail,
                        style = MaterialTheme.typography.bodyLarge
                    )
                    Text(
                        text = discount.exp,
                        style = MaterialTheme.typography.bodySmall
                    )
                }

            }
        }
    }
    
}

//@Composable
//fun DiscountCard(modifier: Modifier = Modifier) {
//
//}

@Preview
@Composable
private fun DiscountCardView() {
    DiscountCardDesign(
        discount = Discount(
            id = 1,
            judul = "Gratis ongkir",
            detail = "min. belanja 30rb",
            exp = "berlaku hingga 10 sept"
        )
    )
}