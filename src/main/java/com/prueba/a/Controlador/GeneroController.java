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

import com.prueba.a.Modelos.Genero;
import com.prueba.a.Servicios.GeneroServicio;


@RestController
@RequestMapping("/api")
public class GeneroController {

	@Autowired
	private GeneroServicio servicio;

	//este metodo sirve para listar todos los empleados
	@GetMapping("/generos")
	public List<Genero> listarGenero() {
		return servicio.listaGenero();
	}

	@GetMapping("/generos/{id}")
	public ResponseEntity<Genero> ObtenesGenero(@PathVariable Integer id) {
			Genero perso = servicio.obtenerGeneroPorId(id);
			return new ResponseEntity<Genero>(perso, HttpStatus.OK);
	}

	@PostMapping("/generos")
	public void guardarGenero(@RequestBody Genero Genero) {
		servicio.guardarGeneros(Genero);
	}

	@PutMapping("/generos/{id}")
	public ResponseEntity<?> actualizarGenero(@RequestBody Genero Genero, @PathVariable Integer id) {
			Genero GeneroExis = servicio.obtenerGeneroPorId(id);
			servicio.guardarGeneros(GeneroExis);
    		return new ResponseEntity<Genero>(HttpStatus.OK);

	}

	@DeleteMapping("/generos/{id}")
	public void eliminarGenero(@PathVariable Integer id) {
		servicio.eliminarGenero(id);
	}

}



