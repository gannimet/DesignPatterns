package org.richard.patterns.factorymethod;

public class FuelCar extends Car {

	@Override
	public Engine createEngine() {
		return new FuelEngine();
	}

}