package com.shaurya.solid.liskov_substitution.solution;

public class Bicycle extends VehicleWithoutEngine {

	@Override
	void startMoving() {
		System.out.println("Bicycle is moving forward.");
	}

}
