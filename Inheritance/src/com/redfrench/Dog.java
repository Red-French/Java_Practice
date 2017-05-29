package com.redfrench;

public class Dog extends Animal {
	
	private int eyes;
	private int legs;
	private int tail;
	private int teeth;
	private String coat;

	public Dog(String name, int size, int weight, int eyes, int legs, int tail, int teeth, String coat) {
		super(name, 1, 1, size, weight);  // passing 1 for brain and body
		this.eyes = eyes;
		this.legs = legs;
		this.tail = tail;
		this.teeth = teeth;
		this.coat = coat;
	}
	
	private void chew() {
		System.out.println("Dog is chewing");
	}
	
	@Override
	public void eat() {
		System.out.println("Dog.eat() called");
		chew();
		super.eat();
	}

	public void walk() {
		System.out.println("Dog.walk() called");
		super.move(5);
	}
	
	public void run() {
		System.out.println("Dog.run() called");
		move(10);
	}
	
	@Override
	public void move(int speed) {
		System.out.println("The dog is moving at " + speed + " in Dog.java");
	}
}
