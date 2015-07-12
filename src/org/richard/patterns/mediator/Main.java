package org.richard.patterns.mediator;

import org.richard.patterns.mediator.Plane.Type;

public class Main {

	public static void main(String[] args) {
		Tower tower = new Tower();
		
		Plane s1 = new Plane("Segler 1", Type.GLIDER, tower);
		Plane s2 = new Plane("Segler 2", Type.GLIDER, tower);
		
		Plane b1 = new Plane("Boeing 1", Type.BOEING, tower);
		Plane b2 = new Plane("Boeing 2", Type.BOEING, tower);
		
		/* Die komplexe Logik der Start- und Landeerlaubnisse
		 * ist komplett im Tower (der als Mediator fungiert)
		 * gekapselt. */
		s1.start();
		tower.dump();
		
		b1.start();
		s1.land();
		tower.dump();
		
		b2.start();
		tower.dump();
		
		s2.start();
		b2.land();
		s2.start();
		tower.dump();
		
		s2.land();
		tower.dump();
		
		b2.start();
		tower.dump(); // An dieser Stelle darf auch s2 landen
	}
	
}