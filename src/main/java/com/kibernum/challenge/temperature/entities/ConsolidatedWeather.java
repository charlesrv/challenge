package com.kibernum.challenge.temperature.entities;

import java.time.LocalDateTime;

import com.fasterxml.jackson.annotation.JsonFormat;
import com.fasterxml.jackson.annotation.JsonProperty;

public class ConsolidatedWeather {
	private float id;
	@JsonFormat(pattern = "yyyy-MM-dd'T'HH:mm:ss.SSSSSS'Z'")
	private LocalDateTime created;
	@JsonProperty("the_temp")
	private float theTemp;
	
	public float getId() {
		return id;
	}
	public void setId(float id) {
		this.id = id;
	}
	public LocalDateTime getCreated() {
		return created;
	}
	public void setCreated(LocalDateTime created) {
		this.created = created;
	}
	public float getTheTemp() {
		return theTemp;
	}
	public void setTheTemp(float theTemp) {
		this.theTemp = theTemp;
	}
	
	@Override
	public String toString() {
		return "ConsolidatedWeather [id=" + id + ", created=" + created + ", theTemp=" + theTemp + "]";
	}
}
