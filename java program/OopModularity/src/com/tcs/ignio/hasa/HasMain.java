package com.tcs.ignio.hasa;

public class HasMain {
	public static void main (String[] args) {
		//Address
		Address address=new Address("111","10th","car street","chennai","TamilNadu");
		//Address is linked with Customer
		Customer customer = new Customer(1,"sowntharya",address);
		
		//print customer details
		System.out.println(".......customer Details.......");
		System.out.println("id: "+customer.getId());
		System.out.println("name: "+ customer.getName());
		
		//way to get other object
		Address add= customer.getAddress();
		
		//Address info
		System.out.println("door no : "+add.getDoorno());
		System.out.println("street : "+add.getStreet());
		System.out.println("Area : "+add.getArea());
		System.out.println("city : "+add.getCity());
		System.out.println("State : "+add.getState());
		
		//using chaining pattern: recommended
		System.out.println("door no : "+customer.getAddress().getDoorno());
		System.out.println("street : "+customer.getAddress().getStreet());
		System.out.println("Area : "+customer.getAddress().getArea());
		System.out.println("city : "+customer.getAddress().getCity());
		System.out.println("State : "+customer.getAddress().getState());
		
	}

}
