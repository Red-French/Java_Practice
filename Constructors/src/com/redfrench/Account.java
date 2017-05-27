package com.redfrench;

public class Account {
	
	private int actNum;
	private double balance;
	private String name;
	private String email;
	private String phone;
	
	// if the constructor is called without receiving arguments, this default constructor fires
	public Account() {
		this(1234567, 0.00, "ghost account", "ghost@boo.com", "(000)123-4567");
		System.out.println("Empty constructor called");
	}
	
	// if the constructor is called with arguments name, email, and phone, this constructor will fire
	// which contains 2 default values
	public Account( String name, String email, String phone) {
	    this(1234567, 0.00, name, email, phone);  // ‘this’ will call the constructor below with 2 default values included
	}
	
	public Account(int actNum, double balance, String name, String email, String phone) {
		System.out.println("Constructor called");
		this.actNum = actNum;  // set values directly, as inheritance has problems with setters
		this.balance = balance;
		this.name = name;
		this.email = email;
		this.phone = phone;
	}
	
	public void deposit(int moneyIn) {
		balance += moneyIn;
	}
	public void withdrawal(int moneyOut) {
		balance -= moneyOut;
		if(balance < 0) {
			System.out.print("You are overdrawn by " + (0 - balance) + " dollars.");
		}
	}
	
	// SETTERS
	public void setActNum(int actNum) {
		this.actNum = actNum;
	}
	public void setBalance(double balance) {
		this.balance = balance;
	}
	public void setName(String name) {
		this.name = name;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public void setPhone(String phone) {
		this.phone = phone;
	}
	
	// GETTERS
	public int getActNum() {
		return this.actNum;
	}
	public double getBalance() {
		return this.balance;
	}
	public String getName() {
		return name;
	}
	public String getEmail() {
		return email;
	}
	public String getPhone() {
		return phone;
	}

}
