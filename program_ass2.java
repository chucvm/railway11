import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Locale;

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
			System.out.println("Thông tin account thứ "+(i+1)+" là:");
			System.out.println("Email: " + dsAccount[i].Email);
			System.out.println("Fullname: " + dsAccount[i].fullName);
			System.out.println("Department: " + dsAccount[i].department.name);
		}
		
//		quess11
		Department[] dsDepartment = new Department[] { dep1, dep2,  };
		for (int i = 0; i < dsDepartment.length; i++) {
		System.out.println("Thông tin department thứ " + (i + 1) + " là :");
		System.out.println("Id: " + dsDepartment[i].id);
		System.out.println("Name: " + dsDepartment[i].name);
		}
		
//		qess13
		
		Account[] dsAccount2 = new Account[] { acc1, acc2, acc3 };
		for (int i = 0; i < dsAccount.length; i++) {
		if (i != 1) {
		System.out.println("Thông tin account thứ " + (i + 1)
		+ " là:");
		System.out.println("Email: " + dsAccount2[i].Email);
		System.out.println("Full name: " +
				dsAccount2[i].fullName);
		System.out.println("Phòng ban: " +
				dsAccount2[i].department.name);
		}
		}
		
//		qs14
		
		Account[] dsAccount3 = new Account[] { acc1, acc2, acc3 };
		for (int j = 0; j < dsAccount3.length; j++) {
				System.out.println("Thông tin account thứ " + (j + 1)
		+ " là:");
		System.out.println("Email: " + dsAccount3[j].Email);
		System.out.println("Full name: " +
				dsAccount3[j].fullName);
		System.out.println("Phòng ban: " +
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
		System.out.println("Thông tin department thứ " + (i + 1) + " là :");
		System.out.println("Id: " + dsDepartment5[i].id);
		System.out.println("Name: " + dsDepartment5[i].name);
		i++;
		}
		
//		qss16-12
		Department[] dsDepartment6 = new Department[]  { dep1, dep2, dep3 };
		int i1 = 0;
		while (i1 < 2) {
		System.out.println("Thông tin department thứ " + (i1 + 1) +
		" là:");
		System.out.println("Id: " + dsDepartment6[i1].id);
		System.out.println("Name: " + dsDepartment6[i1].name);
		i1++;
		}
		
//		Qss16-13
		
		Account[] dsAccount5 = new Account[] { acc1, acc2, acc3 };
		int i2 = 0;
		while (i2 < dsAccount5.length) {
		if (i2 != 1) {
		System.out.println("Thông tin account thứ " + (i2 +
		1) + " là:");
		System.out.println("Email: " + dsAccount5[i2].Email);
		System.out.println("Full name: " +
				dsAccount5[i2].fullName);
		System.out.println("Phòng ban: " +
				dsAccount5[i2].department.name);
		}
		i2++;
		}
		
//		Qss16-10
		
		Account[] dsAccount6 = new Account[] { acc1, acc2, acc3 };
		int j = 0;
		while (j < dsAccount6.length) {
		System.out.println("Thông tin account thứ " + (j + 1) + " là:");
		System.out.println("Email: " + dsAccount6[j].Email);
		System.out.println("Full name: " + dsAccount6[j].fullName);
		System.out.println("Phòng ban: " +
				dsAccount6[j].department.name);
		j++;
		}
		
//		 DO WHILE
		
//		Qss17-10
		
		Account[] dsAccount7 = new Account[] { acc1, acc2, acc3 };
		int b = 0;
		do {
		System.out.println("Thông tin account thứ " + (b + 1) + " là:");
		System.out.println("Email: " + dsAccount7[b].Email);
		System.out.println("Full name: " + dsAccount7[b].fullName);
		System.out.println("Phòng ban: " +
				dsAccount7[b].department.name);
		b++;
		}while (b < dsAccount7.length);
		
//		Qss17-11
		
		Department[] dsDepartment8 = new Department[] { dep1, dep2,  };
		int a = 0; 
		do {
		System.out.println("Thông tin department thứ " + (a + 1) + " là :");
		System.out.println("Id: " + dsDepartment8[a].id);
		System.out.println("Name: " + dsDepartment8[a].name);
		a++;
		}while (a < dsDepartment8.length);
		
//		Qss17-12
		
		Department[] dsDepartment9 = new Department[]  { dep1, dep2, dep3 };
		int x1 = 0;
		do {
		System.out.println("Thông tin department thứ " + (x1 + 1) +
		" là:");
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

String x = "Nguyễn Văn A";
System.out.printf("Tên tôi là \"" + x + "\" và tôi đang độc thân \n");

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

		}
		
	}





