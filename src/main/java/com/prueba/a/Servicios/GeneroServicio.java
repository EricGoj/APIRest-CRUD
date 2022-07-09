package com.prueba.a.Servicios;


import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.prueba.a.Modelos.Genero;
import com.prueba.a.Repositorio.GeneroRepository;

@Service
public class GeneroServicio {
	
	@Autowired
	private GeneroRepository repositorio;
	
	public List<Genero> listaGenero(){
		return repositorio.findAll();
	}
	
	public void guardarGeneros(Genero Genero) {
		repositorio.save(Genero);
	}
	
	public Genero obtenerGeneroPorId(Integer id) {
		return repositorio.findById(id).get();
	}
	
	public void eliminarGenero(Integer id) {
		repositorio.deleteById(id);
	}
	
	
	
	

}
