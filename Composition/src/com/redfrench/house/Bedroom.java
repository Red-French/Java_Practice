package com.redfrench.house;

public class Bedroom {

	private String bedSize;
	private String closetType;
	private int numberOfBedrooms;
	private String safeCombination;
	
	public Bedroom(String bedSize, String closetType, int numberOfBedrooms) {
		super();
		this.bedSize = bedSize;
		this.closetType = closetType;
		this.safeCombination = "R34 L16 R23 L45"; 
		this.numberOfBedrooms = numberOfBedrooms;
		
	}

	public String getBedSize() {
		return bedSize;
	}

	public String getClosetType() {
		return closetType;
	}
	
	public int getNumberOfBedrooms() {
		return numberOfBedrooms;
	}
	
	public String secrets() {
		return safeCombination;
	}
	
}
