package org.richard.patterns.flyweight;

public class D32Card extends Card {

	D32Card(Color color) {
		super(color);
	}

	@Override
	public void layDown(Rank rank) throws IllegalArgumentException {
		if(rank.getValue() < 7)
			throw new IllegalArgumentException("Zu geringer Kartenwert.");
		
		System.out.println("Lege aus: " +
			color.getValue() + " " + rank.getName());
	}

}