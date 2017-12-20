package ru.ituniverse.simplerestapi;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;


@EnableAutoConfiguration
@SpringBootApplication
public class SimpleRestApiApplication {

	public static void main(String[] args) {
		SpringApplication.run(SimpleRestApiApplication.class, args);
	}
}
