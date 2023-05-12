package com.example.android3lesson7dz.ui.adapters

import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.DiffUtil
import androidx.recyclerview.widget.ListAdapter
import androidx.recyclerview.widget.RecyclerView
import com.bumptech.glide.Glide
import com.example.android3lesson7dz.databinding.PokemonItemBinding
import com.example.android3lesson7dz.models.pok.ResultsItem

class PokemonAdapter :
    ListAdapter<ResultsItem, PokemonAdapter.ViewHolder>(diffUtil) {

    class ViewHolder(private val binding: PokemonItemBinding) :
        RecyclerView.ViewHolder(binding.root) {
        fun onBind(item: ResultsItem?) {
            binding.itemPokemonNameTv.text = item?.name
            Glide.with(binding.itemPokemonPokemonImg.context)
                .load(
                    "https://raw.githubusercontent.com/PokeAPI" +
                            "/sprites/master/sprites/pokemon/other/official-artwork/.png"
                )
                .into(binding.itemPokemonPokemonImg)
        }
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ViewHolder {
        return ViewHolder(
            PokemonItemBinding.inflate(
                LayoutInflater.from(
                    parent.context
                ), parent, false
            )
        )
    }

    override fun onBindViewHolder(holder: ViewHolder, position: Int) {
        holder.onBind(getItem(position))
    }

    companion object {
        private val diffUtil = object : DiffUtil.ItemCallback<ResultsItem>() {
            override fun areItemsTheSame(
                oldItem: ResultsItem,
                newItem: ResultsItem
            ): Boolean {
                return oldItem == newItem
            }

            override fun areContentsTheSame(
                oldItem: ResultsItem,
                newItem: ResultsItem
            ): Boolean {
                return oldItem.name == newItem.name
            }
        }
    }
}