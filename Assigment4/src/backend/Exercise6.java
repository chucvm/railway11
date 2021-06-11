package backend;

import java.util.Scanner;

import com.vti.entity.VietnamesePhone;

public class Exercise6 {
	Scanner sc;

	public Exercise6() {
		sc = new Scanner(System.in);
		}
		public void question1() {
		loadmenuAbstract();
		}
		private void loadmenuAbstract() {
		VietnamesePhone vnPhone = new VietnamesePhone();
		while (true) {
			int menuChoose = sc.nextInt();
			switch (menuChoose) {
			case 1:
			System.out.println("Nhập vào tên Contact: ");
			String name = sc.next();
			System.out.println("Nhập vào tên số Phone: ");
			String phone = sc.next();
			vnPhone.insertContact(name, phone);
			break;
			case 2:
			System.out.println("Nhập vào tên Contact cần remove:");
			String removeName = sc.next();
			vnPhone.removeContact(removeName);
			break;
			case 3:
			System.out.println("Nhập tên cần Update: ");
			String name1 = sc.next();
			System.out.println("Nhập số Phone mới: ");
			String newPhone = sc.next();
			vnPhone.updateContact(name1, newPhone);
			System.out.println("Kết quả: ");
			vnPhone.searchContact(name1);
			break;
			case 4:
			System.out.println("Nhập vào tên Contact cần tìm kiếm: ");String searchName = sc.next();
			vnPhone.searchContact(searchName);
			break;
			case 5:
			vnPhone.printContact();
			break;
			case 6:
			return;
			default:
			System.out.println("Alarm: Lựa chọn đúng số trên menu");
			break;
			}
			}
		}
		
}
