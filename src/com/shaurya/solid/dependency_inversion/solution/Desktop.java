package com.shaurya.solid.dependency_inversion.solution;

/*

High level modules should not depends on low level modules. 
Both should depends on abstractions. Abstractions should not depends
on details. Details should depends on abstractions.

*/
public class Desktop {
	Monitor monitor;
	Keyboard keyboard;

	// Highly depends on monitor and keyboard
	public Desktop(Monitor monitor, Keyboard keyboard) {
		this.monitor = monitor;
		this.keyboard = keyboard;
	}

}
