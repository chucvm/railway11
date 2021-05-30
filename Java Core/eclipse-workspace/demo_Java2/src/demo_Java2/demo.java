package demo_Java2;

public class demo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("hello word");
		System.out.println("java1");
		
		Group	Group1 = new Group();
		Group1.id = 2;
		Group1.Name = "chucvm1";
		Group	Group2 = new Group();
		Group2.id = 3;
		Group2.Name = "chucvm6";

		student student1 = new student();
		student1.id = 1;
		student1.fullName = "chucvm";
		
// studen1 sẽ tham gia group1 và group2
		Group[]	dsGroup = {Group1, Group2};
		student1.groups = dsGroup;
		
		System.out.println(student1.fullName);
		student1.groups[0].showInfo () ;
		student1.groups[1].showInfo () ;
	}

}
