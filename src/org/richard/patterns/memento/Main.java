package org.richard.patterns.memento;

public class Main {

	public static void main(String[] args) {
		StorableList fruit = new StorableList();
		Caretaker caretaker = new Caretaker();
		
		fruit.add("Banane");
		fruit.add("Apfel");
		fruit.add("Kirsche");
		
		dumpList(fruit);
		caretaker.addMemento(fruit.store());
		
		fruit.remove("Apfel");
		fruit.add("Zitrone");
		
		dumpList(fruit);
		caretaker.addMemento(fruit.store());
		
		fruit.restore(caretaker.getMemento(0));
		dumpList(fruit);
	}
	
	private static void dumpList(StorableList list) {
		System.out.println("Aktueller Zustand: " + list);
	}
	
}