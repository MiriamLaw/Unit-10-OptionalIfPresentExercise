package com.coderscampus.domain;

public class SuspectLocation {

	private String country;
	private String name;
	
	public SuspectLocation(String country, String name) {
		this.country = country;
		this.name = name;
		
	}

	@Override
	public String toString() {
		return "SuspectLocation [name=" + name + ", country=" + country + "]";
	}

	public String getCountry() {
		return country;
	}

	public void setCountry(String country) {
		this.country = country;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}
}
