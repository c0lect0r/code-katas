package de.c0lect0r.codekatas.rover;

public class MoveForward implements Move {

	Enum<Direction> direction;
	private double distance;

	public Enum<Direction> getDirection() {
		return direction;
	}

	public void setDirection(Enum<Direction> direction) {
		this.direction = direction;
	}

	public void setDistance(double d) {
		this.distance = d;
		
	}
	
	
}
