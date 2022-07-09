package com.prueba.a.Modelos;


import java.io.Serializable;
import java.util.Set;


import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

import javax.persistence.ManyToMany;
import javax.persistence.Table;

import com.fasterxml.jackson.annotation.JsonIdentityInfo;
import com.fasterxml.jackson.annotation.ObjectIdGenerators;



@Entity
@Table(name="personajes")
@JsonIdentityInfo(generator=ObjectIdGenerators.IntSequenceGenerator.class,property="personaje_id")
public class Personaje implements Serializable {
	
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	@Column(name="personaje_id")
	private Integer id;
	
	@Column(name="nombre")
	private String nombre;
	
	@Column(name="edad")
	private String edad;
	
	@Column(name="peso")
	private String peso;
	
	@Column(name="historia")
	private String historia;
	

	@ManyToMany(mappedBy = "personajes")
    private Set<Pelicula> Peliculas;
	
	
	public Set<Pelicula> getPeliculas() {
		return Peliculas;
	}

	public void setPeliculas(Set<Pelicula> peliculas) {
		Peliculas = peliculas;
	}

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}


	public String getNombre() {
		return nombre;
	}


	public void setNombre(String nombre) {
		this.nombre = nombre;
	}


	public String getEdad() {
		return edad;
	}


	public void setEdad(String edad) {
		this.edad = edad;
	}


	public String getPeso() {
		return peso;
	}


	public void setPeso(String peso) {
		this.peso = peso;
	}


	public String getHistoria() {
		return historia;
	}


	public void setHistoria(String historia) {
		this.historia = historia;
	}


	
	public Personaje() {
		super();
	}




}
