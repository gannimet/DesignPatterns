package org.richard.patterns.flyweight;

import org.richard.patterns.flyweight.Card.Color;

public class Main {

	public static void main(String[] args) {
		CardFactory factory = new CardFactory();
		
		Card c1 = factory.getCard(Color.CLUBS);
		/* Dieselbe Karte wird nun zweimal mit
		 * unterschiedlichen Werten ausgelegt. */
		c1.layDown(Rank.EIGHT);
		c1.layDown(Rank.ACE);
		
		Card c2 = factory.getCard(Color.CLUBS);
		c2.layDown(Rank.TEN);
		
		/* Da die CardFactory quasi ein Singleton implementiert,
		 * sind Karten von derselben Farbe jeweils identisch. */
		boolean same = c1 == c2;
		System.out.println("c1 == c2: " + same);
	}
	
}