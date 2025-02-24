package com.example.pokemon.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.pokemon.entity.PokemonEntity;

@Repository
public interface PokemonRepository extends JpaRepository<PokemonEntity,Integer>{

}
