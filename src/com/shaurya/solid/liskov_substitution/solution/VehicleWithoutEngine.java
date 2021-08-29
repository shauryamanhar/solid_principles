package com.shaurya.solid.liskov_substitution.solution;

public abstract class VehicleWithoutEngine implements Vehicle {

	@Override
	public void start() {
		startMoving();
	}

	abstract void startMoving();
}
