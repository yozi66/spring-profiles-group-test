package com.example.demo.color;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Profile;
import org.springframework.stereotype.Component;

@Component
@Profile("red")
public class RedComponent implements ColorComponent {

	@Value("${demo.hello}") String hello;

	@Override
	public String helloColor(String name) {
		return hello + " Red " + name + "!";
	}

}
