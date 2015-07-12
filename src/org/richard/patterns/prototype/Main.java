package org.richard.patterns.prototype;

public class Main {

	public static void main(String[] args) {
		// Dies ist unser Prototyp-Rechteck
		Rectangle rect = new Rectangle(3, 4);
		
		Rectangle clone = rect.clone();
		
		for(int i = 0; i < 5; i++) {
			System.out.println(clone);
			
			clone = clone.clone();
			// Beim neuen Klon wird die Breite leicht verändert
			clone.setWidth(clone.getWidth() + 1);
		}
	}
	
}