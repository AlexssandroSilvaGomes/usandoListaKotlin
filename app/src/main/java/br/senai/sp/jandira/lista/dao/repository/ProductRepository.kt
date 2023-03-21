package br.senai.sp.jandira.lista.dao.repository

import androidx.compose.runtime.Composable
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.tooling.preview.datasource.LoremIpsum
import br.senai.sp.jandira.lista.R
import br.senai.sp.jandira.lista.model.Product

class ProductRepository {

    companion object {
        @Composable
        fun getProductList(): List<Product> {

            return listOf<Product>(
                Product(
                    id = 1,
                    name = "Mouse",
                    description = "is simply dummy text of the printing and typesetting industry.",
                    price = 128.66,
                ),
                Product(
                    id = 2,
                    name = "Teclado",
                    description = "is simply dummy text of the printing and typesetting industry.",
                    price = 89.67,
                ),
                Product(
                    id = 3,
                    name = "Mickey Mouse",
                    description = "is simply dummy text of the printing and typesetting industry.",
                    price = 12.34,
                ),
                Product(
                    id = 4,
                    name = "Caneca Java",
                    description = "is simply dummy text of the printing and typesetting industry.",
                    image = painterResource(id = R.drawable.caneca_java),
                    price = 121.12,
                ),
                Product(
                    id = 5,
                    name = "Camiseta JavaScript",
                    description = "is simply dummy text of the printing and typesetting industry.",
                    image = painterResource(id = R.drawable.camiseta_js),
                    price = 12.12
                ),
                Product(
                    id = 6,
                    name = "Camiseta JavaScript",
                    description = "is simply dummy text of the printing and typesetting industry.",
                    price = 12.12
                ),
                Product(
                    id = 7,
                    name = "Camiseta JavaScript",
                    description = "is simply dummy text of the printing and typesetting industry.",
                    price = 12.12
                ),
                Product(
                    id = 8,
                    name = "Camiseta JavaScript",
                    description = "is simply dummy text of the printing and typesetting industry.",
                    price = 12.12
                ),
            )
        }
    }

}