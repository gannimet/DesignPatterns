package org.richard.patterns.state;

public class Main {

	public static void main(String[] args) {
		Printer printer = new Printer();
		boolean printed = printer.print();
		hasPrinted(printed);
		
		System.out.println("---");
		
		printer.switchOn();
		printed = printer.print();
		hasPrinted(printed);
		
		System.out.println("---");
		
		printer.switchOff();
		printed = printer.print();
		hasPrinted(printed);
	}
	
	private static void hasPrinted(boolean printed) {
		if(printed)
			System.out.println("Erfolgreich gedruckt.");
		else
			System.out.println("Nichts gedruckt");
	}
	
}