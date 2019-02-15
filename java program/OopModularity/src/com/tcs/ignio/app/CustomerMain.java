package com.tcs.ignio.app;

import com.tcs.ignio.acc.Customer;
import com.tcs.ignio.shared.Message;
import com.tcs.ignio.shared.Utility;

public class CustomerMain {
public static void main(String[] args){
	System.out.println(Message.INFO);
	Customer o1=new Customer();
	o1.setId(1);
	o1.setName("A");
	System.out.println(Utility.sayHello() + "" + o1.getName());
	
	Customer o2=new Customer();
	System.out.println(o2.getId());
    System.out.println("Random");
}
}
