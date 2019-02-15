package com.tcs.ignio.mainapp;

public class FactoryMain {
	public static void main(String[] args){
		Factory f=new Factory.getInstance();
		System.out.println(f.sayhello());
		JSONBuilder builder=JSONBuilder.build();
		System.out.println(buileder.parse());


}
