package com.kibernum.challenge.temperature.entities;

public class Location {
	private String title;
	private int woeid;
	
	public String getTitle() {
		return title;
	}
	public void setTitle(String title) {
		this.title = title;
	}
	public int getWoeid() {
		return woeid;
	}
	public void setWoeid(int woeid) {
		this.woeid = woeid;
	}
	
	@Override
	public String toString() {
		return "Location [title=" + title + ", woeid=" + woeid + "]";
	}
}
