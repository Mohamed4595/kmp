package org.mhmd.kmp.di

import org.koin.core.module.dsl.singleOf
import org.koin.dsl.module
import org.mhmd.kmp.dependencies.PizzaLocalService

actual val platformModule = module {
    singleOf(::PizzaLocalService)
}