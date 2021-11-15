package com.devflores.spoonacular_meals_10.configurations;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.client.RestTemplate;

@Configuration
public class RestTemplateConfigurations {

	@Bean
	public RestTemplate restTemplate() {
		return new RestTemplate();
	}
	
}
