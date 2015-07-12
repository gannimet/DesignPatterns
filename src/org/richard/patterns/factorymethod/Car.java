package org.richard.patterns.factorymethod;

public abstract class Car {

	public void turnIgnitionKey() {
		System.out.println("Drehe Zündschlüssel um…");
		
		Engine engine = createEngine();
		engine.start();
	}
	
	public abstract Engine createEngine();
	
}