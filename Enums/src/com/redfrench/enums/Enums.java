package com.redfrench.enums;

import java.lang.Enum;


public class Enums {

	public enum VehicleChoice {
        BLUE, GREEN
    }

   

	public static void main(String[] args) {
		String choice = "blue";

		if(choice == "green") {
			buildVehicle(VehicleChoice.GREEN);
		} else if(choice == "blue") {
			buildVehicle(VehicleChoice.BLUE);
		} else {
			System.out.println("bad choice");
		}
	}


	public static void buildVehicle(VehicleChoice myAuto) {

		VehicleChoice v = myAuto;

		String finalColor = "";

		switch(v) {
			case GREEN:
				finalColor = "green";
				break;
			case BLUE:
				finalColor = "blue";
				break;
		};

   
        Car fastCar = new Car();
        fastCar.type = "car";
        fastCar.color = finalColor;

        System.out.println("NewCar = " + fastCar.type + " " + fastCar.color);

	}
}


class Car {
	String type;
	String color;
}

