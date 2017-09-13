package com.foobar;

import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

import com.foobar.bar.domain.Bar;
import com.foobar.bar.repo.BarRepository;


@SpringBootApplication
public class Application {

	public static void main(String[] args) {
		SpringApplication.run(Application.class, args);
	}
	
	@Bean
	public CommandLineRunner demo(BarRepository repository) {
		return (args) -> {
			  Bar bar = repository.findById((long) 1);
			  System.out.println(bar.toString());
			
		};
	}
}
