package org.richard.patterns.chainofresponsibility;

public abstract class FruitHandler {

	protected FruitHandler nextHandler;

	public FruitHandler(FruitHandler nextHandler) {
		this.nextHandler = nextHandler;
	}
	
	protected boolean hasNext() {
		return nextHandler != null;
	}
	
	public void handleRequest(Fruit fruit) {
		nextHandler.handleRequest(fruit);
	}

	public FruitHandler getNextHandler() {
		return nextHandler;
	}

	public void setNextHandler(FruitHandler nextHandler) {
		this.nextHandler = nextHandler;
	}
	
}