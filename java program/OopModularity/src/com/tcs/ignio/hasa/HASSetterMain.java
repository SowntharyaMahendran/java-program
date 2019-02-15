package com.tcs.ignio.hasa;

public class HASSetterMain {
public static void main(String[] args){
	Address address=new Address();
	
	//another way to pass values by using setter method 
	address.setDoorno("111");
	address.setStreet("10");
	address.setArea("car street");
	address.setCity("chennai");
	address.setState("Tamil Nadu");
	
	
	Customer customer=new Customer();
	customer.setId(1);
	customer.setName("Sowntharya");
	customer.setAddress(address);
	
	
//print customer details
	System.out.println(".......Customer Details........");
	System.out.println("id : "+customer.getId());
	System.out.println("name : "+customer.getName());
	System.out.println("doorno : "+address.getDoorno());
	System.out.println("street : "+address.getStreet());
	System.out.println("Area : " +address.getArea());
	System.out.println("City : "+address.getCity());
	System.out.println("State : "+address.getState());
}
}
