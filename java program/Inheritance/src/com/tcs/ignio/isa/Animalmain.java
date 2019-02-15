package com.tcs.ignio.isa;

public class Animalmain {
	public static void main(String[] args){
		Tiger tiger=new Tiger();
		System.out.println(tiger.eat());
	
		Animal animal=new Tiger();
		System.out.println(animal.eat());
	}

}
