package org.richard.patterns.chainofresponsibility;

public enum Fruit {

	APPLE("Apfel"), BANANA("Banane"), ORANGE("Orange"), PEACH("Pfirsich");
	
	private String name;
	
	Fruit(String name) {
		this.name = name;
	}

	public String getName() {
		return name;
	}
	
}