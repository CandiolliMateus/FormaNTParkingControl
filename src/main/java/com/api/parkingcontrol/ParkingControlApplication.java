package com.api.parkingcontrol;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
@RestController
public class ParkingControlApplication {

	public static void main(String[] args) {
		SpringApplication.run(ParkingControlApplication.class, args);
	}

	@GetMapping("/")
	public String index() {
		return "Olá mundo!";
	}
	public String index02() {
		return "FAZENDO UMA ALTERAÇÃO PARA TENTAR FAZER COMMIT E PUSH NO GITHUB";
	}
}
