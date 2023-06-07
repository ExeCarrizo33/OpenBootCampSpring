package com.example.obspringdata;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

@SpringBootApplication
public class ObSpringdataApplication {

	public static void main(String[] args) {

		ApplicationContext context = SpringApplication.run(ObSpringdataApplication.class, args);
		CocheRepository repository = context.getBean(CocheRepository.class);

		System.out.println("find");
		System.out.println("El num de coches en base de datos es: " + repository.count());

		Coche toyota = new Coche(null, "Toyota","Hilux", 2013);
		repository.save(toyota);

		System.out.println("El num de coches en base de datos es: " + repository.count());

		System.out.println(repository.findAll());
	}

}
