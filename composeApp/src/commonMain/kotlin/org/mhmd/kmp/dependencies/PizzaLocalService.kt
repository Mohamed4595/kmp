package org.mhmd.kmp.dependencies

import org.mhmd.kmp.dependencies.entity.PizzaSize

expect class PizzaLocalService {
     fun getPizzaSizes(): List<PizzaSize>
}