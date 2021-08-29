package com.shaurya.solid.liskov_substitution.solution;

public class Bike extends VehicleWithEngine {

	@Override
	void startEngine() {
		System.out.println("Bike is starting its engine.");
	}

}
