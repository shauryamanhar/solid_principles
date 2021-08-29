package com.shaurya.solid.liskov_substitution.solution;

public class Car extends VehicleWithEngine {

	@Override
	void startEngine() {
		System.out.println("Car is starting its engine.");
	}

}
