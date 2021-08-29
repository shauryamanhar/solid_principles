package com.shaurya.solid.liskov_substitution;

public class Bike implements Vehicle {

	@Override
	public void startEngine() {
		System.out.println("Cars engine started.");
	}

}
