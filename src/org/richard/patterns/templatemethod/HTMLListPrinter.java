package org.richard.patterns.templatemethod;

public class HTMLListPrinter extends ListPrinter {

	@Override
	protected void printListStart() {
		System.out.println("<ul>");
	}

	@Override
	protected void printListItem(String content) {
		System.out.println("\t<li>" + content + "</li>");
	}

	@Override
	protected void printListEnd() {
		System.out.println("</ul>");
	}

}