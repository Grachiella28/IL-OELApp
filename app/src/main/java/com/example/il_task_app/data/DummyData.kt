package com.example.il_task_app.data

import com.example.il_task_app.R
import model.Discount
import model.Product

object DummyData {
    val discountcard = listOf(
        Discount(
            id = 1,
            judul = "Gratis ongkir",
            detail = "min. belanja 30rb",
            exp = "berlaku hingga 10 sept"
        ),
        Discount(
            id = 2,
            judul = "Diskon 10%",
            detail = "min. belanja 10rb",
            exp = "berlaku hingga 10 sept"
        ),
        Discount(
            id = 3,
            judul = "Cashback 100rb",
            detail = "Elektronik",
            exp = "berlaku hingga 12 sept"
        ),
        Discount(
            id = 4,
            judul = "Diskon 99%",
            detail = "min. belanja 30rb",
            exp = "berlaku hingga 20 Okt"
        ),
        Discount(
            id = 5,
            judul = "Gratis ongkir",
            detail = "min. belanja 30rb",
            exp = "berlaku hingga 11 sept"
        ),
        Discount(
            id = 6,
            judul = "Cashback 200rb",
            detail = "Pulsa dan Listrik",
            exp = "berlaku hingga 21 sept"
        ),
        Discount(
            id = 7,
            judul = "Diskon 11.11",
            detail = "min. belanja 110rb",
            exp = "berlaku hingga 22 sept"
        ),
        Discount(
            id = 8,
            judul = "Gratis ongkir",
            detail = "min. belanja 30rb",
            exp = "berlaku hingga 18 sept"
        ),
        Discount(
            id = 9,
            judul = "Cashback 50.000",
            detail = "Internet",
            exp = "berlaku hingga 11 sept"
        ),
        Discount(
            id = 10,
            judul = "Gratis ongkir",
            detail = "min. belanja 30rb",
            exp = "berlaku hingga 19 sept"
        )

    )

    val productcard = listOf(
        Product(
            id = 1,
            img = R.drawable.product_baccaros,
            judul = "Baccaros",
            detail = "Eau De Parfume",
            harga = 88000
        ),
        Product(
            id = 2,
            img = R.drawable.product_fortune,
            judul = "Fortune",
            detail = "Eau De Parfume",
            harga = 65000
        ),
        Product(
            id = 3,
            img = R.drawable.product_armor,
            judul = "Armor",
            detail = "Eau De Parfume",
            harga = 65000
        ),
        Product(
            id = 4,
            img = R.drawable.product_bossar,
            judul = "Boss Ar",
            detail = "Eau De Parfume",
            harga = 65000
        ),
        Product(
            id = 5,
            img = R.drawable.product_haizelia,
            judul = "Haizelia",
            detail = "Eau De Parfume",
            harga = 65000
        ),
        Product(
            id = 6,
            img = R.drawable.product_jepremium,
            judul = "Je Premium",
            detail = "Eau De Parfume",
            harga = 88000
        ),
        Product(
            id = 7,
            img = R.drawable.product_oelsteel,
            judul = "Oel Steel",
            detail = "Eau De Parfume",
            harga = 65000
        ),
        Product(
            id = 8,
            img = R.drawable.product_varians,
            judul = "Bundling 4 varian",
            detail = "Eau De Parfume",
            harga = 228000
        ),
        Product(
            id = 9,
            img = R.drawable.product_baccaross2,
            judul = "Baccaros2",
            detail = "Eau De Parfume",
            harga = 88000
        ),
        Product(
            id = 10,
            img = R.drawable.product_oelsteel2,
            judul = "Oel Steel",
            detail = "Eau De Parfume",
            harga = 65000
        ),
    )


}