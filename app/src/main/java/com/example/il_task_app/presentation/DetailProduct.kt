package com.example.il_task_app.presentation

import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.platform.LocalContext
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.navigation.NavController
import coil.compose.AsyncImage
import coil.request.ImageRequest
import com.example.il_task_app.data.DummyData
import com.example.il_task_app.presentation.component.formatHarga
import model.Product

@Composable
fun DetailProduct(
  navController: NavController,
  productsId: Int?
) {
  val newProductList = DummyData.productcard.filter {
    product -> product.id == productsId
  }
  Column {
    DetailProductContent(newProductList = newProductList)
  }
}

@Composable
fun DetailProductContent(
  newProductList: List<Product>,
) {
  Row(
    verticalAlignment = Alignment.CenterVertically,
    horizontalArrangement = Arrangement.Start,
    modifier = Modifier.padding(16.dp)
  ){
    AsyncImage(
      model = ImageRequest.Builder(LocalContext.current)
        .data(data = newProductList[0].img)
        .build(),
      contentScale = ContentScale.Crop,
      modifier = Modifier
        .size(height = 250.dp, width = 170.dp)
        .clip(RoundedCornerShape(16.dp)),
      contentDescription = "Product"
    )
    Spacer(modifier = Modifier.width(16.dp))
    Column(modifier = Modifier.padding(4.dp)) {
      Text(
        text = newProductList[0].judul,
        fontSize = 25.sp,
        fontWeight = FontWeight.Bold
      )
      Text(
        text = newProductList[0].detail,
        style = MaterialTheme.typography.titleSmall,
      )
      Text(
        text = formatHarga(newProductList[0].harga),
        style = MaterialTheme.typography.titleSmall,
      )
    }
  }
}

@Preview(showBackground = true)
@Composable
private fun DetailProductContentPreview() {
  DetailProductContent(newProductList = DummyData.productcard)

}