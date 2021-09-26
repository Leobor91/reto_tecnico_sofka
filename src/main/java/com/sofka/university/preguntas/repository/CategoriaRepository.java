package com.sofka.university.preguntas.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.sofka.university.preguntas.models.Categoria;

public interface CategoriaRepository extends JpaRepository<Categoria , Integer> {

}
