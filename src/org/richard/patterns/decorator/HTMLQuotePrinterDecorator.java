package org.richard.patterns.decorator;

public class HTMLQuotePrinterDecorator extends QuotePrinterDecorator {

	public HTMLQuotePrinterDecorator(QuotePrinter printer) {
		super(printer);
	}

	@Override
	public void printQuote() {
		System.out.print("<p>\n\t");
		printer.printQuote();
		System.out.println("</p>");
	}

}