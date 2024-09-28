package com.example.demo;

import org.springframework.stereotype.Component;


@Component
public class MorningGreet implements Greet {
	@Override
	public String greeting() {
		return "おはよう";

	}

}
