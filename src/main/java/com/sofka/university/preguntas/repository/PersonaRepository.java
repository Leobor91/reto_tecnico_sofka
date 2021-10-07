package com.sofka.university.preguntas.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.sofka.university.preguntas.models.Persona;

public interface PersonaRepository extends JpaRepository<Persona, Long>{

}
