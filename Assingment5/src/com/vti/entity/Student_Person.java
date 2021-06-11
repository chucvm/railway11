package com.vti.entity;

import java.util.Scanner;

public class Student_Person extends Person {
	private int id;
	private Float gradeAvg;
	private String email;
	
	@Override
	public void inputInfo() {
	Scanner sc = new Scanner(System.in);
	super.inputInfo();
	System.out.println("ID: ");
	this.id = sc.nextInt();
	System.out.println("GradeAvg: ");
	this.gradeAvg = sc.nextFloat();
	System.out.println("email: ");
	this.email = sc.next();
	}

	@Override
	public String toString() {
		return "Student_Person [id=" + id + ", gradeAvg=" + gradeAvg + ", email=" + email + "]";
	}
	public boolean Scholarship() {
		return gradeAvg > 8.0 ? true : false;
		}

	public char[] showInfo() {
		// TODO Auto-generated method stub
		return null;
	}
}
