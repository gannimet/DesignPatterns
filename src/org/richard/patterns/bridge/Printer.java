package org.richard.patterns.bridge;

public abstract class Printer {

	protected PrintingImpl impl;
	
	public Printer(PrintingImpl impl) {
		this.impl = impl;
	}
	
	public abstract void print();

	public PrintingImpl getImpl() {
		return impl;
	}

	public void setImpl(PrintingImpl impl) {
		this.impl = impl;
	}
	
}