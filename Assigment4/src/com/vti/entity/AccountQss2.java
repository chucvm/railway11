package com.vti.entity;

public class AccountQss2 {
	public String id;
	public String name;
	public int balance;
	
	public AccountQss2() {
		super();
		
	}

	
	public AccountQss2(String id, String name, int balance) {
		super();
		this.id = id;
		this.name = name;
		this.balance = balance;
	}


	/**
	 * @return the id
	 */
	public String getId() {
		return id;
	}


	/**
	 * @param id the id to set
	 */
	public void setId(String id) {
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
	 * @return the balance
	 */
	public int getBalance() {
		return balance;
	}


	/**
	 * @param balance the balance to set
	 */
	public void setBalance(int balance) {
		this.balance = balance;
	}
	
	public int credit(int amount) {
		return this.balance += amount;
	}
	
	public int debit(int amount) {
		return this.balance -= amount;
	}
	
	public void tranfer(AccountQss2 acc, int amount) {
		this.balance -= amount;
		acc.balance += amount;
	}
	

}
