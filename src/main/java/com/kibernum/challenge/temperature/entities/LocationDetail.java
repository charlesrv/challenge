package com.kibernum.challenge.temperature.entities;

import java.util.ArrayList;
import java.util.List;

import com.fasterxml.jackson.annotation.JsonProperty;

public class LocationDetail {
	@JsonProperty("consolidated_weather")
	List<ConsolidatedWeather> consolidatedWeather = new ArrayList<>();
	private String time;
	private String sunRise;
	private String sunSet;
	private String timezoneName;
	private Parent parent;
	List<Object> sources = new ArrayList<>();
	private String title;
	private String locationType;
	private float woeid;
	private String lattLong;
	private String timezone;
	
	public List<ConsolidatedWeather> getConsolidatedWeather() {
		return consolidatedWeather;
	}
	public void setConsolidatedWeather(List<ConsolidatedWeather> consolidatedWeather) {
		this.consolidatedWeather = consolidatedWeather;
	}
	public String getTime() {
		return time;
	}
	public void setTime(String time) {
		this.time = time;
	}
	public String getSunRise() {
		return sunRise;
	}
	public void setSunRise(String sunRise) {
		this.sunRise = sunRise;
	}
	public String getSunSet() {
		return sunSet;
	}
	public void setSunSet(String sunSet) {
		this.sunSet = sunSet;
	}
	public String getTimezoneName() {
		return timezoneName;
	}
	public void setTimezoneName(String timezoneName) {
		this.timezoneName = timezoneName;
	}
	public Parent getParent() {
		return this.parent;
	}
	public void setParent(Parent parent) {
		this.parent = parent;
	}
	public List<Object> getSources() {
		return sources;
	}
	public void setSources(List<Object> sources) {
		this.sources = sources;
	}
	public String getTitle() {
		return title;
	}
	public void setTitle(String title) {
		this.title = title;
	}
	public String getLocationType() {
		return locationType;
	}
	public void setLocationType(String locationType) {
		this.locationType = locationType;
	}
	public float getWoeid() {
		return woeid;
	}
	public void setWoeid(float woeid) {
		this.woeid = woeid;
	}
	public String getLattLong() {
		return lattLong;
	}
	public void setLattLong(String lattLong) {
		this.lattLong = lattLong;
	}
	public String getTimezone() {
		return timezone;
	}
	public void setTimezone(String timezone) {
		this.timezone = timezone;
	}
	
	@Override
	public String toString() {
		return "LocationDetail [consolidatedWeather=" + consolidatedWeather + ", time=" + time + ", sunRise=" + sunRise
				+ ", sunSet=" + sunSet + ", timezoneName=" + timezoneName + ", Parent=" + parent
				+ ", sources=" + sources + ", title=" + title + ", locationType=" + locationType + ", woeid=" + woeid
				+ ", lattLong=" + lattLong + ", timezone=" + timezone + "]";
	}
}
