package org.richard.patterns.interpreter;

import java.util.Map;

public class Multiplication extends BinaryExpression {

	public Multiplication(Term left, Term right) {
		super(left, right);
	}

	@Override
	public double interpret(Map<Character, Double> variables) {
		return left.interpret(variables) * right.interpret(variables);
	}

}