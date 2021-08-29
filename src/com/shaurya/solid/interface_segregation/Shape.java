package com.shaurya.solid.interface_segregation;

/*
 
Make fine grained interfaces that are client specific.

*/
@Deprecated
public interface Shape {
	double calculateArea();

	double calculateVolume();
}
