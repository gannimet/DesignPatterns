package org.richard.patterns.factorymethod;

public class Main {

	public static void main(String[] args) {
		Car car;
		
		/* Das Erzeugen der konkreten benötigten Motoren ist
		 * den Unterklassen von Car überlassen. */
		car = new FuelCar();
		car.turnIgnitionKey();
		
		/* Ein anderer Auto-Typ startet auch einen anderen
		 * Motor-Typ */
		car = new DieselCar();
		car.turnIgnitionKey();
	}

}