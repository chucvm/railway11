package backend;

import java.util.ArrayList;
import java.util.Scanner;

import com.vti.entity.HighSchoolStudent;
import com.vti.entity.LoaiSach;
import com.vti.entity.NgayPhatHanh;
import com.vti.entity.Tailieu;
import com.vti.entity.TapChi;

public class Exercise5 {

	public void Question3 () {
		
			HighSchoolStudent highSchoolStudent1 = new HighSchoolStudent (1, "chuyen van", null, null);
			System.out.println(highSchoolStudent1);
			
	}
	
	public void Question4 () {
		public static int ID = 0;
		public ArrayList<Tailieu> TailieuList;
		public Scanner sc;
		public void Exercise5_Ques4() {
		sc = new Scanner(System.in);
		TailieuList = new ArrayList<Tailieu>();
		}
		public void question4() {
		loadMenu();
		}
		public void loadMenu() {
		while (true) {
			int menuChoose = sc.nextInt();
			switch (menuChoose) {
			case 1:
			addTailieu();
			break;
			case 2:
			delTailieu();
			break;
			case 3:
			printListTailieu();
			break;
			case 4:
			findByLoaiSach();
			break;
			case 5:
			return;
			
			System.out.println("Alarm: Lựa chọn đúng số trên menu");
			break;
			}
			}
		}
		private void addTailieu() {
			// TODO Auto-generated method stub
			
		}

		public  void findByLoaiSach() {
			System.out.println("Nhập vào loại tài liệu cần tìm kiếm 1.Sách,2.Báo, 3.Tạp chí: ");
			int chooseLoaiSach = sc.nextInt();
			switch (chooseLoaiSach) {
			case 1:
			for (Tailieu tailieu : TailieuList) {
			if (tailieu instanceof LoaiSach) {
			System.out.println(tailieu);
			}
			}
			break;
			case 2:
			for (Tailieu tailieu : TailieuList) {
			if (tailieu instanceof NgayPhatHanh) {System.out.println(tailieu);
			}
			}
			break;
			case 3:
			for (Tailieu document : TailieuList) {
			if (document instanceof TapChi) {
			System.out.println(document);
			}
			}
			break;
			default:
			System.out.println("Nhập không đúng.!!");
			break;
			}
			}
			private  void printListTailieu() {
			for (Tailieu tailieu : TailieuList) {
			System.out.println(tailieu);
			}
			}
			
			private  void delTailieu() {
			System.out.println("Nhập vào mã tài liệu muốn xóa: ");
			int idDel = sc.nextInt();
			Boolean flagCheckExists = false;
			for (Tailieu tailieu : TailieuList) {
			if (tailieu.getId() == idDel) {
			flagCheckExists = true;
			}
			}
			if (flagCheckExists) {
			TailieuList.removeIf(doc -> doc.getId() == idDel);
			for (Tailieu tailieu : TailieuList) {
			System.out.println("Xóa tài liệu thành công, danh sách tài liệu còn lại:");
			System.out.println(document);
			}
			} else {
			System.out.println("Mã tài liệu bạn nhập không có trên hệ thống.");
			}
			}
			private void addTailieu() {
				int choose1 = sc.nextInt();
				switch (choose1) {
				case 1:
				System.out.println("Nhập vào tên nhà xuất bản: ");
				String publisher = sc.next();
				System.out.println("Nhập vào số bản phát hành: ");
				int numRelease = sc.nextInt();
				System.out.println("Nhập vào tên tác giả: ");
				String authorName = sc.next();
				System.out.println("Nhập vào số trang: ");
				int numPage = sc.nextInt();
				ID++;
				Document book = new Book(ID, publisher, numRelease,
				authorName, numPage);
				documentList.add(book);
				break;
				case 2:
				System.out.println("Nhập vào tên nhà xuất bản: ");
				String publisherArticle = sc.next();
				System.out.println("Nhập vào số bản phát hành: ");
				int numReleaseArticle = sc.nextInt();
				System.out.println("Nhập vào ngày phát hành: ");
				int day = sc.nextInt();
				System.out.println("Nhập vào tháng phát hành: ");
				int month = sc.nextInt();
				System.out.println("Nhập vào năm phát hành: ");
				int year = sc.nextInt();
				LocalDate dayReleaseArticle = LocalDate.of(year, month,
				day);
				ID++;
				Document artice = new Article(ID, publisherArticle,
				numReleaseArticle, dayReleaseArticle);
				documentList.add(artice);
				break;
				case 3:
				System.out.println("Nhập vào tên nhà xuất bản: ");
				String publisherMagazine = sc.next();
				System.out.println("Nhập vào số bản phát hành: ");
				int numReleaseMagazine = sc.nextInt();
				System.out.println("Nhập vào số phát hành: ");
				int idReleaseMagazine = sc.nextInt();
				System.out.println("Nhập vào ngày phát hành: ");
				int day1 = sc.nextInt();
				System.out.println("Nhập vào tháng phát hành: ");
				int month1 = sc.nextInt();
				System.out.println("Nhập vào năm phát hành: ");
				int year1 = sc.nextInt();
				LocalDate monthReleaseMagazine = LocalDate.of(year1, month1,
				day1);
				ID++;
				Document magazine = new Magazine(ID, publisherMagazine,
				numReleaseMagazine, idReleaseMagazine,
				monthReleaseMagazine);
				documentList.add(magazine);
				break;default:
				break;
			}
			}
		
	
}
