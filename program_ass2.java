import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.time.LocalDate;
import java.util.Date;
import java.util.Locale;
import java.util.Random;
import java.util.Scanner;

public class program_ass2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Department dep1 = new Department();
		dep1.id = 1;
		dep1.name = "Marketing";

		Department dep2 = new Department();
		dep2.id = 2;
		dep2.name = "Sale";

		Department dep3 = new Department();
		dep3.id = 3;
		dep3.name = "Kinh Doanh";

// 			insert Position

		Position pos1 = new Position();
		pos1.id = 1;
		pos1.name = PositionName.Dev;

		Position pos2 = new Position();
		pos2.id = 2;
		pos2.name = PositionName.PM;

		Position pos3 = new Position();
		pos3.id = 3;
		pos3.name = PositionName.Scrum_Master;
		
		Position pos4 = new Position();
		pos4.id = 4;
		pos4.name = PositionName.Test;


//				insert Account
		Account acc1 = new Account();
		acc1.id = 1;
		acc1.Email = "chucvm";
		acc1.userName = "chucvm";
		acc1.fullName = "Chuc Vu";
		acc1.department = dep1;
		acc1.position = pos1;
		acc1.CreateDate = new Date();
		
		Account acc2 = new Account();
		acc2.id = 2;
		acc2.Email = "chucvm2";
		acc2.userName = "chucvm2";
		acc2.fullName = "Chuc Vu2";
		acc2.department = dep1;
		acc2.position = pos1;
		acc2.CreateDate = new Date();
		
		Account acc3 = new Account();
		acc3.id = 3;
		acc3.Email = "chucvm3";
		acc3.userName = "chucvm3";
		acc3.fullName = "Chuc Vu3";
		acc3.department = dep1;
		acc3.position = pos1;
		acc3.CreateDate = new Date();
		
		

		System.out.println(acc1.toString());
//		quession1
		if (acc1.department == null) {
			System.out.println("Ban Khong Co Phong Ban Nao"	);
		}
		else	{
			System.out.println(acc1.department.name);
				
		}
//		 ques2
		
		if (acc1.groups == null) {
			System.out.println("nhan vien nay chua co group"	);
			}else if(acc1.groups.length == 1	) {
			System.out.println(acc1.groups[0].name);
			}else if(acc1.groups.length == 2	) {
				System.out.println(acc1.groups[0].name);
				System.out.println(acc1.groups[1].name);
			}else if(acc1.groups.length == 3	) {
				System.out.println("nhan vien nay la nguoi quan trong,yham gia nhieu goup"	);	
			}else if(acc1.groups.length >= 4	) {
				System.out.println("nhan vien nay la nguoi nhieu chuyen,co mat o nhieu group"	);		
			}
//		ques4
		System.out.println(acc1.position != null
					&& acc1.position.name == PositionName.Dev 
					?"day la developer"
					:"nguoi nay khong phai la developer");
		
//		ques8
		
		Account [] dsAccount = new Account[] {acc1 ,acc2  , acc1};
		for	(Account account : dsAccount) {
			System.out.println("Email:"+ account.Email);
			System.out.println("Fullname:"+ account.fullName);
			System.out.println(account.department == null
						?"khong thuoc phong ban nao"
						:"phon ban + account.department.name"	);	
		}
		
		
		
//		qess10
		
		for(int i = 0 ; i < dsAccount.length;i++){
			System.out.println("Th??ng tin account th??? "+(i+1)+" l??:");
			System.out.println("Email: " + dsAccount[i].Email);
			System.out.println("Fullname: " + dsAccount[i].fullName);
			System.out.println("Department: " + dsAccount[i].department.name);
		}
		
//		quess11
		Department[] dsDepartment = new Department[] { dep1, dep2,  };
		for (int i = 0; i < dsDepartment.length; i++) {
		System.out.println("Th??ng tin department th??? " + (i + 1) + " l?? :");
		System.out.println("Id: " + dsDepartment[i].id);
		System.out.println("Name: " + dsDepartment[i].name);
		}
		
//		qess13
		
		Account[] dsAccount2 = new Account[] { acc1, acc2, acc3 };
		for (int i = 0; i < dsAccount.length; i++) {
		if (i != 1) {
		System.out.println("Th??ng tin account th??? " + (i + 1)
		+ " l??:");
		System.out.println("Email: " + dsAccount2[i].Email);
		System.out.println("Full name: " +
				dsAccount2[i].fullName);
		System.out.println("Ph??ng ban: " +
				dsAccount2[i].department.name);
		}
		}
		
//		qs14
		
		Account[] dsAccount3 = new Account[] { acc1, acc2, acc3 };
		for (int j = 0; j < dsAccount3.length; j++) {
				System.out.println("Th??ng tin account th??? " + (j + 1)
		+ " l??:");
		System.out.println("Email: " + dsAccount3[j].Email);
		System.out.println("Full name: " +
				dsAccount3[j].fullName);
		System.out.println("Ph??ng ban: " +
				dsAccount3[j].department.name);
		}
		
