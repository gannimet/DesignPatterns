package org.roleobject;

public interface Person {

	public void prepare();
	
	public void speak();
	
	public String getName();
	
	public boolean addRole(String roleDescription);
	
	public boolean hasRole(String roleDescription);
	
	public PersonRole getRole(String roleDescription);
	
	public boolean removeRole(String roleDescription);
	
}