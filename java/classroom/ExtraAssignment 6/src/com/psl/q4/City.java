package com.psl.q4;

public class City {
	int cityId;
	String city;
	
	
	public int getCityId() {
		return cityId;
	}
	public void setCityId(int cityId) {
		this.cityId = cityId;
	}
	public String getCityName() {
		return city;
	}
	public void setCityName(String city) {
		this.city = city;
	}
	
	@Override
	public String toString() {
		return  cityId + "   " + city ;
	}
	

	
}
