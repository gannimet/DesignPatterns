package org.richard.patterns.singleton;

public class Main {

	public static void main(String[] args) {
		// Wir holen uns zweimal ein NetworkConnection-Objekt
		NetworkConnection n1 = NetworkConnection.getInstance();
		NetworkConnection n2 = NetworkConnection.getInstance();
		/* Den privaten Konstruktor der Klasse NetworkConnection
		 * können wir von außen nicht aufrufen */
		// NetworkConnection n3 = new NetworkConnection();	// Compilerfehler!
		
		/* Beide Objekte, die wir mit der getInstance-Methode geholt
		 * haben, sind identisch im Sinne von == */
		boolean same = n1 == n2;
		System.out.println("n1 == n2: " + same);
	}

}