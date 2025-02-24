package com.example.pokemon.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.pokemon.entity.PokemonEntity;
import com.example.pokemon.repository.PokemonRepository;
@Service
public class PokemonServiceImpl implements PokemonService {

    @Autowired
    private PokemonRepository pokemonRepository;

    @Override
    public List<PokemonEntity> findAllPokemons() {
        
       return pokemonRepository.findAll();
    }

    @Override
    public PokemonEntity findPokemonById(Integer id) {
        Optional<PokemonEntity> pokemonOptional = pokemonRepository.findById(id);
        return pokemonOptional.orElseThrow();
    }

    @Override
    public PokemonEntity savePokemon(PokemonEntity pokemon) {
        return pokemonRepository.save(pokemon);
    }

    @Override
    public PokemonEntity updatePokemon(Integer id, PokemonEntity pokemon) {
        Optional<PokemonEntity> pokemonOptional = pokemonRepository.findById(id);
        PokemonEntity pokemonDB = pokemonOptional.orElseThrow();
        pokemonDB.setName(pokemon.getName());
        pokemonDB.setType(pokemon.getType());
        return pokemonRepository.save(pokemonDB);
    }

    @Override
    public void deletePokemon(Integer id) {
         pokemonRepository.deleteById(id);
    }

}
