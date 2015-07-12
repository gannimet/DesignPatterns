package org.richard.patterns.visitor;

public class Main {

	public static void main(String[] args) {
		Number three = new Number(3);
		Number minusSeven = new Number(-7);
		Number ten = new Number(10);
		
		Addition add = new Addition(minusSeven, ten);
		Multiplication mult = new Multiplication(three, add);
		
		Visitor visitor = new CalculationVisitor();
		/* Der Visitor besucht jeden Knoten des Baumes
		 * und sammelt die berechneten Werte ein. */
		double result = mult.accept(visitor);
		
		// Theoretisch wäre auch folgender Aufruf möglich:
		//double result = visitor.visit(mult);
		
		System.out.println(mult + " = " + result);
	}
	
}