package org.richard.patterns.templatemethod;

public abstract class ListPrinter {

	protected String[] fruit = {
		"Apfel", "Birne", "Orange", "Banane"
	};
	
	public void printList() {
		printListStart();
		for(String item : fruit) {
			printListItem(item);
		}
		printListEnd();
	}
	
	protected abstract void printListStart();
	
	protected abstract void printListItem(String content);
	
	protected abstract void printListEnd();
	
}