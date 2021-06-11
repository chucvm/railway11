package com.vti.entity;

public class Student implements IStudent {
	public int id;
	public String name;
	public int group;
	
	
	
	/**
	 * @param id
	 * @param name
	 * @param group
	 */
	public Student(int id, String name, int group) {
		super();
		this.id = id;
		this.name = name;
		this.group = group;
	}
	public String toString() {
		return "Student [id=" + id + ", name=" + name + ", group=" + group + "]";
	}
	@Override
	public void diemDanh() {
		System.out.println(name + "diem danh.");
		
	}
	@Override
	public void hocBai() {
		System.out.println(name + "dang hoc bai.");
		
	}
	@Override
	public void donVeSinh() {
		System.out.println(name + "don ve sinh.");
		
	}
	/**
	 * @return the id
	 */
	public int getId() {
		return id;
	}
	/**
	 * @param id the id to set
	 */
	public void setId(int id) {
		this.id = id;
	}
	/**
	 * @return the name
	 */
	public String getName() {
		return name;
	}
	/**
	 * @param name the name to set
	 */
	public void setName(String name) {
		this.name = name;
	}
	/**
	 * @return the group
	 */
	public int getGroup() {
		return group;
	}
	/**
	 * @param group the group to set
	 */
	public void setGroup(int group) {
		this.group = group;
	}
	
}
