package org.richard.patterns.adapter.classadapter;

import java.awt.Point;

public class GridPoint extends Point implements IntegerPoint {

	private static final long serialVersionUID = -1525640429195946843L;
	
	public GridPoint(int x, int y) {
		setXCoord(x);
		setYCoord(y);
	}

	@Override
	public void setXCoord(int x) {
		this.x = x;
	}

	@Override
	public void setYCoord(int y) {
		this.y = y;
	}

	@Override
	public int getXCoord() {
		return (int) getX();
	}

	@Override
	public int getYCoord() {
		return (int) getY();
	}

	@Override
	public String toString() {
		return "(" + getXCoord() + ", " + getYCoord() + ")";
	}

}