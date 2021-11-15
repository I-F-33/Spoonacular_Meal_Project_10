package com.devflores.spoonacular_meals_10.dto;

import java.util.ArrayList;

public class DayInfo {

	private ArrayList<Meals> meals;

	private Nutrients nutrients;

	public ArrayList<Meals> getMeals() {
		return meals;
	}

	public void setMeals(ArrayList<Meals> meals) {
		this.meals = meals;
	}

	public Nutrients getNutrients() {
		return nutrients;
	}

	public void setNutrients(Nutrients nutrients) {
		this.nutrients = nutrients;
	}

}
