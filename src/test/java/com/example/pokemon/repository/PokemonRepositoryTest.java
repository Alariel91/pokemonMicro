package com.example.pokemon.repository;


import java.util.List;

import static org.assertj.core.api.Assertions.assertThat;

import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.orm.jpa.DataJpaTest;
import org.springframework.boot.test.autoconfigure.orm.jpa.TestEntityManager;

import com.example.pokemon.entity.PokemonEntity;

@DataJpaTest
public class PokemonRepositoryTest {
    @Autowired
    private PokemonRepository pokemonRepository;
    
    @Autowired
    TestEntityManager  entityManager;

    @Test
    public void guardarPokemon() {
        // Crear el Pokémon que vamos a guardar
        PokemonEntity pokemon = new PokemonEntity();
        pokemon.setNombre("Ivysaur");
        pokemon.setTipo("planta");
        pokemon.setIndevolucion(true);
        pokemon.setNvlevolucion(40);

        // Guardar el Pokémon
        PokemonEntity newPokemon = pokemonRepository.save(pokemon);

        // Verificar que el Pokémon se ha guardado correctamente
        // Comprobamos que el ID no es null (la base de datos asigna el ID automáticamente)
        assertThat(newPokemon.getId()).isNotNull();

        // Verificar que el Pokémon guardado es el mismo que se ha recuperado
        PokemonEntity foundPokemon = pokemonRepository.findById(newPokemon.getId()).orElse(null);
        assertThat(foundPokemon).isNotNull();
        assertThat(foundPokemon.getNombre()).isEqualTo("Ivysaur");
        assertThat(foundPokemon.getTipo()).isEqualTo("planta");
        assertThat(foundPokemon.getIndevolucion()).isTrue();
        assertThat(foundPokemon.getNvlevolucion()).isEqualTo(40);
    }

    @Test
    public void getAllPokemons(){
        List<PokemonEntity> pokemonList = pokemonRepository.getAllPokemons();
        pokemonList.forEach(System.out::println);

    }
}
