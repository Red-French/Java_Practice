package com.redfrench;

public class Pages {
	
	static Toner toner = new Toner();
	protected static int paper = 50;

	
	public static int getPaper() {
		return paper;
	}

	public static void usePaper(int pagesUsed) {
		paper = paper - pagesUsed;
	}
	
	public static void fillPaper() {
		paper = 50;
	}
	
	
	public static void print(int numberOfPages) {
		System.out.println("\nPrinting " + numberOfPages + " pages.");
		usePaper(numberOfPages);
		toner.userToner(numberOfPages/2);
		System.out.println("\nPrint job complete.");
	}
	
	
}
