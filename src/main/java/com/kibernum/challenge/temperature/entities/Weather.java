package com.kibernum.challenge.temperature.entities;

public class Weather {
	private float celsius;
	private float fahrenheit;
	
	public float getCelsius() {
		return celsius;
	}
	public void setCelsius(float celsius) {
		this.celsius = celsius;
	}
	public float getFahrenheit() {
		return fahrenheit;
	}
	public void setFahrenheit(float fahrenheit) {
		this.fahrenheit = fahrenheit;
	}
	
	@Override
	public String toString() {
		return "Weather [celsius=" + celsius + ", fahrenheit=" + fahrenheit + "]";
	}
}
