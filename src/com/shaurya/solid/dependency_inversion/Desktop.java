package com.shaurya.solid.dependency_inversion;

/*

High level modules should not depends on low level modules. 
Both should depends on abstractions. Abstractions should not depends
on details. Details should depends on abstractions.

*/
public class Desktop {
	Monitor monitor;
	QueryKeyboard keyboard;

	// Highly depends on monitor and keyboard
	public Desktop() {
		this.monitor = new Monitor();
		this.keyboard = new QueryKeyboard();
	}

}
