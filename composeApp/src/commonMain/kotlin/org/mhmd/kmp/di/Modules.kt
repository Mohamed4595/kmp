package org.mhmd.kmp.di


import org.koin.compose.viewmodel.dsl.viewModelOf
import org.koin.core.module.Module
import org.koin.core.module.dsl.singleOf
import org.koin.dsl.bind
import org.koin.dsl.module
import org.mhmd.kmp.dependencies.PizzaRepository
import org.mhmd.kmp.dependencies.PizzaRepositoryImpl
import org.mhmd.kmp.ui.PizzaViewModel

expect val platformModule: Module

val sharedModule = module {
    singleOf(::PizzaRepositoryImpl).bind<PizzaRepository>()
    viewModelOf(::PizzaViewModel)
}