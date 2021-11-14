package com.devflores.spoonacular_meals_10.dto;

import com.fasterxml.jackson.annotation.JsonProperty;

public class Week {

	@JsonProperty("monday")
	public DayInfo monday;
	
	@JsonProperty("tuesday")
	public DayInfo tuesday;
	
	@JsonProperty("wednesday")
	public DayInfo wednesday;
	
	@JsonProperty("thursaday")
	public DayInfo thursday;
	
	@JsonProperty("friday")
	public DayInfo friday;
	
	@JsonProperty("saturday")
	public DayInfo saturday;
	
	@JsonProperty("sunday")
	public DayInfo sunday;

	public DayInfo getMonday() {
		return monday;
	}

	public void setMonday(DayInfo monday) {
		this.monday = monday;
	}

	public DayInfo getTuesday() {
		return tuesday;
	}

	public void setTuesday(DayInfo tuesday) {
		this.tuesday = tuesday;
	}

	public DayInfo getWednesday() {
		return wednesday;
	}

	public void setWednesday(DayInfo wednesday) {
		this.wednesday = wednesday;
	}

	public DayInfo getThursday() {
		return thursday;
	}

	public void setThursday(DayInfo thursday) {
		this.thursday = thursday;
	}

	public DayInfo getFriday() {
		return friday;
	}

	public void setFriday(DayInfo friday) {
		this.friday = friday;
	}

	public DayInfo getSaturday() {
		return saturday;
	}

	public void setSaturday(DayInfo saturday) {
		this.saturday = saturday;
	}

	public DayInfo getSunday() {
		return sunday;
	}

	public void setSunday(DayInfo sunday) {
		this.sunday = sunday;
	}
	
}
