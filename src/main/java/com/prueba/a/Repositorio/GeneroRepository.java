package com.prueba.a.Repositorio;
import org.springframework.data.jpa.repository.JpaRepository;

import org.springframework.stereotype.Repository;
import com.prueba.a.Modelos.Genero;



@Repository
public interface GeneroRepository extends JpaRepository<Genero,Integer> {
	
}
