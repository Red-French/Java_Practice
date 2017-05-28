package com.redfrench.house;

public class Build {
	
	private Kitchen kitchen;
	private Den den;
	private Bedroom bedroom;
	private Bathroom bathroom;
	
	public Build(Kitchen kitchen, Den den, Bedroom bedroom, Bathroom bathroom) {
		super();
		this.kitchen = kitchen;
		this.den = den;
		this.bedroom = bedroom;
		this.bathroom = bathroom;
	}

	public void privateDetails(String roomNum) {
		if(roomNum == "roomInfo") {
			bedroomInfo();
		}
	}
	
	private void bedroomInfo() {
		String topSecret = bedroom.secrets();
		System.out.println("The safe combination is: " + topSecret + " (not really)");
	}
	
}
