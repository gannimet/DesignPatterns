package org.richard.patterns.abstractfactory;

public class BPrinterFactory implements PrinterFactory {

	@Override
	public Printer createPrinter() {
		return new BPrinter();
	}

}