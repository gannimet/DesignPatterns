package org.richard.patterns.observer;

public class Main {

	public static void main(String[] args) {
		DataViewer viewer = new DataViewer();
		
		/* Vom Hinzufügen und Löschen wird der
		 * Beobachter benachrichtigt und die neue Liste
		 * auf der Konsole ausgegeben. */
		viewer.simulateUserActivity();
	}

}