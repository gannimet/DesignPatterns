package org.richard.patterns.command;

import java.util.Set;

public abstract class Command {

	protected Set<String> set;
	protected String argument;
	
	public Command(Set<String> list, String argument) {
		this.set = list;
		this.argument = argument;
	}
	
	public abstract void execute();
	
	public abstract void undo();
	
}