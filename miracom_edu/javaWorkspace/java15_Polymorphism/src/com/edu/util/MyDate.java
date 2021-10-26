package com.edu.util;

public class MyDate {
	private int year;
	private int month;
	private int day;
	
	public MyDate(int year, int month, int day) {
		super();
		this.year = year;
		this.month = month;
		this.day = day;
	}
	
/*	public String getDate() {
		return year+"-"+month+"-"+day;
	}
*/	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return year+"-"+month+"-"+day;
	}

}
