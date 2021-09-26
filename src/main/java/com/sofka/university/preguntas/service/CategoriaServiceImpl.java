package com.sofka.university.preguntas.service;

import java.util.List;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.sofka.university.preguntas.models.Categoria;
import com.sofka.university.preguntas.repository.CategoriaRepository;

@Service
@Transactional
public class CategoriaServiceImpl implements ICategoriaService {
	@Autowired
    private CategoriaRepository categoriaRepository;
	@Override
	public Categoria save(Categoria categoria) {
		// TODO Auto-generated method stub
		return categoriaRepository.save(categoria);
	}

	@Override
	public Categoria findById(int id) {
		// TODO Auto-generated method stub
		return categoriaRepository.getById(id);
	}

	@Override
	public List<Categoria> findAll() {
		// TODO Auto-generated method stub
		return categoriaRepository.findAll();
	}

	@Override
	public void deleteById(int id) {
		// TODO Auto-generated method stub
		categoriaRepository.deleteById(id);
	}

}
