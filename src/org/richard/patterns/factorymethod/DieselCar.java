package org.richard.patterns.factorymethod;

public class DieselCar extends Car {

	@Override
	public Engine createEngine() {
		return new DieselEngine();
	}

}