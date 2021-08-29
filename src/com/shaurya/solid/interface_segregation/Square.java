package com.shaurya.solid.interface_segregation;

/*

Square don't have volume. The method calculateVolume() is unnecessary.

*/

@Deprecated
public class Square implements Shape {

	@Override
	public double calculateArea() {
		return 0;
	}

	@Override
	public double calculateVolume() {
		return 0;
	}

}
