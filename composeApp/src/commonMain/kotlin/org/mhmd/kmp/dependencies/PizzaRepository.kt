package org.mhmd.kmp.dependencies

import org.mhmd.kmp.dependencies.entity.PizzaSize

interface PizzaRepository {
    fun getPizzaSizes(): List<PizzaSize>
}


class PizzaRepositoryImpl(
    private val service: PizzaLocalService
) : PizzaRepository {
    override fun getPizzaSizes(): List<PizzaSize> {
        return service.getPizzaSizes()
    }
}