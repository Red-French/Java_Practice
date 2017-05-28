package com.redfrench.house;

public class Main {

	public static void main(String[] args) {
		
		Kitchen theKitchen = new Kitchen("oak", "butcherblock");
		Den theDen = new Den("loveseat", "ceiling fan", "fireplace");
		Bedroom theBedroom = new Bedroom("full-size bed", "walk-in closet", 4);
		Bathroom theBathroom = new Bathroom("jacuzzi");
		
		Build house = new Build(theKitchen, theDen, theBedroom, theBathroom);
		 
		// calls public method which calls private method which accesses data 
		house.privateDetails("roomInfo");
		
		// call getters
		String denSeating = theDen.getSeating();
		System.out.println("Den Seating: " + denSeating);
		System.out.println("Number of Bedrooms: " + theBedroom.getNumberOfBedrooms());
		System.out.println("Kitchen cabinets are " + theKitchen.getCabinetMaterial());
		System.out.print("Bathroom has a " + theBathroom.getTubType());
	}

}
