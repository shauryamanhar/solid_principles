package com.shaurya.solid.liskov_substitution.solution;

import java.util.ArrayList;
import java.util.List;

public class VehicleMonitor {
	public void startVehicles() {
		List<Vehicle> vehicles = new ArrayList<Vehicle>();
		vehicles.add(new Car());
		vehicles.add(new Bike());
		vehicles.add(new Bicycle());
		// This will with with no problem.
		vehicles.forEach(vehicle -> vehicle.start());
	}

	public static void main(String[] args) {
		VehicleMonitor vehicleMonitor = new VehicleMonitor();
		vehicleMonitor.startVehicles();
	}
}
