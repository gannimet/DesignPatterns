package org.richard.patterns.prototype;

public class Rectangle implements Cloneable {

	private double width, height;

	public Rectangle(double width, double height) {
		this.width = width;
		this.height = height;
	}

	public double getWidth() {
		return width;
	}

	public void setWidth(double width) {
		this.width = width;
	}

	public double getHeight() {
		return height;
	}

	public void setHeight(double height) {
		this.height = height;
	}
	
	public double area() {
		return width * height;
	}

	public Rectangle clone() {
		try {
			/* Anmerkung: Das GoF-Buch schreibt:
			 * „Clients should never need to downcast the return value
			 * of clone to the desired type.” -
			 * deswegen machen wir den Downcast direkt in der clone-Methode.
			 * Das könnte man umgehen, indem man NICHT das Java-eigene
			 * clone() aus der Klasse Object benutzt */
			return (Rectangle) super.clone();
		} catch(CloneNotSupportedException e) {
			return null;
		}
	}

	@Override
	public String toString() {
		return "Rechteck mit den Maßen " + width + " x " + height +
			" hat die Fläche " + area();
	}
	
}