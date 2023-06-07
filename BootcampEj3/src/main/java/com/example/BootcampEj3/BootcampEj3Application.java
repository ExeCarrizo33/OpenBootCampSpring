package com.example.BootcampEj3;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.context.ApplicationContext;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;


@SpringBootApplication
public class BootcampEj3Application {

	public static void main(String[] args) {


		ApplicationContext context = SpringApplication.run(BootcampEj3Application.class, args);

		CocheRepository repository = context.getBean(CocheRepository.class);

		System.out.println("El num de coches en base de datos es: " + repository.count());

		Coche toyota = new Coche(null, "Toyota", "Hilux", 2013);
		repository.save(toyota);

		System.out.println("El num de coches en base de datos es: " + repository.count());

		System.out.println(repository.findAll());
	}


}
