package com.example.demo;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class ProjectConfig {
	@Bean
	Parrot parrot() {
		var p = new Parrot();
		p.setName("KoKo");
		return p;
	}
	
	@Bean
	
	Parrot parrot1() {
		var p1 = new Parrot();
		p1.setName("MIKI");
		return p1;
	}
	
	Parrot parrot2() {
		var p2 = new Parrot();
		p2.setName("MIKIS");
		return p2;
	}
	
	@Bean
	String hello() {
		return "hello";
	}
	
	@Bean
	Integer ten() {
		return 10;
	}
}
