package org.roleobject;

public abstract class PersonRole implements Person {

	protected PersonCore core;
	
	@Override
	public void prepare() {
		core.prepare();
	}

	@Override
	public void speak() {
		core.speak();
	}
	
	@Override
	public String getName() {
		return core.getName();
	}

	@Override
	public boolean addRole(String roleDescription) {
		return core.addRole(roleDescription);
	}

	@Override
	public boolean hasRole(String roleDescription) {
		return core.hasRole(roleDescription);
	}

	@Override
	public PersonRole getRole(String roleDescription) {
		return core.getRole(roleDescription);
	}

	@Override
	public boolean removeRole(String roleDescription) {
		return core.removeRole(roleDescription);
	}

}