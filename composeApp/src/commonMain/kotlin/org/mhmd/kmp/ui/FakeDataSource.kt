package org.mhmd.kmp.ui

import kmp.composeapp.generated.resources.Res
import kmp.composeapp.generated.resources.*

object DataSource {
    private val basilImages = listOf(
        Res.drawable.basil_1,
        Res.drawable.basil_2,
        Res.drawable.basil_3,
        Res.drawable.basil_4,
        Res.drawable.basil_5,
        Res.drawable.basil_6,
        Res.drawable.basil_7,
        Res.drawable.basil_8,
        Res.drawable.basil_9,
        Res.drawable.basil_10,
        Res.drawable.basil_1,
        Res.drawable.basil_2,
        Res.drawable.basil_3,
        Res.drawable.basil_4,
        Res.drawable.basil_5,
        Res.drawable.basil_6,
        Res.drawable.basil_7,
        Res.drawable.basil_8,
        Res.drawable.basil_9,
        Res.drawable.basil_10,
    )

    private val broccoliImages = listOf(
        Res.drawable.broccoli_1,
        Res.drawable.broccoli_2,
        Res.drawable.broccoli_3,
        Res.drawable.broccoli_4,
        Res.drawable.broccoli_5,
        Res.drawable.broccoli_6,
        Res.drawable.broccoli_7,
        Res.drawable.broccoli_8,
        Res.drawable.broccoli_9,
        Res.drawable.broccoli_10,
        Res.drawable.broccoli_1,
        Res.drawable.broccoli_2,
        Res.drawable.broccoli_3,
        Res.drawable.broccoli_4,
        Res.drawable.broccoli_5,
        Res.drawable.broccoli_6,
        Res.drawable.broccoli_7,
        Res.drawable.broccoli_8,
        Res.drawable.broccoli_9,
        Res.drawable.broccoli_10,
    )

    private val mushroomImages = listOf(
        Res.drawable.mushroom_1,
        Res.drawable.mushroom_2,
        Res.drawable.mushroom_3,
        Res.drawable.mushroom_4,
        Res.drawable.mushroom_5,
        Res.drawable.mushroom_6,
        Res.drawable.mushroom_7,
        Res.drawable.mushroom_8,
        Res.drawable.mushroom_9,
        Res.drawable.mushroom_10,
        Res.drawable.mushroom_1,
        Res.drawable.mushroom_2,
        Res.drawable.mushroom_3,
        Res.drawable.mushroom_4,
        Res.drawable.mushroom_5,
        Res.drawable.mushroom_6,
        Res.drawable.mushroom_7,
        Res.drawable.mushroom_8,
        Res.drawable.mushroom_9,
        Res.drawable.mushroom_10,
    )

    private val onionImages = listOf(
        Res.drawable.onion_1,
        Res.drawable.onion_2,
        Res.drawable.onion_3,
        Res.drawable.onion_4,
        Res.drawable.onion_5,
        Res.drawable.onion_6,
        Res.drawable.onion_7,
        Res.drawable.onion_8,
        Res.drawable.onion_9,
        Res.drawable.onion_10,
        Res.drawable.onion_1,
        Res.drawable.onion_2,
        Res.drawable.onion_3,
        Res.drawable.onion_4,
        Res.drawable.onion_5,
        Res.drawable.onion_6,
        Res.drawable.onion_7,
        Res.drawable.onion_8,
        Res.drawable.onion_9,
        Res.drawable.onion_10,
    )

    private val sausageImages = listOf(
        Res.drawable.sausage_1,
        Res.drawable.sausage_2,
        Res.drawable.sausage_3,
        Res.drawable.sausage_4,
        Res.drawable.sausage_5,
        Res.drawable.sausage_6,
        Res.drawable.sausage_7,
        Res.drawable.sausage_8,
        Res.drawable.sausage_9,
        Res.drawable.sausage_10,
        Res.drawable.sausage_1,
        Res.drawable.sausage_2,
        Res.drawable.sausage_3,
        Res.drawable.sausage_4,
        Res.drawable.sausage_5,
        Res.drawable.sausage_6,
        Res.drawable.sausage_7,
        Res.drawable.sausage_8,
        Res.drawable.sausage_9,
        Res.drawable.sausage_10,
    )

     val ingredientsList = listOf(
        OrderScreenUiState.Ingredient(
            1,
            "basil",
            1.0,
            Res.drawable.basil_3,
            basilImages,
        ),
        OrderScreenUiState.Ingredient(
            2,
            "broccoli",
            1.0,
            Res.drawable.broccoli_3,
            broccoliImages,
        ),
        OrderScreenUiState.Ingredient(
            3,
            "mushroom",
            1.0,
            Res.drawable.mushroom_3,
            mushroomImages,
        ),
        OrderScreenUiState.Ingredient(
            4,
            "onion",
            0.5,
            Res.drawable.onion_3,
            onionImages,
        ),
        OrderScreenUiState.Ingredient(
            5,
            "sausage",
            2.0,
            Res.drawable.sausage_3,
            sausageImages,
        ),
    )

    val pizzaList = listOf(
        OrderScreenUiState.Pizza(
            1,
            "Pizza 1",
            10.0,
            Res.drawable.bread_1,
        ),
        OrderScreenUiState.Pizza(
            2,
            "Pizza 2",
            10.0,
            Res.drawable.bread_2,
        ),
        OrderScreenUiState.Pizza(
            3,
            "Pizza 3",
            10.0,
            Res.drawable.bread_3,
        ),
        OrderScreenUiState.Pizza(
            4,
            "Pizza 4",
            10.0,
            Res.drawable.bread_4,
        ),
        OrderScreenUiState.Pizza(
            5,
            "Pizza 5",
            10.0,
            Res.drawable.bread_5,
        ),
    )
}