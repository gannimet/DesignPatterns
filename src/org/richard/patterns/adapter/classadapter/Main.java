package org.richard.patterns.adapter.classadapter;

import java.awt.Point;

public class Main {

	public static void main(String[] args) {
		IntegerPoint point = new GridPoint(2, 6);
		
		System.out.println(point);
		
		boolean isPoint = point instanceof Point;
		boolean isIntegerPoint = point instanceof IntegerPoint;
		
		/* Wir haben nun java.awt.Point an unser
		 * IntegerPoint-Interface adaptiert */
		System.out.println(isPoint && isIntegerPoint);		// true
	}	
	
}