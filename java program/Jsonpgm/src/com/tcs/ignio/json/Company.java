package com.tcs.ignio.json;

public class Company {
	private String name;
	private String bs;
	private String catchpharse;
	
	// default constructor
	public Company()
	{
		this.name="";
		this.bs="";
		this.catchpharse="";
		
	}
	//para constructor

	public Company(String name, String bs, String catchpharse,
			String companyname) 
	{
	
		this.name = name;
		this.bs = bs;
		this.catchpharse = catchpharse;
		this.companyname = companyname;
	}

	//setter and getter
	
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getBs() {
		return bs;
	}

	public void setBs(String bs) {
		this.bs = bs;
	}

	public String getCatchpharse() {
		return catchpharse;
	}

	public void setCatchpharse(String catchpharse) {
		this.catchpharse = catchpharse;
	}

		
	

}
