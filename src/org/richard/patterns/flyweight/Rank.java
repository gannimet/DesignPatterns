package org.richard.patterns.flyweight;

public enum Rank {

	SEVEN(7, "Sieben"), EIGHT(8, "Acht"), NINE(9, "Neun"), TEN(10, "Zehn"),
	QUEEN(10, "Königin"), KING(10, "König"), JOKER(10, "Bube"), ACE(11, "Ass");
	
	private int value;
	private String name;
	
	Rank(int value, String name) {
		this.value = value;
		this.name = name;
	}
	
	public int getValue() {
		return value;
	}
	
	public String getName() {
		return name;
	}
	
}