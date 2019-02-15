package com.tcs.ignio.json;

import com.google.gson.Gson;

public class Jsonproject {

	Address address=new Address;
	Customer customer=new customer(1,"sowntharya",address);
	
	
	Gson parser=new Gson();
	
	String json=parser.toJson(customer);
	System.out.println(json);
	Customer cust=parser.fromJson(json, Customer.class);
	System.out.println(cust.getName());
	