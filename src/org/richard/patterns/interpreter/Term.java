package org.richard.patterns.interpreter;

import java.util.Map;

public interface Term {

	public double interpret(Map<Character, Double> variables);
	
}