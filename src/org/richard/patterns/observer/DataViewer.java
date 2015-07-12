package org.richard.patterns.observer;

public class DataViewer implements Observer {

	private DataModel model;
	
	public DataViewer() {
		model = new DataModel();
		model.addObserver(this);
	}
	
	public void simulateUserActivity() {
		model.addElement("Apfel");
		model.addElement("Birne");
		model.addElement("Orange");
		
		model.removeElement("Apfel");
		
		model.addElement("Banane");
	}
	
	@Override
	public void update() {
		printData();
	}
	
	private void printData() {
		System.out.println("Aktualisierte Daten:");
		for(String value : model.getData()) {
			System.out.println(value);
		}
	}

}