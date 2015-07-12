package org.richard.patterns.interpreter;

import java.util.Map;

public class Variable implements Term {

	private char name;
	
	public Variable(char name) {
		this.name = name;
	}

	@Override
	public double interpret(Map<Character, Double> variables) {
		if(!variables.containsKey(name))
			throw new IllegalStateException();
		
		return variables.get(name);
	}

}