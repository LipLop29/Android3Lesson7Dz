package com.example.android3lesson7dz.data.remote.apiserveces

import com.example.android3lesson7dz.models.pok.ResponseModel
import com.example.android3lesson7dz.models.pok.ResultsItem
import retrofit2.Call
import retrofit2.http.GET

interface PokemonApiService {

    @GET("/api/v2/pokemon")
    fun fetchPokemon(): Call<ResponseModel<ResultsItem>>
}