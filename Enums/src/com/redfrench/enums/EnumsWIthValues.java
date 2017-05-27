package com.redfrench.enums;

public class EnumsWIthValues {

	static String choice = "blue";


    public enum VehicleChoice {
        BLUE("blue"), GREEN("green");

        private String color;
        
        VehicleChoice(String vc) {
        	color = vc;
        }

        String getColor() {
        	return color;
       }
    }


    public static void main(String[] args) {

    	for (VehicleChoice vc : VehicleChoice.values()) {

    		if (choice.equalsIgnoreCase(vc.getColor())) {
    			System.out.println(vc + " = " + vc.getColor());
            }
        }
 

    	if(choice == "green") {
    		buildVehicle(VehicleChoice.GREEN);
    	} else if(choice == "blue") {
    		buildVehicle(VehicleChoice.BLUE);
    	} else {
    		System.out.println("bad choice");  // msg to user
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

   

        Car fastCar = new Car();  // Car class is defined in Enums.java
        fastCar.type = "car";
        fastCar.color = finalColor;

        System.out.println("You new car is a " + fastCar.color + " " + fastCar.type);
        System.out.println("");

    }

}


