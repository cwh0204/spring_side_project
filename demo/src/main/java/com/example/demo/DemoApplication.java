package com.example.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

@SpringBootApplication
public class DemoApplication {

	public static void main(String[] args) {
		SpringApplication.run(DemoApplication.class, args);
		var context = new AnnotationConfigApplicationContext(ProjectConfig.class);
		Parrot p = context.getBean(Parrot.class);
		String h = context.getBean(String.class);
		Integer c = context.getBean(Integer.class);
		System.out.println("==============================");
		System.out.println(p.getName());
		System.out.println(h);
		System.out.println(c);
		
	}

}
