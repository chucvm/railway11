package com.vti.entity;

public class Contact {
	public String name;
	public String phone;
	/**
	 * @param name
	 * @param phone
	 */
	public Contact(String name, String phone) {
		super();
		this.name = name;
		this.phone = phone;
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
	 * @return the phone
	 */
	public String getPhone() {
		return phone;
	}
	/**
	 * @param phone the phone to set
	 */
	public void setPhone(String phone) {
		this.phone = phone;
	}
	@Override
	public String toString() {
		return "Contact [name=" + name + ", phone=" + phone + "]";
	}
	
	
}
