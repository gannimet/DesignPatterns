package org.richard.patterns.composite;

public class File implements FileSystemEntry {

	private String name;
	private double size;
	
	public File(String name, double size) {
		this.name = name;
		this.size = size;
	}

	@Override
	public String getName() {
		return name;
	}
	
	@Override
	public double size() {
		return size;
	}

}