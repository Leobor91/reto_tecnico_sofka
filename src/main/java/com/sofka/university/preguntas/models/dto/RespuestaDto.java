package com.sofka.university.preguntas.models.dto;
import java.util.List;

import com.sofka.university.preguntas.models.Respuesta;

public class RespuestaDto {

	private int categoria;
	private int pregunta;
	private int respuesta;
	private boolean retiro;
	private String tituloPregunta;
	private List<Respuesta> listaRespuesta;
	private int puntos;
	public int getCategoria() {
		return categoria;
	}
	public void setCategoria(int categoria) {
		this.categoria = categoria;
	}
	public int getPregunta() {
		return pregunta;
	}
	public void setPregunta(int pregunta) {
		this.pregunta = pregunta;
	}
	public int getRespuesta() {
		return respuesta;
	}
	public void setRespuesta(int respuesta) {
		this.respuesta = respuesta;
	}
	public boolean isRetiro() {
		return retiro;
	}
	public void setRetiro(boolean retiro) {
		this.retiro = retiro;
	}
	public String getTituloPregunta() {
		return tituloPregunta;
	}
	public void setTituloPregunta(String tituloPregunta) {
		this.tituloPregunta = tituloPregunta;
	}
	public List<Respuesta> getListaRespuesta() {
		return listaRespuesta;
	}
	public void setListaRespuesta(List<Respuesta> listaRespuesta) {
		this.listaRespuesta = listaRespuesta;
	}
	public int getPuntos() {
		return puntos;
	}
	public void setPuntos(int puntos) {
		this.puntos = puntos;
	}
	
	
	
	
}
