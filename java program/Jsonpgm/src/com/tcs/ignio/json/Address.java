package com.tcs.ignio.json;

public class Address {
	private String street;
	private String city;
	private double zipcode;

	//default constructor
	public Address(){
		this.street="";
		this.city="";
		this.zipcode='0';
	}
	
	//para constructor
	public Address(String street, String city, double zipcode) {
		
		this.street = street;
		this.city = city;
		this.zipcode = zipcode;
	}

	 //getter and setter
	public String getStreet() {
		return street;
	}

	public void setStreet(String street) {
		this.street = street;
	}

	public String getCity() {
		return city;
	}

	public void setCity(String city) {
		this.city = city;
	}

	public double getZipcode() {
		return zipcode;
	}

	public void setZipcode(double zipcode) {
		this.zipcode = zipcode;
	}
	
     
	
	

}
