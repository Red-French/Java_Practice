package com.redfrench;

public class Fish extends Animal{

	private int gills;
	private int eyes;
	private int fins;
	
	public Fish(String name, int size, int weight) {
		super(name, 1, 1, size, weight);  // 1s are for brain and body
		this.gills = gills;
		this.eyes = eyes;
		this.fins = fins;
	}
	
	private void rest(String thing) {
		System.out.println("I'll hang out by this " + thing);
	}
	
	private void moveMuscles() {
		System.out.println("moving those fish muscles");
	}
	
	private void moveBackFin() {
		System.out.println("moving that back fin");
	}
	
	public void swim(int speed) {
		moveMuscles();
		moveBackFin();
		super.move(speed);
		System.out.println("I'm swimming!");
		System.out.println("Now, I'll rest");
		rest("coral");
	}
	
}
