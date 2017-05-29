package com.redfrench;

public class Main {

	public static void main(String[] args) {
		Animal animal = new Animal("Animal", 1, 1, 5, 5);
		
		Dog dog = new Dog("Pyrenees", 9, 120, 2, 4, 1, 20, "thick");
		dog.eat();
		dog.walk();
		dog.run();
		
		Fish fish = new Fish("Fred Fisher", 2, 2);
		fish.swim(4);
	}

}
