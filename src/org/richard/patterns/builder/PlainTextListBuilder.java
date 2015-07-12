package org.richard.patterns.builder;

public class PlainTextListBuilder extends ListBuilder {

	private String data = "";
	
	@Override
	public void buildListItem(String content) {
		data += "* " + content + "\n";
	}

	public String getPlainTextList() {
		return data;
	}

}