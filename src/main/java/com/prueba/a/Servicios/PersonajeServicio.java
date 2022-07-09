package com.prueba.a.Servicios;


import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.prueba.a.Modelos.Personaje;
import com.prueba.a.Repositorio.PersonajeRepository;

@Service
public class PersonajeServicio {
	
	@Autowired
	private PersonajeRepository repositorio;
	
	public List<Personaje> listaPersoanjes(){
		return repositorio.findAll();
	}
	
	public void guardarPersonajes(Personaje personaje) {
		repositorio.save(personaje);
	}
	
	public Personaje obtenerPersonajePorId(Integer id) {
		return repositorio.findById(id).get();
	}
	
	public void eliminarPersonaje(Integer id) {
		repositorio.deleteById(id);
	}
	
	

}
