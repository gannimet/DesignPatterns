package org.richard.patterns.templatemethod;

public class PlainTextListPrinter extends ListPrinter {

	@Override
	protected void printListStart() {}

	@Override
	protected void printListItem(String content) {
		System.out.println("* " + content);
	}

	@Override
	protected void printListEnd() {}

}