package com.devflores.spoonacular_meals_10.web;

import java.net.URI;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;
import org.springframework.web.util.UriComponentsBuilder;

import com.devflores.spoonacular_meals_10.dto.DayResponse;
import com.devflores.spoonacular_meals_10.dto.WeekResponse;

@RestController
public class RecipeController {
	
	@Autowired 
	private RestTemplate restTemplate;
	@Value("${spoonacular.urls.base}")
	private String baseUrl;
	@Value("${api.key}")
	private String key;
	
	 @GetMapping("mealplanner/week")
	 public ResponseEntity<WeekResponse> getWeekMeals(Optional<Integer> targetCalories, Optional <String> diet, Optional <String> exclude) {
		URI uri = UriComponentsBuilder.fromHttpUrl(baseUrl)
									  .queryParam("timeFrame", "week")
									  .queryParamIfPresent("targetCalories", targetCalories)
									  .queryParamIfPresent("diet", diet)
									  .queryParamIfPresent("exclude", exclude)
									  .queryParam("apiKey",key)
									  .build()
									  .toUri();
		return restTemplate.getForEntity(uri, WeekResponse.class);
	  }
	
	 @GetMapping("mealplanner/day") 
	 public ResponseEntity<DayResponse> getDayMeals(Optional<Integer> targetCalories, Optional <String> diet, Optional<String> exclude) {
		URI uri = UriComponentsBuilder.fromHttpUrl(baseUrl)
				 					  .queryParam("timeFrame", "day")
				 					  .queryParamIfPresent("targetCalories", targetCalories)
				 					  .queryParamIfPresent("diet", diet)
				 					  .queryParamIfPresent("exclude", exclude)
				 					  .queryParam("apiKey", key)
				 					  .build()
				 					  .toUri();
		return restTemplate.getForEntity(uri, DayResponse.class);
		  }
		 
}
