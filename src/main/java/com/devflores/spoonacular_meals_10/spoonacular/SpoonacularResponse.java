package com.devflores.spoonacular_meals_10.spoonacular;

import java.net.URI;

import org.junit.jupiter.api.Test;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;
import org.springframework.web.util.UriComponentsBuilder;

import com.devflores.spoonacular_meals_10.dto.WeekResponse;

@Service
public class SpoonacularResponse {


	@Test
	public void fetchDayResponse() {
	RestTemplate template = new RestTemplate();
	// https://api.spoonacular.com/mealplanner/generate?timeFrame=day
	URI uri = UriComponentsBuilder.fromHttpUrl("https://api.spoonacular.com/mealplanner/generate")
								  .queryParam("timeframe", "week")
								  .queryParam("apiKey","4ba135fcdc3d4ade9661e154b43a0c94" )
								  .build()
								  .toUri();
	
	ResponseEntity<WeekResponse> weekResponse = template.getForEntity(uri, WeekResponse.class);
	System.out.println(weekResponse.getBody());
	}
	
	
}
