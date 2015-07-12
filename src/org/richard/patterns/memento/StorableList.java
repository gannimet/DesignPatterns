package org.richard.patterns.memento;

import java.util.ArrayList;
import java.util.List;

public class StorableList {

	private List<String> content;
	
	public StorableList() {
		this.content = new ArrayList<String>();
	}
	
	public boolean add(String elem) {
		return content.add(elem);
	}
	
	public boolean remove(String elem) {
		return content.remove(elem);
	}
	
	public ListMemento store() {
		System.out.println("Memento-Objekt mit aktuellem Zustand erzeugt.");
		return new ListMemento(new ArrayList<String>(content));
	}
	
	public void restore(ListMemento memento) {
		this.content = memento.getStoredState();
		System.out.println("Alter Zustand wiederhergestellt.");
	}

	@Override
	public String toString() {
		return content.toString();
	}

}