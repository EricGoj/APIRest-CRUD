package com.prueba.a.Repositorio;




import org.springframework.data.jpa.repository.JpaRepository;

import org.springframework.stereotype.Repository;


import com.prueba.a.Modelos.Pelicula;

@Repository
public interface PeliculaRepository extends JpaRepository<Pelicula,Integer> {
		

}
