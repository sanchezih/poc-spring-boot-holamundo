package com.github.sanchezih;

import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

/**
 * SpringBootApplication: Es la anotacion principal que indica que esta es una
 * aplicacion Spring Boot.
 * 
 * CommandLineRunner: Es una interfaz que te permite ejecutar codigo al iniciar
 * la aplicacion. En este caso, se usa para imprimir "¡Hola Mundo desde Spring
 * Boot!" en la consola.
 */
@SpringBootApplication
public class Application implements CommandLineRunner {

	public static void main(String[] args) {
		SpringApplication.run(Application.class, args);
	}

	@Override
	public void run(String... args) throws Exception {
		System.out.println("¡Hola Mundo desde Spring Boot!");
	}

}
