package com.example.android3lesson7dz.ui.fragments

import androidx.fragment.app.viewModels
import androidx.lifecycle.lifecycleScope
import androidx.recyclerview.widget.LinearLayoutManager
import by.kirich1409.viewbindingdelegate.viewBinding
import com.example.android3lesson7dz.R
import com.example.android3lesson7dz.base.BaseFragment
import com.example.android3lesson7dz.databinding.FragmentPokemonBinding
import com.example.android3lesson7dz.ui.adapters.PokemonAdapter
import dagger.hilt.android.AndroidEntryPoint
import kotlinx.coroutines.launch

@AndroidEntryPoint
class PokemonFragment :
    BaseFragment<FragmentPokemonBinding, PokemonViewModel>(R.layout.fragment_pokemon) {

    override val binding by viewBinding(FragmentPokemonBinding::bind)
    override val viewModel: PokemonViewModel by viewModels()
    private var pokemonAdapter = PokemonAdapter()

    override fun initialize() {
        binding.recyclerCharacter.apply {
            layoutManager = LinearLayoutManager(requireContext())
            adapter = pokemonAdapter
        }
    }

    override fun setupObserve() {
        lifecycleScope.launch {
            viewModel.fetchPokemon().observe(viewLifecycleOwner) {
                pokemonAdapter.submitList(it.results)
            }
        }
    }
}