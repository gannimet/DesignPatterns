package org.roleobject;

import java.util.HashMap;
import java.util.Map;

public class PersonCore implements Person {

	private Map<String, PersonRole> roles;
	private String name;
	
	public PersonCore(String name) {
		roles = new HashMap<String, PersonRole>();
		this.name = name;
	}
	
	@Override
	public void prepare() {
		System.out.println("Ich bin eher so der faule Typ.");
	}

	@Override
	public void speak() {
		System.out.println("Ich bin mehr so der ruhige Typ.");
	}
	
	@Override
	public String getName() {
		return name;
	}

	@Override
	public boolean addRole(String roleDescription) {
		if(hasRole(roleDescription))
			return false;
		
		if("TUTOR".equals(roleDescription)) {
			roles.put(roleDescription, new TutorRole());
			return true;
		}
		if("STUDENT".equals(roleDescription)) {
			roles.put(roleDescription, new StudentRole());
			return true;
		}
		
		throw new IllegalArgumentException("Die Rolle " + roleDescription +
			" existiert nicht.");
	}

	@Override
	public boolean hasRole(String roleDescription) {
		return roles.containsKey(roleDescription);
	}

	@Override
	public PersonRole getRole(String roleDescription) {
		if(!hasRole(roleDescription))
			throw new IllegalArgumentException("Rolle gibt es nicht!");
		return roles.get(roleDescription);
	}

	@Override
	public boolean removeRole(String roleDescription) {
		if(!hasRole(roleDescription))
			return false;
		
		roles.remove(roleDescription);
		return true;
	}

}