package org.richard.patterns.composite;

import java.text.DecimalFormat;

public class Main {

	public static void main(String[] args) {
		// Zuerst werden alle nötigen Einträge erzeugt
		File f1 = new File("A.txt", 248.2);
		File f2 = new File("B.txt", 9471.5);
		File f3 = new File("C.txt", 12.0);
		File f4 = new File("D.txt", 128.6);
		
		Directory d1 = new Directory("E");
		Directory d2 = new Directory("F");
		Directory d3 = new Directory("G");
		Directory d4 = new Directory("H");
		
		// Nun werden sie zu einer Baumstruktur zusammengestellt
		d4.addEntry(f3);
		d4.addEntry(f4);
		
		d2.addEntry(f2);
		d2.addEntry(d3);
		d2.addEntry(d4);
		
		d1.addEntry(f1);
		d1.addEntry(d2);
		
		// Zum Schluss geben wir die Größen der Verzeichnisse aus
		printEntryInfo(d1);
		printEntryInfo(d2);
		printEntryInfo(d3);
		printEntryInfo(d4);
	}
	
	private static void printEntryInfo(FileSystemEntry entry) {
		DecimalFormat df = new DecimalFormat("#.##");
		System.out.println(entry.getName() + " hat eine Größe von " +
			df.format(entry.size()));
	}

}