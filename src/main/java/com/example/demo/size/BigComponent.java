package com.example.demo.size;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Profile;
import org.springframework.stereotype.Component;

@Component
@Profile("big")
public class BigComponent implements SizeComponent {

	@Value("${demo.hello}") String hello;

	@Override
	public String sizeHello(String name) {
		return hello + " Big " + name + "!";
	}

}
