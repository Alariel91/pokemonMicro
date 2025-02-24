package com.example.pokemon.entity;

import org.springframework.context.annotation.Description;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(
    name="pokemon"
)
@Description("Pokedex")
public class PokemonEntity {
    @Id
    private Integer id;
    private String name;
    private String type;
    @Column(nullable = true)
    private Integer evolutionlevel;

    public Integer getId() {
        return id;
    }
    public void setId(Integer id) {
        this.id = id;
    }
   
    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
    public String getType() {
        return type;
    }
    public void setType(String type) {
        this.type = type;
    }
    public Integer getEvolutionLevel() {
        return evolutionlevel;
    }
    public void setEvolutionLevel(Integer evolutionlevel) {
        this.evolutionlevel = evolutionlevel;
    }

    // Sobrescribir el método toString()
    @Override
    public String toString() {
        return "ID: " + id + "Name: " + name + ", Type: " + type + ", evolutionLevel: " + evolutionlevel;
    }

}
