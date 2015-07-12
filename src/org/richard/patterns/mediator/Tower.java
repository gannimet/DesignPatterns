package org.richard.patterns.mediator;

import java.util.HashSet;
import java.util.LinkedList;
import java.util.Queue;
import java.util.Set;

import org.richard.patterns.mediator.Plane.Type;

/* Die Regeln dieses Flughafens lauten wie folgt:
 *  - ein Glider darf nur starten, wenn maximal
 *    eine Boeing in der Luft ist
 *  - Boeings dürfen jederzeit starten
 *  - Der Flughafen hat nur zwei Landebahnen, daher
 *    muss ein Flugzeug, das landen möchte, solange in
 *    der Luft bleiben, bis eine Landebahn frei wird.
 *    
 * Es wird die Annahme getroffen, dass alle Flugzeuge
 * ursprünglich von anderen Flughäfen gestartet sind.
 */
public class Tower {

	private Set<Plane> flyingPlanes = new HashSet<Plane>();
	private Set<Plane> planesInAirport = new HashSet<Plane>();
	
	private Queue<Plane> landingQueue = new LinkedList<Plane>();
	
	public boolean requestStartingClearance(Plane plane) {
		if(isFlying(plane)) {
			System.out.println(plane.getName() + " ist bereits in der Luft.");
			return false;
		}
		
		if(plane.getType() == Type.BOEING) {
			System.out.println("Tower erteilt " +
				plane.getName() + " Starterlaubnis.");
			flyingPlanes.add(plane);
			processLandingQueue(plane);
			return true;
		}
		
		if(getNumberOfFlyingBoeings() <= 1) {
			System.out.println("Tower erteilt " +
				plane.getName() + " Starterlaubnis.");
			flyingPlanes.add(plane);
			processLandingQueue(plane);
			return true;
		}
		
		System.out.println("Tower verweigert " +
			plane.getName() + " Starterlaubnis wegen zu vieler " +
			"Boeings in der Luft.");
		return false;
	}
	
	public boolean requestLandingPermission(Plane plane) {
		if(!flyingPlanes.contains(plane)) {
			System.out.println(plane.getName() + " ist gar nicht in der Luft.");
			return false;
		}
		
		if(planesInAirport.size() >= 2) {
			System.out.println("Tower verweigert " +
				plane.getName() + " Landeerlaubnis. Diese wird " +
				"zum nächstmöglichen Zeitpunkt erteilt.");
			landingQueue.offer(plane);
			return false;
		}
		
		System.out.println("Tower erteilt " + plane.getName() +
			" Landeerlaubnis.");
		planesInAirport.add(plane);
		flyingPlanes.remove(plane);
		return true;
	}
	
	private boolean isFlying(Plane plane) {
		return flyingPlanes.contains(plane);
	}
	
	private int getNumberOfFlyingBoeings() {
		int number = 0;
		
		for(Plane plane : flyingPlanes) {
			if(plane.getType() == Type.BOEING)
				number++;
		}
		
		return number;
	}
	
	public void dump() {
		System.out.println("-----");
		System.out.println("In der Luft: " + flyingPlanes);
		System.out.println("Im Flughafen: " + planesInAirport);
		System.out.println("Warten auf Landeerlaubnis: " + landingQueue);
		System.out.println("-----");
	}
	
	/* Wenn ein Flugzeug, das vorher im Flughafen war, nun gestartet ist,
	 * muss dem nächsten Flugzeug in der landingQueue die Landeerlaubnis
	 * erteilt werden.
	 */
	private void processLandingQueue(Plane justStarted) {
		if(planesInAirport.remove(justStarted)) {
			Plane landingCandidate = landingQueue.poll();
			System.out.println("Tower erteilt " + landingCandidate.getName() +
				" Landeerlaubnis.");
		}
	}
	
}