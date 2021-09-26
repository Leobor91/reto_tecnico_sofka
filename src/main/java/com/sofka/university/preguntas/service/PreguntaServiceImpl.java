package com.sofka.university.preguntas.service;

import java.util.List;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.sofka.university.preguntas.models.Pregunta;
import com.sofka.university.preguntas.repository.PreguntaRepository;

@Service
@Transactional
public class PreguntaServiceImpl implements IPreguntaService{

	@Autowired
    private PreguntaRepository preguntaRepository;
	
	@Override
	public Pregunta save(Pregunta pregunta) {
		return preguntaRepository.save(pregunta);
		 
	}

	@Override
	public Pregunta findById(long id) {
		return preguntaRepository.getById(id);
		
	}

	@Override
	public List<Pregunta> findAll() {
		
		return preguntaRepository.findAll();
	}

	@Override
	public void deleteById(Long id) {
		preguntaRepository.deleteById(id);
	}

}
