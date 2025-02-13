package com.example.pokemon.service;

import java.util.List;

import com.example.pokemon.entity.PokemonEntity;

public interface PokemonService {

    List<PokemonEntity> findAllPokemons();
    PokemonEntity findPokemonById(Long id);
    PokemonEntity savePokemon(PokemonEntity pokemon);
    PokemonEntity updatePokemon(Long id, PokemonEntity pokemon);
    void deletePokemon(Long id);
}
