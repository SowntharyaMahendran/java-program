package com.tcs.student;

import java.util.Scanner;

public class StudentMain {
	public static void main(String[] args) {
		Scanner scan=new Scanner(System.in);
		Student stud=new Student();
		boolean valid;
		System.out.println("Student information system");
	    System.out.println("enter student id");
	    stud.setId(scan.nextInt());
	    
	    System.out.println("enter student name"); 
	    stud.setName(scan.next());
	    
	    System.out.println("enter maths mark");
	    stud.setMathsmark(scan.nextInt());
	    
	    System.out.println("enter english mark");
	    stud.setEnglishmark(scan.nextInt());
	    
	    System.out.println("enter science mark");
	    stud.setSciencemark(scan.nextInt());
	    
	    System.out.println("do you want report?");
	    String status=scan.next();
//	    System.out.println("Do you want to continue for next Student?");
//	    if(status.equals("yes"))
//	    {
//	    	valid=true;
//	    
//	    }else{
//	    	valid=false;
//	    	System.out.println("thank you");
//	    }
//	
//	    do{
        double mark=scan.nextDouble();
         String finalmark=stud.totalmarks(mark);
         int total=scan.nextInt();
         String finalaverage=stud.Average(mark);
//         if(status.equals("yes"))
//         {
//        	 valid=true;
//        	 
//         }else{
//        	 valid=false;
//        	 
//         }
//	    }while(valid);

		
	
	}

}
