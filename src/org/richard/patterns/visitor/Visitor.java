package org.richard.patterns.visitor;

public abstract class Visitor {

	public abstract double visit(Number number);
	
	public abstract double visit(Addition addition);
	
	public abstract double visit(Subtraction subtraction);
	
	public abstract double visit(Multiplication multiplication);
	
	public abstract double visit(Division division);
	
	public double visit(MathExpression expression) {
		// Damit in den Unterklassen beim rekursiven Aufruf
		// kein Compilerfehler auftritt, müssen wir den
		// Aufruf hier explizit delegieren
		if (expression instanceof Number) {
			return visit((Number) expression);
		}
		
		if (expression instanceof Addition) {
			return visit((Addition) expression);
		}
		
		if (expression instanceof Subtraction) {
			return visit((Subtraction) expression);
		}
		
		if (expression instanceof Multiplication) {
			return visit((Multiplication) expression);
		}
		
		if (expression instanceof Division) {
			return visit((Division) expression);
		}
		
		throw new IllegalStateException();
	}
	
}