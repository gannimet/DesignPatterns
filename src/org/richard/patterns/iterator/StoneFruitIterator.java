package org.richard.patterns.iterator;

import org.richard.patterns.iterator.FruitList.Fruit;

public class StoneFruitIterator implements FruitIterator {

	private FruitList fruitList;
	private int nextPointer = 0;
	
	public StoneFruitIterator(FruitList fruitList) {
		this.fruitList = fruitList;
	}
	
	@Override
	public Fruit next() {
		if(!hasNext())
			return null;
		
		Fruit next = fruitList.getElement(nextPointer++);
		while(!next.isStoneFruit()) {
			next = fruitList.getElement(nextPointer++);
		}
		
		return next;
	}

	@Override
	public boolean hasNext() {
		boolean hasNext = false;
		for(int i = nextPointer; i < fruitList.length(); i++) {
			if(fruitList.getElement(i).isStoneFruit())
				hasNext = true;
		}
		
		return hasNext;
	}

	@Override
	public void reset() {
		nextPointer = 0;
	}

}