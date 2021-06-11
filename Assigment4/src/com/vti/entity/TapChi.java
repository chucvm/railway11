package com.vti.entity;

import java.time.LocalDate;

public class TapChi extends Tailieu {
	private int id;
	private LocalDate month;
	
	public TapChi(int id, String publisher, int numRelease, int id2, LocalDate month) {
		super(id, publisher, numRelease);
		id = id2;
		this.month = month;
	}

	@Override
	public String toString() {
		return "TapChi [id=" + id + ", month=" + month + "]";
	}

}
