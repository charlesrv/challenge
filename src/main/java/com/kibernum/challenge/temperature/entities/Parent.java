package com.kibernum.challenge.temperature.entities;

public class Parent {
	private String title;
	private String locationType;
	private float woeid;
	private String lattLong;
	
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
	
	@Override
	public String toString() {
		return "Parent [title=" + title + ", locationType=" + locationType + ", woeid=" + woeid + ", lattLong="
				+ lattLong + "]";
	}
}
