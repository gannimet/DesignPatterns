package org.richard.patterns.iterator;

import org.richard.patterns.iterator.FruitList.Fruit;

public interface FruitIterator {

	public Fruit next();
	
	public boolean hasNext();
	
	public void reset();
	
}