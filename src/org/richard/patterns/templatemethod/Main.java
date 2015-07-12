package org.richard.patterns.templatemethod;

public class Main {

	public static void main(String[] args) {
		ListPrinter printer;
		
		/* Das ListPrinter-Objekt wird wie gewöhnlich polymorph
		 * benutzt. Dass die grobe Struktur des Algorithmus bereits
		 * in der abstrakten Oberklasse definiert wurde und für alle
		 * ListPrinter ähnlich aussieht, bleibt den Client-Klassen
		 * verborgen. */
		printer = new PlainTextListPrinter();
		printer.printList();
		
		printer = new HTMLListPrinter();
		printer.printList();
	}
	
}