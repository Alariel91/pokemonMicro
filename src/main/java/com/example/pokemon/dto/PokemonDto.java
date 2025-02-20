package com.example.pokemon.dto;

public class PokemonDto {

    private Long idPokemon;
    private String nombrePokemon;
    private String tipoPokemon;
    private boolean indEvolucionPokemon;
    private int nvlEvolucionPokemon;
    public Long getIdPokemon() {
        return idPokemon;
    }
    public void setIdPokemon(Long idPokemon) {
        this.idPokemon = idPokemon;
    }
    public String getNombrePokemon() {
        return nombrePokemon;
    }
    public void setNombrePokemon(String nombrePokemon) {
        this.nombrePokemon = nombrePokemon;
    }
    public String getTipoPokemon() {
        return tipoPokemon;
    }
    public void setTipoPokemon(String tipoPokemon) {
        this.tipoPokemon = tipoPokemon;
    }
    public boolean isIndEvolucionPokemon() {
        return indEvolucionPokemon;
    }
    public void setIndEvolucionPokemon(boolean indEvolucionPokemon) {
        this.indEvolucionPokemon = indEvolucionPokemon;
    }
    public int getNvlEvolucionPokemon() {
        return nvlEvolucionPokemon;
    }
    public void setNvlEvolucionPokemon(int nvlEvolucionPokemon) {
        this.nvlEvolucionPokemon = nvlEvolucionPokemon;
    }

    
}
