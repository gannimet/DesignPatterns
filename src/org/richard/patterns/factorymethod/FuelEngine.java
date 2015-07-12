package org.richard.patterns.factorymethod;

public class FuelEngine implements Engine {

	@Override
	public void start() {
		System.out.println("Starte Benzinmotor…");
	}

}