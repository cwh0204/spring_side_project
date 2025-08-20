package com.example.demo;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class ProjectConfig {

	@Bean
	public Parrot parrot() {
		Parrot p = new Parrot();
		p.setName("KoKo");
		return p;
	}
	
	@Bean
	public Person person(Parrot parrot) {
		Person p1 = new Person();
		p1.setName("KiKi");
		p1.setParrot(parrot); 
		return p1;
	}
	
}
