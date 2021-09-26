package com.sofka.university.preguntas.service;

import java.util.List;
import java.util.Optional;

import com.sofka.university.preguntas.models.Pregunta;


public interface IPreguntaService {
	
	public  Pregunta save(Pregunta pregunta);
	public  Pregunta findById(long id);
	public  List<Pregunta> findAll();
	public  void deleteById(Long id);

}
