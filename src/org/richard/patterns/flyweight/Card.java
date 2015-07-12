package org.richard.patterns.flyweight;

public abstract class Card {
	
	protected Color color;
	
	Card(Color color) {
		this.color = color;
	}
	
	public enum Color {
		
		HEARTS("Herz"), DIAMONDS("Karo"), CLUBS("Kreuz"), SPADES("Pik");
		
		String value;
		
		Color(String value) {
			this.value = value;
		}
		
		public String getValue() {
			return value;
		}
		
	}
	
	public Color getColor() {
		return this.color;
	}
	
	public abstract void layDown(Rank rank) throws IllegalArgumentException;
	
}