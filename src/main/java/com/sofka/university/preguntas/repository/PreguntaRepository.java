package com.sofka.university.preguntas.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.sofka.university.preguntas.models.Pregunta;

public interface PreguntaRepository extends JpaRepository<Pregunta, Long> {

}
