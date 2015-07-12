package org.richard.patterns.iterator;

import org.richard.patterns.iterator.FruitList.Fruit;

public class Main {

	public static void main(String[] args) {
		FruitList fruitList = new FruitList();
		
		FruitIterator allFruit = fruitList.createAllFruitIterator();
		FruitIterator stoneFruit = fruitList.createStoneFruitIterator();
		
		System.out.println("Alle Früchte:");
		printIteratorItems(allFruit);
		
		System.out.println();
		
		System.out.println("Steinfrüchte:");
		printIteratorItems(stoneFruit);
	}
	
	private static void printIteratorItems(FruitIterator iterator) {
		Fruit fruit;
		/* Die Art und Weise der Traversierung ist dieselbe,
		 * welche Elemente dabei zurückgeliefert und welche
		 * übersprungen werden, ist Sache des konkreten Iterators. */
		while(iterator.hasNext()) {
			fruit = iterator.next();
			System.out.println(fruit.getName());
		}
	}
	
}