package org.richard.patterns.state;

public class OffState implements PrinterState {

	@Override
	public boolean print() {
		return false;
	}

}