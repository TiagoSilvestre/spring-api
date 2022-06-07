package com.system.demo_sys;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
@RestController
public class DemoSysApplication {
// 41 minutos do video da moça
	//https://www.youtube.com/watch?v=LXRU-Z36GEU&t=2472s
	// https://www.postgresqltutorial.com/postgresql-uuid/   UUID
	// https://www.youtube.com/watch?v=tNi8ymBdAh4  Deploy na aws
	// https://www.youtube.com/watch?v=Cq_n9dl7NZo  asw e docker
	public static void main(String[] args) {
		SpringApplication.run(DemoSysApplication.class, args);
	}

	@GetMapping("/")
	public String index() {
		return "Olá";
	}

}
