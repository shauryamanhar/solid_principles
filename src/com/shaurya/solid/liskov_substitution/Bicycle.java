package com.shaurya.solid.liskov_substitution;

public class Bicycle implements Vehicle {

	@Override
	public void startEngine() {
		throw new RuntimeException("Bicycle don't have engine.");
	}

}
