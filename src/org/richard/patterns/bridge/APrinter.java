package org.richard.patterns.bridge;

public class APrinter extends Printer {

	public APrinter(PrintingImpl impl) {
		super(impl);
	}

	@Override
	public void print() {
		impl.print("A");
	}

}