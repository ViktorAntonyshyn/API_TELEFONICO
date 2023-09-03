package com.example.PROYECTO_FULLSTACK;

import com.example.PROYECTO_FULLSTACK.domain.models.Cita;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@CrossOrigin(origins = "http://localhost:5173")
@SpringBootApplication

public class ProyectoFullstackApplication {

	public static void main(String[] args) {
		SpringApplication.run(ProyectoFullstackApplication.class, args);
	}
}
