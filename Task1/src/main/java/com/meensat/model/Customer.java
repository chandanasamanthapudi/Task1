package com.meensat.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Customer {
	
	
		@Id
		@GeneratedValue(strategy = GenerationType.IDENTITY)
		private Long id;
		
		private Long phoneNumber;
		
		private String location;
		
		private double latitude;
		
		private double logitude;

		public Customer() {
			
		}
		public Customer(Long phoneNumber, String location, double latitude, double logitude) {
			super();
			this.phoneNumber = phoneNumber;
			this.location = location;
			this.latitude = latitude;
			this.logitude = logitude;
		}
		public Long getId() {
			return id;
		}
		public void setId(Long id) {
			this.id = id;
		}
		public Long getPhoneNumber() {
			return phoneNumber;
		}
		public void setPhoneNumber(Long phoneNumber) {
			this.phoneNumber = phoneNumber;
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
