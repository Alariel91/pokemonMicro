package com.example.pokemon.repository;

import java.util.List;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import com.example.pokemon.entity.PokemonEntity;

@SpringBootTest
public class PokemonRepositoryTest {
    @Autowired
    private PokemonRepository pokemonRepository;

    @Test
    public void guardarPokemon(){
      
        PokemonEntity pokemon = new PokemonEntity(); 
        pokemon.setNombre("Ivysaur");
        pokemon.setTipo("planta");
        pokemonRepository.save(pokemon);
    }

    @Test
    public void getAllPokemons(){
        List<PokemonEntity> pokemonList = pokemonRepository.getAllPokemons();
        pokemonList.forEach(System.out::println);

    }
}
