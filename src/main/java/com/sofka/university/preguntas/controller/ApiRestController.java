package com.sofka.university.preguntas.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestController;

import com.sofka.university.preguntas.models.Categoria;
import com.sofka.university.preguntas.models.Pregunta;
import com.sofka.university.preguntas.models.Respuesta;
import com.sofka.university.preguntas.service.ICategoriaService;
import com.sofka.university.preguntas.service.IPreguntaService;
import com.sofka.university.preguntas.service.IRespuestaService;

@RestController
@RequestMapping("/api")
public class ApiRestController {
	@Autowired
	private ICategoriaService categoriaService;
	@Autowired
	private IPreguntaService preguntaService;
	@Autowired
	private IRespuestaService respuestaService;

	/* manejo de categorias*/
	@PostMapping("/categoria")
	@ResponseStatus(HttpStatus.CREATED)
	public Categoria saveCategoria(@RequestBody Categoria categoria) {
		return categoriaService.save(categoria);
	} 
	@GetMapping("/categoria/{id}")
	public Categoria buscarCategoria(@PathVariable("id") int id) {
		return categoriaService.findById(id);
	}
	@GetMapping("/categoria")
	public List<Categoria> findAllCategoria() {
		return categoriaService.findAll();
	}
	
	// manejo de preguntas
	@PostMapping("/pregunta")
	@ResponseStatus(HttpStatus.CREATED)
	public Pregunta savePregunta(@RequestBody Pregunta pregunta) {
		return preguntaService.save(pregunta);
	} 
	@GetMapping("/pregunta/{id}")
	public Pregunta buscarPregunta(@PathVariable("id") Long id) {
		return preguntaService.findById(id);
	}
	@GetMapping("/pregunta")
	public List<Pregunta> findAllPregunta() {
		return preguntaService.findAll();
	}
	// manejo de respuesta
	@PostMapping("/respuesta")
	@ResponseStatus(HttpStatus.CREATED)
	public Respuesta saveRespuesta(@RequestBody Respuesta respuesta) {
		return respuestaService.save(respuesta);
	} 
	@GetMapping("/respuesta/{id}")
	public Respuesta buscarRespuesta(@PathVariable("id") Long id) {
		return respuestaService.findById(id);
	}
	@GetMapping("/respuesta")
	public List<Respuesta> findAllRespuesta() {
		return respuestaService.findAll();
	}
}
