package com.example.pokemon.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.pokemon.entity.PokemonEntity;
import com.example.pokemon.service.PokemonService;

@RestController
@RequestMapping("/api/pokemon")
public class PokemonController {
    @Autowired
    private PokemonService pokemonService;

    @GetMapping("/getAllPokemons")
    public List<PokemonEntity> getAllPokemon(){
        return pokemonService.findAllPokemons();
    }

    @GetMapping("/getPokemon/{id}")
    public PokemonEntity getPokemonById(@PathVariable Long id){
        return pokemonService.findPokemonById(id);
    }

    @PostMapping("/savePokemon")
    public PokemonEntity savePokemon( @RequestBody PokemonEntity pokemonEntity){
        return pokemonService.savePokemon(pokemonEntity);
    }

    @PutMapping("/updatePokemon/{id}")
    public PokemonEntity updatePokemon(@PathVariable Long id,@RequestBody PokemonEntity pokemonEntity){
        return pokemonService.updatePokemon(id,pokemonEntity);
    }

    @DeleteMapping("/deletePokemon/{id}")
    public void deletePokemon(@PathVariable Long id){
        pokemonService.deletePokemon(id);
    }
}
