package Assiment1;

import java.util.Arrays;

public class Account {
	int	id;
	String	Email;
	String	userName;
	String	fullName;
	Department department;
	Position position;
	Date	CreateDate;
	Group[] groups;
	@Override
	public String toString() {
		return "Account [id=" + id + ", Email=" + Email + ", userName=" + userName + ", fullName=" + fullName
				+ ", department=" + department + ", position=" + position + ", groups=" + Arrays.toString(groups) + "]";
	}
	
	
}
