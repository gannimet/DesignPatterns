package org.richard.patterns.visitor;

public class CalculationVisitor extends Visitor {

	@Override
	public double visit(Number number) {
		return number.getValue();
	}

	@Override
	public double visit(Addition addition) {
		return visit(addition.getLeft()) + visit(addition.getRight());
	}

	@Override
	public double visit(Subtraction subtraction) {
		return visit(subtraction.getLeft()) - visit(subtraction.getRight());
	}

	@Override
	public double visit(Multiplication multiplication) {
		return visit(multiplication.getLeft()) * visit(multiplication.getRight());
	}

	@Override
	public double visit(Division division) throws ArithmeticException {
		return visit(division.getLeft()) / visit(division.getRight());
	}

}