package com.tcs.student;

public class Student {
	private int Id;
	private String name;
	private int mathsmark;
	private int englishmark;
	private int sciencemark;
	double total;
	double avg;
public Student() {
	
}
public Student(int id, String name, int mathsmark, int englishmark,
		int sciencemark) {
	super();
	Id = id;
	this.name = name;
	this.mathsmark = mathsmark;
	this.englishmark = englishmark;
	this.sciencemark = sciencemark;
	
	
	
}

//setter and getter
public int getId() {
	return Id;
}
public void setId(int id) {
	Id = id;
}
public String getName() {
	return name;
}
public void setName(String name) {
	this.name = name;
}
public int getMathsmark() {
	return mathsmark;
}
public void setMathsmark(int mathsmark) {
	this.mathsmark = mathsmark;
}
public int getEnglishmark() {
	return englishmark;
}
public void setEnglishmark(int englishmark) {
	this.englishmark = englishmark;
}
public int getSciencemark() {
	return sciencemark;
}
public void setSciencemark(int sciencemark) {
	this.sciencemark = sciencemark;
}

//method--totalmark
public String totalmarks(double mark)
{
	total=mathsmark+englishmark+sciencemark;
	return "the total mark is "+total;
}

//method-- average
public String Average(double mark)
{
     avg=(mathsmark+englishmark+sciencemark)/3;
     return "the average is "+avg;
}
}
