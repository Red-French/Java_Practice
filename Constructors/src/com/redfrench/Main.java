package com.redfrench;

public class Main {

	public static void main(String[] args) {
		
		Account customer = new Account();
//		(87699341, 8263.52, "Fred@finkelstein.com", "Fred Finkelstein", "(615)352-8642");
		
		// uses method overloading to fire the proper constructor in Account.java
		// (the constructor taking 3 parameters holds 2 default values that will be used)
		Account redsAccount = new Account("Red French", "red@redfrench.net", "(615)123-4321");
				
//		customer.deposit(1000);
//		System.out.println("Post-Deposit Balance: " + customer.getBalance());
//		
//		customer.withdrawal(10500);
		
		// call getters
//		System.out.println("Account Number: " + customer.getActNum());
//		System.out.println("Current Balance: " + customer.getBalance());
//		System.out.println("Email: " + customer.getEmail());
//		System.out.println("Name: " + customer.getName());
//		System.out.println("Phone: " + customer.getPhone());
		
		System.out.println("Account Number: " + redsAccount.getActNum());
		System.out.println("Current Balance: " + redsAccount.getBalance());
		System.out.println("Email: " + redsAccount.getEmail());
		System.out.println("Name: " + redsAccount.getName());
		System.out.println("Phone: " + redsAccount.getPhone());
	}

}
