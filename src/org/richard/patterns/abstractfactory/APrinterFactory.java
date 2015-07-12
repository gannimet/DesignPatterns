package org.richard.patterns.abstractfactory;

public class APrinterFactory implements PrinterFactory {

	@Override
	public Printer createPrinter() {
		return new APrinter();
	}

}