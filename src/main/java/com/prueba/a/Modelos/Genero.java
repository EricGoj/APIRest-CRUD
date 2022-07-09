package com.prueba.a.Modelos;

import java.io.Serializable;
import java.util.Set;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.JoinTable;
import javax.persistence.ManyToMany;
import javax.persistence.Table;

import com.fasterxml.jackson.annotation.JsonIdentityInfo;
import com.fasterxml.jackson.annotation.ObjectIdGenerators;

@Entity
@Table(name = "generos")
@JsonIdentityInfo(generator = ObjectIdGenerators.IntSequenceGenerator.class, property = "genero_id")
public class Genero implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "genero_id")
	private Integer id;
	@Column(name = "nombre")
	private String nombre;

	@ManyToMany(mappedBy = "generos")
	private Set<Pelicula> Peliculas;

	/*
	 * @OneToMany(mappedBy = "generos", cascade = CascadeType.ALL) private
	 * Set<Pelicula> Peliculas = new HashSet<>();
	 */

	/**
	 * 
	 */
	public Genero() {
		super();
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

	public Set<Pelicula> getPeliculas() {
		return Peliculas;
	}

	public void setPeliculas(Set<Pelicula> peliculas) {
		Peliculas = peliculas;
	}

}
