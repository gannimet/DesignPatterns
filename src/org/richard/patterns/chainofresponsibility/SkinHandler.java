package org.richard.patterns.chainofresponsibility;

public class SkinHandler extends FruitHandler {

	public SkinHandler(FruitHandler nextHandler) {
		super(nextHandler);
	}

	@Override
	public void handleRequest(Fruit fruit) {
		if(fruit == Fruit.BANANA || fruit == Fruit.ORANGE) {
			System.out.println("Schäle die " + fruit.getName());
		} else {
			System.out.println("Kann dieses Obst nicht schälen. " +
				"Leite die Anfrage weiter.");
			
			if(hasNext())
				nextHandler.handleRequest(fruit);
		}
	}

}