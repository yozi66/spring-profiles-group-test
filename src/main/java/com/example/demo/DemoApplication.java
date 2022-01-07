package com.example.demo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.example.demo.color.ColorComponent;
import com.example.demo.size.SizeComponent;

@SpringBootApplication
public class DemoApplication implements CommandLineRunner {
	
	@Autowired ColorComponent colorComponent;
	@Autowired SizeComponent sizeComponent;

	public static void main(String[] args) {
		SpringApplication.run(DemoApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception {
		String name = args.length > 0 ? args[0] : "World";
		System.out.println(colorComponent.helloColor(name));
		System.out.println(sizeComponent.sizeHello(name));
	}

}
