package org.richard.patterns.bridge;

public class HTMLPrintingImpl implements PrintingImpl {

	@Override
	public void print(String what) {
		System.out.println("<p>\n\t<em>" + what + "</em>\n</p>");
	}

}