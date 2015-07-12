package org.richard.patterns.memento;

import java.util.List;

public class ListMemento {

	private List<String> state;
	
	public ListMemento(List<String> state) {
		this.state = state;
	}
	
	public List<String> getStoredState() {
		return state;
	}
	
}