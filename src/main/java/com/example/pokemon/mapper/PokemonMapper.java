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
    @Mapping(target = "nombrePokemon" , source = "pokemonEntity.nombre")
    @Mapping(target = "tipoPokemon" , source = "pokemonEntity.tipo")
    @Mapping(target = "indEvolucionPokemon" , source = "pokemonEntity.indevolucion")
    @Mapping(target = "nvlEvolucionPokemon" , source = "pokemonEntity.nvlevolucion")
    PokemonDto pokemonEntityToPokemonDto (PokemonEntity pokemonEntity);

    List<PokemonDto> pokemonEntityToPokemonDto (List<PokemonEntity>  pokemonDto);
      
    
}
