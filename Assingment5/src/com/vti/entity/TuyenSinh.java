package com.vti.entity;

import java.util.ArrayList;
import java.util.Scanner;

public class TuyenSinh implements ITuyenSinh {
	public ArrayList<ThongtinTS> listThongTinTS;
	public Scanner sc;
	public TuyenSinh() {
	listThongTinTS = new ArrayList<ThongtinTS>();
	sc = new Scanner(System.in);
	}
	@Override
	public void addThiSinh() {
		System.out.println("Nhập vào tên thí sinh:");
		String name = sc.next();
		System.out.println("Nhập vào địa chỉ thí sinh:");
		String address = sc.next();
		System.out.println("Nhập vào mức ưu tiên thí sinh:");
		int priority = sc.nextInt();
		System.out.println("Nhập vào khối thí sinh chọn các khối A, B, C:");
		String block = sc.next();
		ThongtinTS ThongTinTS = new ThongtinTS(priority, name, address, priority,new KhoiThi(block));
		listThongTinTS.add(ThongTinTS);
		}

		
	
	@Override
	public void showInfoThongTinTS() {
		for (ThongtinTS ThongTinTS : listThongTinTS) {
			System.out.println(ThongTinTS);
			}
				
		
	}
	@Override
	public void findByIdNum(int id) {
			for (ThongtinTS ThongTinTS : listThongTinTS) {
			if (ThongTinTS.getIdNum() == id) {
			System.out.println(ThongTinTS);
			}
			}
			}
		
	
	
		

	
	
		
}
