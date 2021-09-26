package com.sofka.university.preguntas;

import java.util.List;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

import com.sofka.university.preguntas.controller.juegoController;
import com.sofka.university.preguntas.models.Pregunta;

@SpringBootApplication
@ComponentScan(basePackages="com.sofka.university.preguntas.*")
@EntityScan("com.sofka.university.preguntas.*")
@EnableJpaRepositories("com.sofka.university.preguntas.repository")
public class PreguntasApplication {

	public static void main(String[] args) {
		SpringApplication.run(PreguntasApplication.class, args);
	}

}
