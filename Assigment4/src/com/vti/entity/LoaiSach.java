package com.vti.entity;

public class LoaiSach extends Tailieu {
	private String authorName;
	private int numPage;
	
	public LoaiSach(int id, String publisher, int numRelease, String authorName, int numPage) {
		super(id, publisher, numRelease);
		this.authorName = authorName;
		this.numPage = numPage;
	}

	@Override
	public String toString() {
		return "LoaiSach [authorName=" + authorName + ", numPage=" + numPage + "]";
	}
	
	
}
