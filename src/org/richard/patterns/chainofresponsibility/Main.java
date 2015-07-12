package org.richard.patterns.chainofresponsibility;

public class Main {

	public static void main(String[] args) {
		Fruit apple = Fruit.APPLE;
		Fruit orange = Fruit.ORANGE;
		
		FruitHandler skinHandler = new SkinHandler(null);
		FruitHandler sliceHandler = new SliceHandler(skinHandler);
		
		/* Solange die Anfrage immer an das erste Glied
		 * der Kette geschickt wird, ist sichergestellt, dass jeder
		 * Handler einmal versuchen darf, sie zu bearbeiten. */
		sliceHandler.handleRequest(apple);
		sliceHandler.handleRequest(orange);
	}
	
}