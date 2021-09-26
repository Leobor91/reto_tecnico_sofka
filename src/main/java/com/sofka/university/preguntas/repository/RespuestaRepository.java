package com.sofka.university.preguntas.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.sofka.university.preguntas.models.Respuesta;

public interface RespuestaRepository extends JpaRepository<Respuesta, Long> {

}
