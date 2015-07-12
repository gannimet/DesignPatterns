package org.richard.patterns.decorator;

public class Main {

	public static void main(String[] args) {
		QuotePrinter printer;
		
		printer = new ChaplinQuotePrinter();
		printer.printQuote();
		
		/* Der printer wird jetzt mit zusätzlichen Funktionalitäten
		 * dekoriert. Dies ist problemlos möglich, da alle Decorator
		 * auch das QuotePrinter-Interface implementieren. */
		printer = new HTMLQuotePrinterDecorator(printer);
		printer.printQuote();
		
		printer = new BorderQuotePrinterDecorator(printer);
		printer.printQuote();
	}
	
}