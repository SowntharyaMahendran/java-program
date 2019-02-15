package com.tcs.ignio.array;

public class SimpleArray {
	public static void main(String[]args){
		int[] scores=new int[5];
		scores[0]=66;
		scores[1]=84;
		scores[2]=97;
		scores[3]=95;
	    scores[4]=78;
	    int size =scores.length;
	    System.out.println("size of the array : "+ size);
	    System.out.println(scores[0]);
	    System.out.println(scores[1]);
	    System.out.println(scores[2]);
	    System.out.println(scores[3]);
	    System.out.println(scores[4]);
	    
	    
	    //using loop get the value
	    for(int i=0;i<size;i++)
	    {
	    	System.out.println(scores[i]);
	    }
	    
	    //syntax 2
	    double price[]={45,55,24,56,14,88};
	    int priceSize= prices.length;
	    System.out.println(priceSize);
	    System.out.println("Prices....");
	    for(int i=0;i<priceSize;i++){
	    	System.out.println(price[i]);
	    }
	}

}
