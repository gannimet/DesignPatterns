package org.richard.patterns.facade;

import org.richard.patterns.facade.Wheel.Axis;
import org.richard.patterns.facade.Wheel.Side;

public class Car {

	private Wheel[] wheels;
	private Engine engine;
	private Gearbox gearbox;
	
	public Car() {
		wheels = new Wheel[] {
			new Wheel(Side.LEFT, Axis.FRONT),
			new Wheel(Side.RIGHT, Axis.FRONT),
			new Wheel(Side.LEFT, Axis.REAR),
			new Wheel(Side.RIGHT, Axis.REAR)
		};
		engine = new Engine();
		gearbox = new Gearbox();
	}
	
	public void driveAutonomously() {
		engine.start();
		for(Wheel wheel : wheels) {
			wheel.startRolling();
		}
		gearbox.shiftUp();
		gearbox.shiftUp();
		gearbox.shiftUp();
		gearbox.shiftUp();
		gearbox.shiftDown();
		gearbox.shiftDown();
		for(Wheel wheel : wheels) {
			wheel.stopRolling();
		}
		engine.stop();
	}
	
}