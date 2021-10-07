package com.sofka.university.preguntas.service;

import java.util.List;

import com.sofka.university.preguntas.models.Persona;


public interface IPersonaService {
	public Persona save(Persona persona);

	public Persona findById(long id);

	public List<Persona> findAll();

	public void deleteById(Long id);
}
