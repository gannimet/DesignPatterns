package org.richard.patterns.memento;

import java.util.ArrayList;
import java.util.List;

public class Caretaker {

	private List<ListMemento> mementos;
	
	public Caretaker() {
		this.mementos = new ArrayList<ListMemento>();
	}
	
	public void addMemento(ListMemento memento) {
		mementos.add(memento);
	}
	
	public ListMemento getMemento(int index) {
		return mementos.get(index);
	}
	
}