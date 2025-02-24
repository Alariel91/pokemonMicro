package com.example.pokemon.service;

import java.util.List;

import com.example.pokemon.entity.PokemonEntity;

public interface PokemonService {

    List<PokemonEntity> findAllPokemons();
    PokemonEntity findPokemonById(Integer id);
    PokemonEntity savePokemon(PokemonEntity pokemon);
    PokemonEntity updatePokemon(Integer id, PokemonEntity pokemon);
    void deletePokemon(Integer id);
}
