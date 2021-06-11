package com.vti.backend;

import java.util.Scanner;

import com.vti.entity.Person;
import com.vti.entity.Student_Person;

public class Exercise2_QS2 {
	public Scanner sc;
	public Exercise2_QS2() {
	super();
	sc = new Scanner(System.in);
	}
	public void question2() {
	while (true) {
		int menuChoose = sc.nextInt();
		switch (menuChoose) {
		case 1:
		demoPerson();
		break;
		case 2:
		demoStudent();
		break;
		case 3:
		return;
		default:
		System.out.println("Alarm: Lựa chọn đúng số trên menu");
		break;
		}
		}
		}
		public void demoStudent() {
		Student_Person st = new Student_Person();
		st.inputInfo();
		System.out.println("Thông tin Student vừa nhập vào: ");
		System.out.println(st.showInfo());
		if (st.Scholarship()) {
		System.out.println("Sinh viên này đạt học bổng");
		}else {
		System.out.println("Sinh viên này không đạt học bổng");
		}
		}
		public void demoPerson() {
		Person person = new Person();
		person.inputInfo();
		System.out.println("Thông tin person vừa nhập vào: ");
		System.out.println(person.showInfo());
		}

	
}
