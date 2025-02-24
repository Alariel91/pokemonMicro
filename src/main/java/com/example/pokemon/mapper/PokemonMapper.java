package com.example.pokemon.mapper;

import java.util.List;

import org.mapstruct.Mapper;
import org.mapstruct.Mapping;

import com.example.pokemon.dto.PokemonDto;
import com.example.pokemon.entity.PokemonEntity;

@Mapper(
    componentModel = "spring"
)
public interface PokemonMapper {
    @Mapping(target = "idPokemon" , source = "pokemonEntity.id")
    @Mapping(target = "namePokemon" , source = "pokemonEntity.name")
    @Mapping(target = "typePokemon" , source = "pokemonEntity.type")
    @Mapping(target = "evolutionLevelPokemon", source = "pokemonEntity.evolutionLevel", defaultValue = "0")
    @Mapping(target = "evolutionIndicatorPokemon", expression = "java( pokemonEntity.getEvolutionLevel() != null ? true : false )")

    PokemonDto pokemonEntityToPokemonDto (PokemonEntity pokemonEntity);

    List<PokemonDto> pokemonEntityToPokemonDto (List<PokemonEntity>  pokemonDto);
    
}
