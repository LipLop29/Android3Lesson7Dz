package com.example.android3lesson7dz.data.repositories

import androidx.lifecycle.MutableLiveData
import com.example.android3lesson7dz.data.remote.apiserveces.PokemonApiService
import com.example.android3lesson7dz.models.pok.ResponseModel
import com.example.android3lesson7dz.models.pok.ResultsItem
import retrofit2.Call
import retrofit2.Callback
import retrofit2.Response
import javax.inject.Inject

class PokemonRepository @Inject constructor(
    private val pokemonApiService: PokemonApiService
){

     fun fetchPokemon(): MutableLiveData<ResponseModel<ResultsItem>> {
        val data: MutableLiveData<ResponseModel<ResultsItem>> = MutableLiveData()
        pokemonApiService.fetchPokemon()
            .enqueue(object : Callback<ResponseModel<ResultsItem>> {
                override fun onResponse(
                    call: Call<ResponseModel<ResultsItem>>,
                    response: Response<ResponseModel<ResultsItem>>
                ) {
                    data.value = response.body()
                }

                override fun onFailure(
                    call: Call<ResponseModel<ResultsItem>>,
                    t: Throwable
                ) {
                    data.value = null
                }
            })
        return data
    }
}