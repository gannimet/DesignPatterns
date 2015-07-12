package org.richard.patterns.iterator;

import org.richard.patterns.iterator.FruitList.Fruit;

public class AllFruitIterator implements FruitIterator {

	private FruitList fruitList;
	private int nextPointer = 0;
	
	public AllFruitIterator(FruitList fruitList) {
		this.fruitList = fruitList;
	}
	
	@Override
	public Fruit next() {
		if(!hasNext())
			return null;
		
		return fruitList.getElement(nextPointer++);
	}

	@Override
	public boolean hasNext() {
		return nextPointer < fruitList.length();
	}

	@Override
	public void reset() {
		nextPointer = 0;
	}

}