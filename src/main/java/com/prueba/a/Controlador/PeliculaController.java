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

import com.prueba.a.Modelos.Pelicula;
import com.prueba.a.Servicios.PeliculaServicio;

@RestController
@RequestMapping("/api")
public class PeliculaController {

	@Autowired
	private PeliculaServicio servicio;

	//este metodo sirve para listar todos los empleados
	@GetMapping("/peliculas")
	public List<Pelicula> listarPeliculas() {
		return servicio.listaPelicula();
	}

	@GetMapping("/peliculas/{id}")
	public ResponseEntity<Pelicula> ObtenesPelicula(@PathVariable Integer id) {
			Pelicula perso = servicio.obtenerPeliculaPorId(id);
			return new ResponseEntity<Pelicula>(perso, HttpStatus.OK);
	}

	@PostMapping("/peliculas")
	public void guardarPelicula(@RequestBody Pelicula Pelicula) {
		servicio.guardarPeliculas(Pelicula);
	}

	@PutMapping("/peliculas/{id}")
	public ResponseEntity<?> actualizarPelicula(@RequestBody Pelicula Pelicula, @PathVariable Integer id) {
			Pelicula PeliculaExis = servicio.obtenerPeliculaPorId(id);
			servicio.guardarPeliculas(PeliculaExis);
    		return new ResponseEntity<Pelicula>(HttpStatus.OK);

	}

	@DeleteMapping("/peliculas/{id}")
	public void eliminarPelicula(@PathVariable Integer id) {
		servicio.eliminarPelicula(id);
	}

}



