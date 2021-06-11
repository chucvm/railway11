package com.vti.entity;

import java.time.LocalDate;
import java.util.Scanner;

public class Person {
	public String name;
	public Gender gender;
	public LocalDate birthDate;
	public String address;
	public enum Gender {
	MALE, FEMALE, UNKNOWN;
	}
	
	public Person() {
		super();
		
	}
	
	public Person(String name, Gender gender, LocalDate birthDate, String address) {
		super();
		this.name = name;
		this.gender = gender;
		this.birthDate = birthDate;
		this.address = address;
	}
	public void inputInfo() {
		Scanner sc = new Scanner(System.in);
		System.out.println("Nhập thông tin Person từ bàn phím: ");
		System.out.println("Name: ");
		this.name = sc.next();System.out.println("Gender 1.Male, 2.Female, 3.Unknown: ");
		int flagGender = sc.nextInt();
		switch (flagGender) {
		case 1:
		this.gender = Gender.MALE;
		break;
		case 2:
		this.gender = Gender.FEMALE;
		break;
		case 3:
		this.gender = Gender.UNKNOWN;
		break;
		}
		System.out.println("BirthDate nhập theo định dạng yyyy-MM-dd: ");
		this.birthDate = LocalDate.parse(sc.next());
		System.out.println("Address: ");
		this.address = sc.next();
		}

	@Override
	public String toString() {
		return "Person [name=" + name + ", gender=" + gender + ", birthDate=" + birthDate + ", address=" + address
				+ "]";
	}

	public char[] showInfo() {
		
		return null;
	}

	public char[] showInfo() {
		// TODO Auto-generated method stub
		return null;
	}
	
	
}
