package org.richard.patterns.decorator;

public class ChaplinQuotePrinter implements QuotePrinter {

	@Override
	public void printQuote() {
		System.out.println("Genie ist zu 10% Inspiration und zu 90% Transpiration.");
	}

}