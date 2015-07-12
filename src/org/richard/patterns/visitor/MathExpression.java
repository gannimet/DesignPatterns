package org.richard.patterns.visitor;

public interface MathExpression {
	
	public double accept(Visitor visitor);

}