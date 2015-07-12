package org.richard.patterns.command;

import java.util.Set;

public class AddCommand extends Command {

	public AddCommand(Set<String> set, String argument) {
		super(set, argument);
	}

	@Override
	public void execute() {
		set.add(argument);
	}

	@Override
	public void undo() {
		set.remove(argument);
	}

}