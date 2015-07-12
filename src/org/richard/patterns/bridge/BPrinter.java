package org.richard.patterns.bridge;

public class BPrinter extends Printer {

	public BPrinter(PrintingImpl impl) {
		super(impl);
	}

	@Override
	public void print() {
		impl.print("B");
	}

}