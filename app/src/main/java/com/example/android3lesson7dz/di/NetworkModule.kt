package com.example.android3lesson7dz.di

import com.example.android3lesson7dz.data.remote.RetrofitClient
import com.example.android3lesson7dz.data.remote.apiserveces.PokemonApiService
import dagger.Module
import dagger.Provides
import dagger.hilt.InstallIn
import dagger.hilt.components.SingletonComponent
import javax.inject.Singleton

@Module
@InstallIn(SingletonComponent::class)
object NetworkModule {

    @Singleton
    val retrofitClient = RetrofitClient()

    @Singleton
    @Provides
    fun providerPokemonApiServices(): PokemonApiService{
        return retrofitClient.providePokemonApiServices()
    }
}