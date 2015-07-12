package org.richard.patterns.adapter.objectadapter;

public interface BetterList {

	public int size();
	
	public boolean add(String string);
	
	public String get(int index);
	
	public void sort();

}