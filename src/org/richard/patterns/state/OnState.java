package org.richard.patterns.state;

public class OnState implements PrinterState {

	@Override
	public boolean print() {
		System.out.println("Testprint");
		return true;
	}

}