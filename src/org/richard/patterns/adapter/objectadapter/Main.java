package org.richard.patterns.adapter.objectadapter;

public class Main {

	public static void main(String[] args) {
		BetterList list = new BetterArrayList();
		
		list.add("Orange");
		list.add("Apfel");
		list.add("Banane");
		list.add("Birne");
		
		System.out.println(list);
		
		/* Wir können jetzt die sort-Methode direkt auf
		 * unserer besseren Liste aufrufen */
		list.sort();
		
		System.out.println(list);
	}
	
}