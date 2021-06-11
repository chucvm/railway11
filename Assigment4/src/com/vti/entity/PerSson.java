package com.vti.entity;

public  class PerSson implements IRollUp {
	
	public String name;
	public int tuoi;
	
	/**
	 * @param name
	 * @param tuoi
	 */
	public PerSson(String name, int tuoi) {
		super();
		this.name = name;
		this.tuoi = tuoi;
	}

	@Override
	public void rollup() {
		// TODO Auto-generated method stub
		
	}
	
	
	
}
