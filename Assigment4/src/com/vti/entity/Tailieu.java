package com.vti.entity;

public class Tailieu {
	public int id;
	public String publisher;
	public int numRelease;
	/**
	 * @param id
	 * @param publisher
	 * @param numRelease
	 */
	public Tailieu(int id, String publisher, int numRelease) {
		super();
		this.id = id;
		this.publisher = publisher;
		this.numRelease = numRelease;
	}
	
	public Tailieu() {
		// TODO Auto-generated constructor stub
	}

	public int getId() {
		return id;
	}

	@Override
	public String toString() {
		return "Tailieu [id=" + id + ", publisher=" + publisher + ", numRelease=" + numRelease + "]";
	}
	
	

}
