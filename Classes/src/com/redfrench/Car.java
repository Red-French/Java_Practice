package com.redfrench;

public class Car {

	private String make;
	private String model;
	private String color;
	private int engine;
	private int year;
	
	public void setMake(String make) {
		String validMake = make.toLowerCase();
		if(validMake.equals("chevy") || validMake.equals("pontiac")) {
			this.make = make;	
		} else {
			this.make = "unknown";
		}
	}
	
	public String getMake() {
		return this.make;
	}
	
}
