package org.richard.patterns.interpreter;

import java.util.HashMap;
import java.util.Map;

public class Main {

	public static void main(String[] args) {
		Map<Character, Double> variables = new HashMap<Character, Double>();
		variables.put('a', 3.0);
		variables.put('b', -1.5);
		variables.put('c', 2.0);
		
		// Wir modellieren den Term a * a + b / c
		Variable a = new Variable('a');
		Variable b = new Variable('b');
		Variable c = new Variable('c');
		Multiplication aTimesA = new Multiplication(a, a);
		Division bByC = new Division(b, c);
		Addition whole = new Addition(aTimesA, bByC);
		
		// 3 * 3 + (-1.5) / 2 = 8.25
		System.out.println("Wert des Terms mit dieser Variablenbelegung: " +
			whole.interpret(variables));
	}
	
}