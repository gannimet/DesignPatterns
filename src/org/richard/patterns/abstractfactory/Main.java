package org.richard.patterns.abstractfactory;

public class Main {

	public static void main(String[] args) {
		PrinterFactory factory;
		Printer printer;
		
		/* Mit einer APrinterFactory holen wir uns ein APrinter-Objekt,
		 * ohne dass printer von diesem konkreten Typ wissen muss */
		factory = new APrinterFactory();
		printer = factory.createPrinter();
		printer.print();	// A
		
		/* Nun weisen wir factory ein Objekt vom Typ BPrinterFactory zu
		 * und erzeugen damit einen neuen Printer. Mit demselben Aufruf zum
		 * Erzeugen des Printers bekommen wir jetzt einen anderen Typ Printer. */
		factory = new BPrinterFactory();
		printer = factory.createPrinter();
		printer.print();	// B
	}

}