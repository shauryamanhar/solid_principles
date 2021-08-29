package com.shaurya.solid.open_close;

/*

Open for extension and closed for modification.

You should be able to extend to a classes behavior without modifying it.

Now, Need to added support for "/".

Wrong implementation

*/

@Deprecated
public class Operation {
	public double operation(double a, double b, String op) {
		switch (op) {
		case "+":
			return a + b;
		case "-":
			return a - b;
		case "x":
			return a * b;
		default:
			System.out.println("invalid operator");
		}
		return 0D;
	}
}