//		qss15
		for (int i = 1; i <= 20; i++) {
			if (i%2 ==0 ) {
			System.out.print(i+ " ");
			}
			}
	
//		qss16-11
		
		Department[] dsDepartment5 = new Department[] { dep1, dep2,  };
		int i = 0; 
		while (i < dsDepartment5.length) {
		System.out.println("Th??ng tin department th??? " + (i + 1) + " l?? :");
		System.out.println("Id: " + dsDepartment5[i].id);
		System.out.println("Name: " + dsDepartment5[i].name);
		i++;
		}
		
//		qss16-12
		Department[] dsDepartment6 = new Department[]  { dep1, dep2, dep3 };
		int i1 = 0;
		while (i1 < 2) {
		System.out.println("Th??ng tin department th??? " + (i1 + 1) +
		" l??:");
		System.out.println("Id: " + dsDepartment6[i1].id);
		System.out.println("Name: " + dsDepartment6[i1].name);
		i1++;
		}
		
//		Qss16-13
		
		Account[] dsAccount5 = new Account[] { acc1, acc2, acc3 };
		int i2 = 0;
		while (i2 < dsAccount5.length) {
		if (i2 != 1) {
		System.out.println("Th??ng tin account th??? " + (i2 +
		1) + " l??:");
		System.out.println("Email: " + dsAccount5[i2].Email);
		System.out.println("Full name: " +
				dsAccount5[i2].fullName);
		System.out.println("Ph??ng ban: " +
				dsAccount5[i2].department.name);
		}
		i2++;
		}
		
//		Qss16-10
		
		Account[] dsAccount6 = new Account[] { acc1, acc2, acc3 };
		int j = 0;
		while (j < dsAccount6.length) {
		System.out.println("Th??ng tin account th??? " + (j + 1) + " l??:");
		System.out.println("Email: " + dsAccount6[j].Email);
		System.out.println("Full name: " + dsAccount6[j].fullName);
		System.out.println("Ph??ng ban: " +
				dsAccount6[j].department.name);
		j++;
		}
		
//		 DO WHILE
		
//		Qss17-10
		
		Account[] dsAccount7 = new Account[] { acc1, acc2, acc3 };
		int b = 0;
		do {
		System.out.println("Th??ng tin account th??? " + (b + 1) + " l??:");
		System.out.println("Email: " + dsAccount7[b].Email);
		System.out.println("Full name: " + dsAccount7[b].fullName);
		System.out.println("Ph??ng ban: " +
				dsAccount7[b].department.name);
		b++;
		}while (b < dsAccount7.length);
		
//		Qss17-11
		
		Department[] dsDepartment8 = new Department[] { dep1, dep2,  };
		int a = 0; 
		do {
		System.out.println("Th??ng tin department th??? " + (a + 1) + " l?? :");
		System.out.println("Id: " + dsDepartment8[a].id);
		System.out.println("Name: " + dsDepartment8[a].name);
		a++;
		}while (a < dsDepartment8.length);
		
//		Qss17-12
		
		Department[] dsDepartment9 = new Department[]  { dep1, dep2, dep3 };
		int x1 = 0;
		do {
		System.out.println("Th??ng tin department th??? " + (x1 + 1) +
		" l??:");
		System.out.println("Id: " + dsDepartment9[x1].id);
		System.out.println("Name: " + dsDepartment9[x1].name);
		x1++;
		}while (x1 < 2);
		
//					---Exercise2---

//      QSS1

int i3 = 5;
System.out.printf("%d%n", i3);
System.out.printf("%d%n", i3);

//		Qss2

int i4 = 100000000;
System.out.printf(Locale.US, "%,d%n", i4);

//		Qss3

float c = 5.567098f;
System.out.printf("'%5.4f'%n", c);

//		Qss4

String x = "Nguy???n V??n A";
System.out.printf("T??n t??i l?? \"" + x + "\" v?? t??i ??ang ?????c th??n \n");

//		Qss5

String pattern = "dd/MM/yyyy HH:mm:ss";
SimpleDateFormat simpleDateFormat = new SimpleDateFormat(pattern);
String date = simpleDateFormat.format(new Date());
System.out.println(date);

//					---EXERCISE3---

//		insert EXAM
		Exam ex1 = new Exam();
		ex1.id = 1;
		ex1.code = "ma1"	;
		ex1.title = "JAVA";
		ex1.duration = 60;
		ex1.createDate = new Date ();
		
//		Qss2
		
		String patterns = "yyyy-MM-dd-HH-mm-ss";
		SimpleDateFormat simpleDateFormat1 = new SimpleDateFormat(patterns);
		Exam[] exams = { ex1, };
		for (Exam exam : exams) {
		date = simpleDateFormat1.format(exam.createDate);
		System.out.println(exam.code + ": " + date);
		}
		
