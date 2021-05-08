package com.meensat.dto;

public class UserRegistrationDto {
	
	
	private Long phoneNumber;
	
	private String email;
	
	private String location;
	
	private double latitude;
	
	private double logitude;
	
	public UserRegistrationDto() {
	}
	public UserRegistrationDto(Long phoneNumber, String email, String location, double latitude, double logitude) {
		super();
		this.phoneNumber = phoneNumber;
		this.email = email;
		this.location = location;
		this.latitude = latitude;
		this.logitude = logitude;
	}
	
	public Long getPhoneNumber() {
		return phoneNumber;
	}

	public void setPhoneNumber(Long phoneNumber) {
		this.phoneNumber = phoneNumber;
	}
    
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getLocation() {
		return location;
	}

	public void setLocation(String location) {
		this.location = location;
	}

	public double getLatitude() {
		return latitude;
	}

	public void setLatitude(double latitude) {
		this.latitude = latitude;
	}

	public double getLogitude() {
		return logitude;
	}

	public void setLogitude(double logitude) {
		this.logitude = logitude;
	}	
}
