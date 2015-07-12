package org.richard.patterns.command;

import java.util.Set;

public class RemoveCommand extends Command {

	public RemoveCommand(Set<String> set, String argument) {
		super(set, argument);
	}

	@Override
	public void execute() {
		set.remove(argument);
	}

	@Override
	public void undo() {
		set.add(argument);
	}

}