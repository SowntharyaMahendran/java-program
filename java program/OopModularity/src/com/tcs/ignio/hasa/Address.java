package com.tcs.ignio.hasa;

public class Address {
	private String doorno;
	private String street;
	private String area;
	private String city;
	private String state;
	
	//default constructor
	public Address(){
		this.doorno="default doorno";
		this.street="default street";
		this.area="default area";
		this.city="default city";
		this.state="default state";
	}

	//paramet constructor
	public Address(String doorno, String street, String area, String city,
			String state) {
		super();
		this.doorno = doorno;
		this.street = street;
		this.area = area;
		this.city = city;
		this.state = state;
	}

	//getter and setter
	public String getDoorno() {
		return doorno;
	}

	public void setDoorno(String doorno) {
		this.doorno = doorno;
	}

	public String getStreet() {
		return street;
	}

	public void setStreet(String street) {
		this.street = street;
	}

	public String getArea() {
		return area;
	}

	public void setArea(String area) {
		this.area = area;
	}

	public String getCity() {
		return city;
	}

	public void setCity(String city) {
		this.city = city;
	}

	public String getState() {
		return state;
	}

	public void setState(String state) {
		this.state = state;
	}
	
	

}
