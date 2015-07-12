package org.richard.patterns.facade;

public class Wheel {

	public enum Side {
		
		LEFT("links"), RIGHT("rechts");
		
		private String value;
		
		private Side(String value) {
			this.value = value;
		}
		
		public String getValue() {
			return value;
		}
		
	}
	
	public enum Axis {
		
		FRONT("vorne"), REAR("hinten");
		
		private String value;
		
		private Axis(String value) {
			this.value = value;
		}
		
		public String getValue() {
			return value;
		}
		
	}
	
	private Side side;
	private Axis axis;
	
	public Wheel(Side side, Axis axis) {
		this.side = side;
		this.axis = axis;
	}
	
	public void startRolling() {
		System.out.println("Rad " + axis.getValue() + " " + side.getValue() + " rollt.");
	}
	
	public void stopRolling() {
		System.out.println("Rad " + axis.getValue() + " " + side.getValue() + " rollt nicht mehr.");
	}
	
}