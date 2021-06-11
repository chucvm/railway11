package com.vti.entity;

public abstract class HighSchoolStudent extends StudentQss2Ex5 {
	
	
	
	public String clazz;
	public String desiredUniversity;
	
	public HighSchoolStudent(int id ) {
		super(id);
		
	}

	
	public HighSchoolStudent(int id, String name,  String clazz, String desiredUniversity) {
		super(id);
		
		this.clazz = clazz;
		this.desiredUniversity = desiredUniversity;
	}



	
	
	
	}
	
	
	
	