//		QSS3
		String pattern1 = "yyyy";
		simpleDateFormat = new SimpleDateFormat(pattern1);
		for (Exam exam : exams) {
		date = simpleDateFormat.format(exam.createDate);
		System.out.println(exam.code + ": " + date);
		}
		
//		QSS4
		
		String pattern2 = "yyyy-MM";
		simpleDateFormat = new SimpleDateFormat(pattern2);
		for (Exam exam : exams) {
		date = simpleDateFormat.format(exam.createDate);
		}
		
//		QSS5
		
		String pattern3 = "MM-dd";
		simpleDateFormat = new SimpleDateFormat(pattern3);
		for (Exam exam : exams) {
		date = simpleDateFormat.format(exam.createDate);
		System.out.println(exam.code + ": " + date);
		}
		
//		Exercise4
//		Qs1
		
		Random random = new Random();
		int n = random.nextInt();
		System.out.println("S??? ng???u nhi??n: " + n);
		
//		QSS2
		
		float f = random.nextFloat();
		System.out.println("S??? ng???u nhi??n: " + f);
		
//		QSS3:Khai b??o 1 array bao g???m c??c t??n c???a c??c b???n trong l???p, sau ???? in ng???u nhi??n
//		ra t??n c???a 1 b???n
		
		String[] dsName = { "Chuc", "Hue", "Tuan", "Son", "Linh" };
		int X = random.nextInt(dsName.length);
		System.out.println("T??n ng???u nhi??n 1 b???n trong l???p: " +
				dsName[X]);
		
//		Qss4:L???y ng???u nhi??n 1 ng??y trong kho???ng th???i gian 24-07-1995 t???i ng??y 20-12-
//		1995
		int minDay = (int) LocalDate.of(1995, 7, 24).toEpochDay(); 
		int maxDay = (int) LocalDate.of(1995, 12, 20).toEpochDay(); 
		long RandomInt = minDay + random.nextInt(maxDay - minDay);
		LocalDate randomDay = LocalDate.ofEpochDay(RandomInt);
		System.out.println(randomDay);
		
//		QSS5:L???y ng???u nhi??n 1 ng??y trong kho???ng th???i gian 1 n??m tr??? l???i ????y

		int now = (int) LocalDate.now().toEpochDay();
		int randomDate = now - random.nextInt(365);
		LocalDate reusultDate = LocalDate.ofEpochDay(randomDate);
		System.out.println("Ng??y ng???u nhi??n l??: " + reusultDate);
		
//		QSS6:L???y ng???u nhi??n 1 ng??y trong qu?? kh???
		
		int maxDay1 = (int) LocalDate.now().toEpochDay();
		long randomDay1 = random.nextInt(maxDay1);
		LocalDate resultDate1 = LocalDate.ofEpochDay(randomDay1);
		System.out.println("1 Ng??y ng???u nhi??n trong qu?? kh???: " + resultDate1);
		
//		Question 7:L???y ng???u nhi??n 1 s??? c?? 3 ch??? s???
		
		int z = random.nextInt(999 - 100 + 1) + 100; 
		System.out.println(z);
		
//		Exercise 5: Input from console
		
//		Question 5:
//		Vi???t l???nh cho ph??p ng?????i d??ng t???o account (vi???t th??nh method)
//		?????i v???i property Position, Ng?????i d??ng nh???p v??o 1 2 3 4 v?? v??o
//		ch????ng tr??nh s??? chuy???n th??nh Position.Dev, Position.Test,
//		Position.ScrumMaster, Position.PM
		
		 Scanner scanner = new Scanner(System.in);
		 Account account = new Account();
		 System.out.println("M???i b???n nh???p v??o t??n ng?????i d??ng:");
		 acc1.fullName = scanner.nextLine();
		 System.out.println("M???i b???n nh???p v??o email ng?????i d??ng:");
		 acc1.Email = scanner.nextLine();
		 System.out.println("Ng?????i d??ng nh???p v??o 1 2 3 4"
		 + " v??o ch????ng tr??nh s??? chuy???n th??nh "
		 + "Position.Dev, PositionName.Test,Position.ScrumMaster, Position.PM:");
		 Position pos5 = new Position();
		 pos5.id =1;
		 String position = scanner.nextLine();
		 if(position.equals("1")){ 
		 pos5.name = "Dev";
		 }else if(position.equals("2")){ 
		 pos5.name = "Test";
		 }else if(position.equals("3")){ 
		 pos5.name = "ScrumMaster";
		 }else if(position.equals("4")){ 
		 pos5.name = "PM";
		 }else{
		 pos5.name = "Ph??ng ch???";
		 } 
		 acc1.position = pos1;
		 System.out.println(acc1.toString());
		 

			
		}
		
	}





