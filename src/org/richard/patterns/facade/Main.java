package org.richard.patterns.facade;

public class Main {

	public static void main(String[] args) {
		/* Die Fassade kümmert sich um den komplizierten Mechanismus
		 * im Subsystem, von dem wir nichts wissen müssen.
		 * Wir könnten uns aber auch direkt mit den Klassen des
		 * Subsystems umgehen, wenn der Bedarf besteht. */
		Car car = new Car();
		car.driveAutonomously();
	}
	
}