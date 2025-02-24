package com.example.pokemon.dto;

public class PokemonDto {

    private Integer idPokemon;
    private String namePokemon;
    private String typePokemon;
    private Integer evolutionLevelPokemon;
    private Boolean evolutionIndicatorPokemon;

    public Boolean getEvolutionIndicatorPokemon() {
        return evolutionIndicatorPokemon;
    }
    public void setEvolutionIndicatorPokemon(Boolean evolutionIndicatorPokemon) {
        this.evolutionIndicatorPokemon = evolutionIndicatorPokemon;
    }
    public Integer getIdPokemon() {
        return idPokemon;
    }
    public void setIdPokemon(Integer idPokemon) {
        this.idPokemon = idPokemon;
    }
    public String getNamePokemon() {
        return namePokemon;
    }
    public void setNamePokemon(String namePokemon) {
        this.namePokemon = namePokemon;
    }
    public String getTypePokemon() {
        return typePokemon;
    }
    public void setTypePokemon(String typePokemon) {
        this.typePokemon = typePokemon;
    }
    public int getEvolutionLevelPokemon() {
        return evolutionLevelPokemon;
    }
    public void setEvolutionLevelPokemon(int evolutionLevelPokemon) {
        this.evolutionLevelPokemon = evolutionLevelPokemon;
    }
    

    
}
