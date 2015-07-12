package org.richard.patterns.flyweight;

import java.util.HashMap;
import java.util.Map;

import org.richard.patterns.flyweight.Card.Color;

public class CardFactory {

	private Map<Color, Card> cards;
	
	public CardFactory() {
		cards = new HashMap<Color, Card>();
	}
	
	public Card getCard(Color color) {
		if(cards.containsKey(color)) {
			return cards.get(color);
		} else {
			Card card = new D32Card(color);
			cards.put(color, card);
			return card;
		}
	}
	
}