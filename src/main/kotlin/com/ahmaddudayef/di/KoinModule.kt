package com.ahmaddudayef.di

import com.ahmaddudayef.repository.HeroRepository
import com.ahmaddudayef.repository.HeroRepositoryImpl
import org.koin.dsl.module

val koinModule = module {
    single<HeroRepository> {
        HeroRepositoryImpl()
    }
}