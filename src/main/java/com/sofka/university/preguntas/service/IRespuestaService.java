package com.sofka.university.preguntas.service;

import java.util.List;

import com.sofka.university.preguntas.models.Respuesta;


public interface IRespuestaService {
	public Respuesta save(Respuesta categoria);

	public Respuesta findById(long id);

	public List<Respuesta> findAll();

	public void deleteById(Long id);
}
