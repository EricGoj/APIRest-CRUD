package com.prueba.a.Controlador;


import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;

import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;

import org.springframework.web.bind.annotation.RestController;

import com.prueba.a.Modelos.Personaje;
import com.prueba.a.Servicios.PersonajeServicio;

@RestController
@RequestMapping("/api")
public class PersonajeControlador {

	@Autowired
	private PersonajeServicio servicio;

	@GetMapping("/personajes")
	public List<Personaje> listarPersonajes() {
		return servicio.listaPersoanjes();
	}

	@GetMapping("/personajes/{id}")
	public ResponseEntity<Personaje> ObtenesPersonaje(@PathVariable Integer id) {
			Personaje perso = servicio.obtenerPersonajePorId(id);
			return new ResponseEntity<Personaje>(perso, HttpStatus.OK);
	}

	@PostMapping("/personajes")
	public void guardarPersonaje(@RequestBody Personaje personaje) {
		servicio.guardarPersonajes(personaje);
	}

	@PutMapping("/personajes/{id}")
	public ResponseEntity<?> actualizarPersonaje(@RequestBody Personaje personaje, @PathVariable Integer id) {
			Personaje personajeExis = servicio.obtenerPersonajePorId(id);
			servicio.guardarPersonajes(personajeExis);
    		return new ResponseEntity<Personaje>(HttpStatus.OK);

	}

	@DeleteMapping("/personajes/{id}")
	public void eliminarPersonaje(@PathVariable Integer id) {
		servicio.eliminarPersonaje(id);
	}

}



