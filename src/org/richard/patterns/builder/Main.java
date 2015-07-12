package org.richard.patterns.builder;

public class Main {

	public static void main(String[] args) {
		ListDirector director;
		
		/* Wir programmieren die Builder-Objekte NICHT gegen
		 * ein gemeinsames Interface, da diese sich in der Praxis
		 * durchaus stark unterscheiden können. */
		PlainTextListBuilder plainBuilder =
			new PlainTextListBuilder();
		director = new ListDirector(plainBuilder);
		
		director.construct();
		System.out.println(plainBuilder.getPlainTextList());	// Liste als Plain Text
		
		HTMLListBuilder htmlBuilder =
			new HTMLListBuilder();
		director = new ListDirector(htmlBuilder);
		
		director.construct();
		System.out.println(htmlBuilder.getHTMLList());			// Liste als HTML
	}
	
}