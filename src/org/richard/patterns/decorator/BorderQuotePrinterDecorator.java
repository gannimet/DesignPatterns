package org.richard.patterns.decorator;

public class BorderQuotePrinterDecorator extends QuotePrinterDecorator {

	public BorderQuotePrinterDecorator(QuotePrinter printer) {
		super(printer);
	}

	@Override
	public void printQuote() {
		printBorder();
		printer.printQuote();
		printBorder();
	}

	private void printBorder() {
		System.out.println("----------------");
	}

}