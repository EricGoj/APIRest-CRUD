package com.prueba.a.Modelos;





import java.io.Serializable;
import java.util.HashSet;
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

//import com.fasterxml.jackson.annotation.JsonBackReference;



@Entity
@Table(name="peliculas")
@JsonIdentityInfo(generator=ObjectIdGenerators.IntSequenceGenerator.class,property="pelicula_id")
public class Pelicula implements Serializable {
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	@Column(name="pelicula_id")
	private Integer id;
	@Column(name="Titulo")
	private String titulo;
	@Column(name="Fecha")
	private String fechaDeCreacion;
	@Column(name="Calificacion")
	private String calificacion;
	
	
	@JoinTable(name = "peliculas_personajes", joinColumns = @JoinColumn(name = "pelicula_id"),
	inverseJoinColumns = @JoinColumn(name = "personaje_id"))
	@ManyToMany(cascade = CascadeType.ALL)
    private Set<Personaje> personajes = new HashSet<>();
	
	@JoinTable(name = "peliculas_generos", joinColumns = @JoinColumn(name = "pelicula_id"),
	inverseJoinColumns = @JoinColumn(name = "genero_id"))
	@ManyToMany(cascade = CascadeType.ALL)
    private Set<Personaje> generos = new HashSet<>();
	
	
	
    
//	@ManyToMany(mappedBy="peliculas",cascade = CascadeType.ALL)
//     private Set<Genero> Generos = new HashSet<>();
//    
    /*
	 @ManyToMany
	 @JoinTable(name = "peliculas_personajes",
	 private Set<Personaje> personajes = new HashSet<>();
	 */
	/*@ManyToOne
	@JoinColumn(name = "genero_id")
	@JsonBackReference
	private Genero genero;
	*/
	
	

	public Pelicula() {
		super();
	}

	public Set<Personaje> getPersonajes() {
		return personajes;
	}

	public void setPersonajes(Set<Personaje> personajes) {
		this.personajes = personajes;
	}
	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getTitulo() {
		return titulo;
	}

	public void setTitulo(String titulo) {
		this.titulo = titulo;
	}

	public String getFechaDeCreacion() {
		return fechaDeCreacion;
	}

	public void setFechaDeCreacion(String fechaDeCreacion) {
		this.fechaDeCreacion = fechaDeCreacion;
	}

	public String getCalificacion() {
		return calificacion;
	}

	public void setCalificacion(String calificacion) {
		this.calificacion = calificacion;
	}


}
