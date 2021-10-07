package com.sofka.university.preguntas.controller;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;

import com.sofka.university.preguntas.models.Categoria;
import com.sofka.university.preguntas.models.Pregunta;
import com.sofka.university.preguntas.models.Respuesta;
import com.sofka.university.preguntas.models.dto.RespuestaDto;
import com.sofka.university.preguntas.service.ICategoriaService;
import com.sofka.university.preguntas.service.IPreguntaService;
import com.sofka.university.preguntas.service.IRespuestaService;

@Controller
public class juegoController {
	@Autowired
	private ICategoriaService categoriaService;
	@Autowired
	private IPreguntaService preguntaService;
	@Autowired
	private IRespuestaService respuestaService;
	
	public List<Pregunta> trerPreguntas(int idCategoria) {
		categoriaService.findAll();
		
		return new ArrayList<Pregunta>();
	}
	@GetMapping("/index")
	public String iniciar(Model model) {
		return "index";
	}
	@PostMapping("/iniciar-juego")
	public String iniciarJuego(@ModelAttribute RespuestaDto respuestaDto) {
		Categoria categoria=categoriaService.findById(1);
		List<Pregunta> PreguntaInicial=categoria.getPreguntas();
		int numero = new Random().nextInt(5);  // [0...4] [min = 0, max = 4]
		List<Respuesta> respuestas=PreguntaInicial.get(numero).getRespuesta();
		respuestaDto.setCategoria(categoria.getId());
		respuestaDto.setPregunta((int) PreguntaInicial.get(numero).getId());
		respuestaDto.setTituloPregunta(PreguntaInicial.get(numero).getTituloPregunta());
		respuestaDto.setListaRespuesta(respuestas);
		return "juego";
	}
	@PostMapping("/continuar-juego")
	public String iniciarContinuarJuego(@ModelAttribute RespuestaDto respuestaDto ) {
		
		//hacer los metodos que se requieran para validar si la respuesta es correcta
		
		int numeroCategoria = respuestaDto.getCategoria();
		//validar retiro, si retiro es falso continua, si no, le calculas los puntos y lo redireccionas fuera de juego
		if(respuestaDto.isRetiro()) {
			respuestaDto.setPuntos(retiro(respuestaDto));
			return "retiro";
			
			
		}
		
		int numeroRespuesta = respuestaDto.getRespuesta();
		//validas si la respuesta es la correcta, sino lo sacas del juego y le comunicas que perdio los puntos
		if(respuestaCorrecta(numeroRespuesta)==false) {
			return "gameover";
			
		}
		
		
		//se valida que no sea la ultima categoria, si lo es, se redirecciona
			//a tomar los datos de los ganadores y se procede a llenar el historico, en caso contrario continua 
		if(numeroCategoria == 5){
			respuestaDto.setPuntos(gano(respuestaDto));
			
			return "ganojuego"; //enviar como ganador  //validar si la repsutesa es correcta
		}
		
		Categoria categoria=categoriaService.findById(++numeroCategoria);
		List<Pregunta> PreguntaInicial=categoria.getPreguntas();
		int numero = new Random().nextInt(5);
		List<Respuesta> respuestas=PreguntaInicial.get(numero).getRespuesta();
		respuestaDto.setCategoria(categoria.getId());
		respuestaDto.setPregunta((int) PreguntaInicial.get(numero).getId());
		respuestaDto.setTituloPregunta(PreguntaInicial.get(numero).getTituloPregunta());
		respuestaDto.setListaRespuesta(respuestas);
		
		return "juego";
	}
	
	public boolean respuestaCorrecta(int numeroRespuesta) {
		Respuesta respuesta = respuestaService.findById(numeroRespuesta);
		boolean validar = respuesta.isCorrecta();
		return validar;
		
	}
	
	public int retiro(@ModelAttribute RespuestaDto respuestaDto ) {
		int puntos = 0;
		int numeroCategoria = respuestaDto.getCategoria();
		List<Categoria> categoria= categoriaService.findAll();
		 for (Categoria categoria2 : categoria) {
			 if(categoria2.getId() < numeroCategoria) {
				 puntos += categoria2.getPuntos();
			 }
			
		}
		 return puntos;
	}
	public int gano(@ModelAttribute RespuestaDto respuestaDto ) {
		int puntos = 0;
		int numeroCategoria = respuestaDto.getCategoria();
		List<Categoria> categoria= categoriaService.findAll();
		 for (Categoria categoria2 : categoria) {
			 if(categoria2.getId() <= numeroCategoria) {
				 puntos += categoria2.getPuntos();
			 }
			
		}
		 return puntos;
	}
	
}
