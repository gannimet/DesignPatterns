package org.richard.patterns.bridge;

public class Main {

	public static void main(String[] args) {
		Printer printer;
		
		PrintingImpl plainImpl = new PlainTextPrintingImpl();
		PrintingImpl htmlImpl = new HTMLPrintingImpl();
		
		printer = new APrinter(plainImpl);
		printer.print();
		
		/* Die PrintingImpl kann problemlos zur Laufzeit ausgetauscht
		 * werden, da die Implementierung von der Abstraktion
		 * entkoppelt ist. */
		printer.setImpl(htmlImpl);
		printer.print();
		
		/* Genauso kann (ähnlich wie beim Strategy-Pattern) der
		 * Printer selbst zur Laufzeit geändert werden. */
		printer = new BPrinter(plainImpl);
		printer.print();
		
		printer.setImpl(htmlImpl);
		printer.print();
	}
	
}