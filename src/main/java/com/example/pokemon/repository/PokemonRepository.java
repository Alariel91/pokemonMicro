package com.example.pokemon.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import com.example.pokemon.entity.PokemonEntity;

@Repository
public interface PokemonRepository extends JpaRepository<PokemonEntity,Long>{

    @Query("SELECT P FROM PokemonEntity P")
    List<PokemonEntity> getAllPokemons();
}
