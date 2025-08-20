package com.example.demo;

import java.util.function.Supplier;

import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

@SpringBootApplication
public class DemoApplication {

	public static void main(String[] args) {
//		SpringApplication.run(DemoApplication.class, args);
		var context = new AnnotationConfigApplicationContext(ProjectConfig.class);
		
		Parrot a = context.getBean(Parrot.class);
		Person b = context.getBean(Person.class);
		
		System.out.println(a);
		System.out.println(b.parrot.getName());
		System.out.println(b);
	}
}
