package de.c0lect0r.codekatas.rover;

public class MoveForward implements Move {

	Direction direction;
	private double distance;

	public Direction getDirection() {
		return direction;
	}

	public void setDirection(Direction direction) {
		this.direction = direction;
	}

	public void setDistance(double d) {
		this.distance = d;
	}

	public double getDistance() {
		return this.distance;
	}
	
	
}
