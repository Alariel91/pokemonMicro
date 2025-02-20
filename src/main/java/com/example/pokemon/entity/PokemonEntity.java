package com.example.pokemon.entity;

import org.springframework.context.annotation.Description;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(
    name="pokemon"
)
@Description("Pokedex")
public class PokemonEntity {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String nombre;
    private String tipo;
    @Column(nullable = true)
    private Boolean indevolucion;
    @Column(nullable = true)
    private Integer nvlevolucion;

    public Long getId() {
        return id;
    }
    public void setId(Long id) {
        this.id = id;
    }
    public String getNombre() {
        return nombre;
    }
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
    public String getTipo() {
        return tipo;
    }
    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public Boolean getIndevolucion() {
        return indevolucion;
    }
    public void setIndevolucion(Boolean indevolucion) {
        this.indevolucion = indevolucion;
    }
    public Integer getNvlevolucion() {
        return nvlevolucion;
    }
    public void setNvlevolucion(Integer nvlevolucion) {
        this.nvlevolucion = nvlevolucion;
    }
    // Sobrescribir el método toString()
    @Override
    public String toString() {
        return "ID: " + id + "Nombre: " + nombre + ", Tipo: " + tipo + ", indEvolucion: " + indEvolucion + ", nvlEvolucion: " + nvlEvolucion;
    }
}
