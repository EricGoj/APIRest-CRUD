package com.prueba.a.Modelos;




import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;



@Entity
@Table(name="generos")
public class Genero {

	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	@Column(name="genero_id")
	private Integer id;
	@Column(name="nombre")
	private String nombre;
	
	/*
	@OneToMany(mappedBy = "generos", cascade = CascadeType.ALL)
	private Set<Pelicula> Peliculas = new HashSet<>();
	*/
	
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


	
	public Genero() {
		super();
	}




	

	

}
