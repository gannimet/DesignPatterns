package org.richard.patterns.chainofresponsibility;

public class SliceHandler extends FruitHandler {

	public SliceHandler(FruitHandler nextHandler) {
		super(nextHandler);
	}

	@Override
	public void handleRequest(Fruit fruit) {
		if(fruit == Fruit.APPLE || fruit == Fruit.PEACH) {
			System.out.println("Schneide den " + fruit.getName());
		} else {
			System.out.println("Kann dieses Obst nicht schneiden. " +
				"Leite die Anfrage weiter.");
			
			if(hasNext())
				nextHandler.handleRequest(fruit);
		}
	}

}