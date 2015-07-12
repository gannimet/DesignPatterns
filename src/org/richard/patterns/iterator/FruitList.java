package org.richard.patterns.iterator;

public class FruitList {

	public enum Fruit {
		
		CHERRY("Kirsche", true), PLUM("Pflaume", true), ORANGE("Orange", false),
		BANANA("Banane", false), PEACH("Pfirsich", true), APPLE("Apfel", false);
		
		private String name;
		private boolean stoneFruit;
		
		Fruit(String name, boolean stoneFruit) {
			this.name = name;
			this.stoneFruit = stoneFruit;
		}
		
		public String getName() {
			return name;
		}
		
		public boolean isStoneFruit() {
			return stoneFruit;
		}
		
	}
	
	private Fruit[] fruit = new Fruit[] {
		Fruit.CHERRY, Fruit.PLUM, Fruit.ORANGE,
		Fruit.BANANA, Fruit.PEACH, Fruit.APPLE
	};
	
	public Fruit getElement(int index) {
		return fruit[index];
	}
	
	public int length() {
		return fruit.length;
	}
	
	public AllFruitIterator createAllFruitIterator() {
		return new AllFruitIterator(this);
	}
	
	public StoneFruitIterator createStoneFruitIterator() {
		return new StoneFruitIterator(this);
	}
	
}