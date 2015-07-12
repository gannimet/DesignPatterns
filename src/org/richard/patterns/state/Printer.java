package org.richard.patterns.state;

public class Printer {

	private PrinterState state;
	private boolean on = false;
	
	private PrinterState onState = new OnState();
	private PrinterState offState = new OffState();
	
	public Printer() {
		state = offState;
	}
	
	public void switchOn() {
		on = true;
		state = onState;
	}
	
	public void switchOff() {
		on = false;
		state = offState;
	}
	
	public boolean isOn() {
		return on;
	}
	
	public boolean print() {
		return state.print();
	}
	
}