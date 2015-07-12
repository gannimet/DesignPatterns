package org.richard.patterns.visitor;

public class Multiplication implements MathExpression {

	private MathExpression left;
	private MathExpression right;
	
	public Multiplication(MathExpression left, MathExpression right) {
		this.left = left;
		this.right = right;
	}

	public MathExpression getLeft() {
		return left;
	}

	public void setLeft(MathExpression left) {
		this.left = left;
	}

	public MathExpression getRight() {
		return right;
	}

	public void setRight(MathExpression right) {
		this.right = right;
	}

	@Override
	public double accept(Visitor visitor) {
		return visitor.visit(this);
	}

	@Override
	public String toString() {
		return left + "*" + right;
	}

}