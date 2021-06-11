package com.vti.backend;

import java.util.Scanner;

import com.vti.entity.TuyenSinh;

public class Exercise1_QS2 {
	private TuyenSinh tuyenSinh;
	private Scanner sc;
	public Exercise1_QS2() {
	sc = new Scanner(System.in);
	tuyenSinh = new TuyenSinh();
	}
	public void question2() {
		loadMenu();
		}
		private void loadMenu() {
		while (true) {
			int menuChoose = sc.nextInt();
			switch (menuChoose) {
			case 1:
			tuyenSinh.addThiSinh();
			break;
			case 2:
			tuyenSinh.showInfoThongTinTS();
			break;
			case 3:
			System.out.println("Nhập vào ID cần tìm kiếm: ");
			int id = sc.nextInt();
			tuyenSinh.findByIdNum(id);
			break;
			case 4:
			return;
			default:System.out.println("Alarm: Lựa chọn đúng số trên menu");
			break;
			}
			}
			
			
		}
}
