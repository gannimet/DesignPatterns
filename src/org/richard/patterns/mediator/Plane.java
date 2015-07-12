package org.richard.patterns.mediator;

public final class Plane {

	public enum Type {
		
		GLIDER("Segler"), BOEING("Boeing");
		
		private String name;
		
		Type(String name) {
			this.name = name;
		}
		
		public String getName() {
			return name;
		}
		
	}
	
	private Tower tower;
	private String name;
	private Type type;

	public Plane(String name, Type type, Tower tower) {
		this.name = name;
		this.type = type;
		this.tower = tower;
	}
	
	public String getName() {
		return name;
	}
	
	public Type getType() {
		return type;
	}
	
	public void start() {
		System.out.println(name + " erbittet Starterlaubnis.");
		
		if(tower.requestStartingClearance(this)) {
			System.out.println(name + " hebt ab.");
		} else {
			System.out.println(name + " bleibt am Boden.");
		}
	}
	
	public void land() {
		System.out.println(name + " erbittet Landeerlaubnis.");
		
		if(tower.requestLandingPermission(this)) {
			System.out.println(name + " landet sicher.");
		} else {
			System.out.println(name + " muss in der Luft bleiben.");
		}
	}

	@Override
	public String toString() {
		return name + " (" + type.getName() + ")";
	}
	
}