package com.vti.backend;

import java.util.Iterator;

import com.vti.entity.Student;

public class Exercise2 {
	public void question1() {
//		a)Tao 10 hoc sinh, chia thanh 3 nhom
		
		Student [] dsStudents = new Student[10];
		for (int i = 0; i < dsStudents.length; i++) {
			dsStudents[i] = new Student(i+1,"Nguyen van A"+(i+1), i%3 + 1);
			System.out.println(dsStudents[i]);
		}
//		b)keu goi ca lop diem danh 
		for (int i = 0; i < dsStudents.length; i++) {
			dsStudents[i].diemDanh();
	}
//		c) goi nhom 1 di hoc bai
		for (int i = 0; i < dsStudents.length; i++) {
			if (dsStudents[i].group == 1)dsStudents[i].hocBai();
	}
//		d)goi nhom 2 don ve sinh
		for (int i = 0; i < dsStudents.length; i++) {
			if (dsStudents[i].group == 2)dsStudents[i].donVeSinh();
	}

	}

}
