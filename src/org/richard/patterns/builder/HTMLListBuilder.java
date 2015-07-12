package org.richard.patterns.builder;

public class HTMLListBuilder extends ListBuilder {

	private String data = "";
	
	@Override
	public void buildListStart() {
		data += "<ul>\n";
	}

	@Override
	public void buildListItem(String content) {
		data += "\t<li>" + content + "</li>\n";
	}

	@Override
	public void buildListEnd() {
		data += "</ul>\n";
	}

	public String getHTMLList() {
		return data;
	}

}