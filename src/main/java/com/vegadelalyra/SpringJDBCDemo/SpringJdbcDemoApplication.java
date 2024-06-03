package com.vegadelalyra.SpringJDBCDemo;

import com.vegadelalyra.SpringJDBCDemo.alien.Alien;
import com.vegadelalyra.SpringJDBCDemo.alien.AlienRepository;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

@SpringBootApplication
public class SpringJdbcDemoApplication {

	public static void main(String[] args) {

		ApplicationContext context = SpringApplication.run(SpringJdbcDemoApplication.class, args);

		Alien alien1 = context.getBean(Alien.class);

		alien1.setId(111);
		alien1.setName("Navin");
		alien1.setTech("Java");

		AlienRepository alienRepository = context.getBean(AlienRepository.class);

		alienRepository.save(alien1);

		alienRepository.findAll().forEach(System.out::println);;
	}

}
