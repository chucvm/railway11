package Assiment1;

public class Program {

	public static void main(String[] args) {
	//		insert Department
		
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
				acc1.createDate = new Date.now();
				
				System.out.println(acc1.toString());
				


	}

}




