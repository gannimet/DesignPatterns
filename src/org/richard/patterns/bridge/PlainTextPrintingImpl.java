package org.richard.patterns.bridge;

public class PlainTextPrintingImpl implements PrintingImpl {

	@Override
	public void print(String what) {
		System.out.println(what);
	}

}