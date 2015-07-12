package org.richard.patterns.strategy;

public class Main {

	public static void main(String[] args) {
		Printer p;
		
		p = new APrinter();
		p.print();
		
		p = new BPrinter();
		p.print();
	}

}