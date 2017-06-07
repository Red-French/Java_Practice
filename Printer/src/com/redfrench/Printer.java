package com.redfrench;

public class Printer extends Pages {

	public static void main(String[] args) {
		
		System.out.println("Printer is ready");
		
		printStuff(4);
		
		for(int i = 50; i > 0; i--) {
			if(getPaper() > 0) {
				printStuff(4);
			} else {
				System.out.println("Out of paper.");
				break;
			}
		}
	}
	
	public static void printStuff (int pagesToPrint) {
		
		print(pagesToPrint);
		int paperLeft = getPaper();
		int tonerLeft = toner.getLevel(); // access toner via Pages class
		
		communicateToUser(paperLeft, tonerLeft);
		
		if(tonerLeft < 10) {
			System.out.println("\n~~~~~~~~~~~~~~~ FILLING TONER ~~~~~~~~~~~~~~~");
			toner.fillToner();
		}
		
		if(paperLeft < 1) {
			System.out.println("\n~~~~~~~~~~~~~~~ ADDING PAPER ~~~~~~~~~~~~~~~");
			fillPaper();
		}
	}
	
	public static void communicateToUser(int paperLeft, int tonerLeft) {
		System.out.println("Paper remaining: " + paperLeft + " pages");
		System.out.println("Toner remaining: " + tonerLeft + "%");
		System.out.println("Printer status: Standby");
	}
	
	
	
	
	
	

}
