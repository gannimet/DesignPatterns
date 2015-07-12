package org.richard.patterns.composite;

import java.util.ArrayList;
import java.util.List;

public class Directory implements FileSystemEntry {

	private String name;
	private List<FileSystemEntry> entries;
	
	public Directory(String name) {
		entries = new ArrayList<FileSystemEntry>();
		this.name = name;
	}

	public void addEntry(FileSystemEntry entry) {
		entries.add(entry);
	}
	
	public void removeEntry(FileSystemEntry entry) {
		entries.remove(entry);
	}
	
	@Override
	public String getName() {
		return name;
	}

	@Override
	public double size() {
		double size = 0.0;
		for(FileSystemEntry entry : entries) {
			size += entry.size();
		}
		return size;
	}

}