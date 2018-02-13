package com.psl.q1;

public class Cities {
	
	int cityId;
	String cityName;
	String cityInfo;
	
	public int getCityId() {
		return cityId;
	}
	public void setCityId(int cityId) {
		this.cityId = cityId;
	}
	public String getCityName() {
		return cityName;
	}
	public void setCityName(String cityName) {
		this.cityName = cityName;
	}
	public String getCityInfo() {
		return cityInfo;
	}
	public void setCityInfo(String cityInfo) {
		this.cityInfo = cityInfo;
	}
	
	@Override
	public String toString() {
		return cityId + "  " + cityName
				+ "  " + cityInfo ;
	}
	
	
}
