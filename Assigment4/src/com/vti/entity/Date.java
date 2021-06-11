package com.vti.entity;

public class Date {
	int Day;
	int Month;
	int Year;
	
	public Date() {
		super();
		
	}
	
	public Date(int day, int month, int year) {
		super();
		Day = day;
		Month = month;
		Year = year;
	}

	
	public int getDay() {
		return Day;
	}

	
	public void setDay(int day) {
		Day = day;
	}

	
	public int getMonth() {
		return Month;
	}

	
	public void setMonth(int month) {
		Month = month;
	}

	
	public int getYear() {
		return Year;
	}

	
	public void setYear(int year) {
		Year = year;
	}

	@Override
	public String toString() {
		return "Date [Day=" + Day + ", Month=" + Month + ", Year=" + Year + "]";
	}
	
	

}
