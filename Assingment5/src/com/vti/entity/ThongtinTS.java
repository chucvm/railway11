package com.vti.entity;

public class ThongtinTS {
	public int idNum;
	public String name;
	public String address;
	public int priority;
	public KhoiThi  block;
	/**
	 * @param idNum
	 * @param name
	 * @param address
	 * @param priority
	 * @param block
	 */
	public ThongtinTS(int idNum, String name, String address, int priority, KhoiThi block) {
		super();
		this.idNum = idNum;
		this.name = name;
		this.address = address;
		this.priority = priority;
		this.block = block;
	}
	/**
	 * @return the idNum
	 */
	public int getIdNum() {
		return idNum;
	}
	/**
	 * @param idNum the idNum to set
	 */
	public void setIdNum(int idNum) {
		this.idNum = idNum;
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
	 * @return the address
	 */
	public String getAddress() {
		return address;
	}
	/**
	 * @param address the address to set
	 */
	public void setAddress(String address) {
		this.address = address;
	}
	/**
	 * @return the priority
	 */
	public int getPriority() {
		return priority;
	}
	/**
	 * @param priority the priority to set
	 */
	public void setPriority(int priority) {
		this.priority = priority;
	}
	/**
	 * @return the block
	 */
	public KhoiThi getBlock() {
		return block;
	}
	/**
	 * @param block the block to set
	 */
	public void setBlock(KhoiThi block) {
		this.block = block;
	}
	@Override
	public String toString() {
		return "ThongtinTS [idNum=" + idNum + ", name=" + name + ", address=" + address + ", priority=" + priority
				+ ", block=" + block + "]";
	}
	
}
