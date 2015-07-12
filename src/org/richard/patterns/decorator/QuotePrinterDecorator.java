package org.richard.patterns.decorator;

public abstract class QuotePrinterDecorator implements QuotePrinter {

	protected QuotePrinter printer;
	
	public QuotePrinterDecorator(QuotePrinter printer) {
		this.printer = printer;
	}
	
	@Override
	public void printQuote() {
		printer.printQuote();
	}

}