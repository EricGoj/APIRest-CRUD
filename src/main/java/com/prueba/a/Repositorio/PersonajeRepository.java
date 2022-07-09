package com.prueba.a.Repositorio;


import org.springframework.data.jpa.repository.JpaRepository;

import org.springframework.stereotype.Repository;

import com.prueba.a.Modelos.Personaje;

@Repository
public interface PersonajeRepository extends JpaRepository<Personaje,Integer> {
	


}
