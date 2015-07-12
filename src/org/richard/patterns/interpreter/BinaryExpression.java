package org.richard.patterns.interpreter;

import java.util.Map;

public abstract class BinaryExpression implements Term {

	protected Term left;
	protected Term right;
	
	public BinaryExpression(Term left, Term right) {
		this.left = left;
		this.right = right;
	}

	@Override
	public abstract double interpret(Map<Character, Double> variables);

}