package com.shaurya.solid.liskov_substitution.solution;

public abstract class VehicleWithEngine implements Vehicle {
	
	@Override
	public void start() {
		startEngine();
	}
	
	abstract void startEngine();
}
