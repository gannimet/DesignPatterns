package org.richard.patterns.visitor;

public class Number implements MathExpression {

	private double value;
	
	public Number(double value) {
		this.value = value;
	}

	public double getValue() {
		return value;
	}

	public void setValue(double value) {
		this.value = value;
	}

	@Override
	public double accept(Visitor visitor) {
		return visitor.visit(this);
	}
	
	@Override
	public String toString() {
		return value + "";
	}
	
}