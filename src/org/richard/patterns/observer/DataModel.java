package org.richard.patterns.observer;

import java.util.ArrayList;
import java.util.List;

public class DataModel implements Observable {

	private List<Observer> observers;
	
	private List<String> data;
	
	public DataModel() {
		observers = new ArrayList<Observer>();
		data = new ArrayList<String>();
	}
	
	public void addElement(String value) {
		data.add(value);
		notifyObservers();
	}
	
	public void removeElement(String value) {
		data.remove(value);
		notifyObservers();
	}
	
	public List<String> getData() {
		return data;
	}
	
	@Override
	public void addObserver(Observer observer) {
		observers.add(observer);
	}

	@Override
	public void removeObserver(Observer observer) {
		observers.remove(observer);
	}

	@Override
	public void notifyObservers() {
		for(Observer observer : observers) {
			observer.update();
		}
	}

}