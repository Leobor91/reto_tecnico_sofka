package com.sofka.university.preguntas.service;

import java.util.List;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.sofka.university.preguntas.models.Respuesta;
import com.sofka.university.preguntas.repository.RespuestaRepository;

@Service
@Transactional
public class RespuestaServiceImpl implements IRespuestaService {
	@Autowired
	private RespuestaRepository respuestaRepository;

	@Override
	public Respuesta save(Respuesta respuesta) {
		// TODO Auto-generated method stub
		return respuestaRepository.save(respuesta);
	}

	@Override
	public Respuesta findById(long id) {
		// TODO Auto-generated method stub
		return respuestaRepository.getById(id);
	}

	@Override
	public List<Respuesta> findAll() {
		// TODO Auto-generated method stub
		return respuestaRepository.findAll();
	}

	@Override
	public void deleteById(Long id) {
		// TODO Auto-generated method stub
		respuestaRepository.deleteById(id);
	}

}
