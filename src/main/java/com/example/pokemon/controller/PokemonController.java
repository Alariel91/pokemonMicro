package com.example.pokemon.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.pokemon.dto.PokemonDto;
import com.example.pokemon.entity.PokemonEntity;
import com.example.pokemon.mapper.PokemonMapper;
import com.example.pokemon.service.PokemonService;

@CrossOrigin(origins = "*")
@RestController
@RequestMapping("/api/pokemon")
public class PokemonController {
    @Autowired
    private PokemonService pokemonService;
    @Autowired
    private PokemonMapper mapper;

    @GetMapping("/getAllPokemons")
    public List<PokemonDto> getAllPokemon(){
        return mapper.pokemonEntityToPokemonDto(pokemonService.findAllPokemons());
    }

    @GetMapping("/getPokemon/{id}")
    public PokemonDto getPokemonById(@PathVariable Integer id){
        return mapper.pokemonEntityToPokemonDto(pokemonService.findPokemonById(id));
    }

    @PostMapping("/savePokemon")
    public PokemonDto savePokemon( @RequestBody PokemonEntity pokemonEntity){
        return mapper.pokemonEntityToPokemonDto(pokemonService.savePokemon(pokemonEntity));
    }

    @PutMapping("/updatePokemon/{id}")
    public PokemonDto updatePokemon(@PathVariable Integer id,@RequestBody PokemonEntity pokemonEntity){
        return mapper.pokemonEntityToPokemonDto(pokemonService.updatePokemon(id,pokemonEntity));
    }

    @DeleteMapping("/deletePokemon/{id}")
    public void deletePokemon(@PathVariable Integer id){
        pokemonService.deletePokemon(id);
    }
}
