package com.shaurya.solid.liskov_substitution;

import java.util.ArrayList;
import java.util.List;

/*

Derived classes must be substituted for their base classes.
If S is sub-type of T, then object of type T may be replaced (or substituted)
with object of type S.

*/

@Deprecated
public class VehicleMonitor {
	void startVehicles() {
		List<Vehicle> vehicles = new ArrayList<Vehicle>();
		vehicles.add(new Car());
		vehicles.add(new Bike());
		vehicles.add(new Bicycle());
		// Runtime exception here because Bicycle don't have engine.
		vehicles.forEach(vehicle -> vehicle.startEngine());
	}
}
