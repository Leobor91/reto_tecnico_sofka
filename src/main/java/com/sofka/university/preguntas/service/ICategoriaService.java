package com.sofka.university.preguntas.service;

import java.util.List;

import com.sofka.university.preguntas.models.Categoria;

public interface ICategoriaService {

	public Categoria save(Categoria categoria);

	public Categoria findById(int id);

	public List<Categoria> findAll();

	public void deleteById(int id);

}
