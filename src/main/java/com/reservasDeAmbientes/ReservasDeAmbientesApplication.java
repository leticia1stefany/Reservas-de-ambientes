package com.reservasDeAmbientes;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.data.jpa.repository.config.EnableJpaAuditing;

@SpringBootApplication
@EnableJpaAuditing
public class ReservasDeAmbientesApplication {

	public static void main(String[] args) {
		SpringApplication.run(ReservasDeAmbientesApplication.class, args);
	}

}
