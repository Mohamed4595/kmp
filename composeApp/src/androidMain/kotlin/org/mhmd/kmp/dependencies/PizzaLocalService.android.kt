package org.mhmd.kmp.dependencies

import org.mhmd.kmp.dependencies.entity.PizzaSize

actual class PizzaLocalService {
    actual fun getPizzaSizes(): List<PizzaSize> {
        return listOf(PizzaSize.SMALL,PizzaSize.MEDIUM,PizzaSize.LARGE)
    }
}