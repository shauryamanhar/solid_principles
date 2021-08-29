package com.shaurya.solid.liskov_substitution;

public class Car implements Vehicle {

	@Override
	public void startEngine() {
		System.out.println("Bike's engine started.");
	}

}
