package org.richard.patterns.builder;

public class ListDirector {

	private ListBuilder builder;
	private String[] fruit = {
		"Apfel", "Birne", "Orange", "Banane"
	};
	
	public ListDirector(ListBuilder builder) {
		this.builder = builder;
	}
	
	public void construct() {
		builder.buildListStart();
		for(String item : fruit) {
			builder.buildListItem(item);
		}
		builder.buildListEnd();
	}
	
}