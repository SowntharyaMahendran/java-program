package com.tcs.ignio.json;

public class Userdetails {
private String name;
private String username;
private String email;
private int mobilenum;
private String website;


//default constructor
public Userdetails(){
	this.name ="";
	this.username ="";
	this.email ="";
	this.mobilenum='0';
	this.website ="";
	
}

//para constructor
public Userdetails(String name, String username, String email, int mobilenum,
		String website) {
	
	this.name = name;
	this.username = username;
	this.email = email;
	this.mobilenum = mobilenum;
	this.website = website;
}

//getter amd setter
public String getName() {
	return name;
}

public void setName(String name) {
	this.name = name;
}

public String getUsername() {
	return username;
}

public void setUsername(String username) {
	this.username = username;
}

public String getEmail() {
	return email;
}

public void setEmail(String email) {
	this.email = email;
}

public int getMobilenum() {
	return mobilenum;
}

public void setMobilenum(int mobilenum) {
	this.mobilenum = mobilenum;
}

public String getWebsite() {
	return website;
}

public void setWebsite(String website) {
	this.website = website;
}

}



