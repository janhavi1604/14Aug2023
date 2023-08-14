package com.mystream;

public class Location {

	public Location(String locationName, String state) {
		super();
		this.locationName = locationName;
		this.state = state;
	}
	private String locationName;
	private String state;
	public String getLocationName() {
		return locationName;
	}
	public void setLocationName(String locationName) {
		this.locationName = locationName;
	}
	public String getState() {
		return state;
	}
	public void setState(String state) {
		this.state = state;
	}
	@Override
	public String toString() {
		return "Location [locationName=" + locationName + ", state=" + state + "]";
	}
}
