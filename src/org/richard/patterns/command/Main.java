package org.richard.patterns.command;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
import java.util.Stack;

public class Main {

	private static Set<String> receiver = new HashSet<String>();
	private static Stack<Command> history = new Stack<Command>();
	
	private static List<Command> createCommandQueue() {
		List<Command> queue = new ArrayList<Command>();
		queue.add(new AddCommand(receiver, "Banane"));
		queue.add(new AddCommand(receiver, "Apfel"));
		queue.add(new AddCommand(receiver, "Pfirsich"));
		queue.add(new RemoveCommand(receiver, "Apfel"));
		return queue;
	}
	
	public static void main(String[] args) {
		List<Command> queue = createCommandQueue();
		
		Command command;
		for(Iterator<Command> iter = queue.iterator(); iter.hasNext();) {
			command = iter.next();
			// auszuführenden Command auf den History-Stack legen
			history.push(command);
			// Command ausführen
			command.execute();
		}
		
		// Zwischenstand ausgeben
		System.out.println("Vor dem Undo: " + receiver);
		
		// Den letzten Befehl rückgängig machen
		Command lastCommand = history.pop();
		lastCommand.undo();
		
		// Stand nach dem Undo ausgeben
		System.out.println("Nach dem Undo: " + receiver);
	}
	
}