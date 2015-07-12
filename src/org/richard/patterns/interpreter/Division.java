package org.richard.patterns.interpreter;

import java.util.Map;

public class Division extends BinaryExpression {

	public Division(Term left, Term right) {
		super(left, right);
	}

	@Override
	public double interpret(Map<Character, Double> variables) {
		double rightResult = right.interpret(variables);
		
		if(rightResult == 0)
			throw new ArithmeticException();
		
		return left.interpret(variables) / rightResult;
	}

}