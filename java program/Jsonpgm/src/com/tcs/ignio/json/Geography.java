package com.tcs.ignio.json;

public class Geography {
	private double lat;
	private double longi;
	
	//default constructor
	public Geography()
	{
		this.lat='0';
        this.longi='0';
	}
	//para constructor
       public Geography(double lat, double longi) 
    {
		
		this.lat = lat;
		this.longi = longi;
	}
       
       //setter and getter
	public double getLat() {
		return lat;
	}
	public void setLat(double lat) {
		this.lat = lat;
	}
	public double getLongi() {
		return longi;
	}
	public void setLongi(double longi) {
		this.longi = longi;
	}
	
	
	

}
