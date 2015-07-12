package org.richard.patterns.adapter.objectadapter;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class BetterArrayList implements BetterList {

	private List<String> data;
	
	public BetterArrayList() {
		data = new ArrayList<String>();
	}
	
	@Override
	public int size() {
		return data.size();
	}

	@Override
	public boolean add(String string) {
		return data.add(string);
	}

	@Override
	public String get(int index) {
		return data.get(index);
	}

	@Override
	public void sort() {
		Collections.sort(data);
	}

	@Override
	public String toString() {
		return data.toString();
	}

}