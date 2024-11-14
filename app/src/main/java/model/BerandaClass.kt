package model

data class Discount(
    val id: Int,
    val judul: String,
    val detail: String,
    val exp: String,
)

data class Product(
    val id: Int,
    val img: Int,
    val judul: String,
    val detail: String,
    val harga: Int
)
