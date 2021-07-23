package br.org.generation.exercicio2.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

	@RestController
	@RequestMapping("/exercicio2")
	public class Exercicio2 {
		
		@GetMapping
		public String exercicio2() {
			return "Estudar mais sobre SQL e Spring Boot";
		}
	
}
