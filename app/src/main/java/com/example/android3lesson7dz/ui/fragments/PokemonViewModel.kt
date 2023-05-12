package com.example.android3lesson7dz.ui.fragments

import androidx.lifecycle.ViewModel
import com.example.android3lesson7dz.App
import com.example.android3lesson7dz.data.repositories.PokemonRepository
import dagger.hilt.android.lifecycle.HiltViewModel
import javax.inject.Inject

@HiltViewModel
class PokemonViewModel @Inject constructor(
) : ViewModel() {

    private var pokemonRepository = PokemonRepository(App.retrofitClient)

    fun fetchPokemon() = pokemonRepository.fetchPokemon()
}