package com.prueba.a.Servicios;


import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.prueba.a.Modelos.Pelicula;
import com.prueba.a.Repositorio.PeliculaRepository;

@Service
public class PeliculaServicio {
	
	@Autowired
	private PeliculaRepository repositorio;
	
	public List<Pelicula> listaPelicula(){
		return repositorio.findAll();
	}
	
	public void guardarPeliculas(Pelicula Pelicula) {
		repositorio.save(Pelicula);
	}
	
	public Pelicula obtenerPeliculaPorId(Integer id) {
		return repositorio.findById(id).get();
	}
	
	public void eliminarPelicula(Integer id) {
		repositorio.deleteById(id);
	}
	
	
	
	

}
