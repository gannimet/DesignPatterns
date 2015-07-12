package org.richard.patterns.facade;

public class Gearbox {

	private int gear = 0;
	public static final int NUMBER_OF_GEARS = 6;
	
	public void shiftUp() {
		if(gear < NUMBER_OF_GEARS) {
			gear++;
			System.out.println("Hoch in Gang " + gear);
		} else {
			System.out.println("Kann nicht weiter hochschalten.");
		}
	}
	
	public void shiftDown() {
		if(gear > 0) {
			gear--;
			System.out.println("Runter in Gang " + gear);
		} else {
			System.out.println("Kann nicht weiter runterschalten.");
		}
	}
	
}