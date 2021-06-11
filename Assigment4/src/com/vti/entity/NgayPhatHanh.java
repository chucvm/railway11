package com.vti.entity;

import java.time.LocalDate;

public class NgayPhatHanh extends Tailieu {
	private LocalDate Date;

	
	public NgayPhatHanh(int id, String publisher, int numRelease, LocalDate date) {
		super(id, publisher, numRelease);
		Date = date;
	}


	@Override
	public String toString() {
		return "NgayPhatHanh [Date=" + Date + "]";
	}
	
	

}
