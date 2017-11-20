package de.c0lect0r.codekatas.rover;

public class RoverImpl implements Rover {

	private Direction currentDirection = Direction.NORTH;
	private Coordinates coordinates = new Coordinates(0, 0);

	public Direction getCurrentDirection() {
		return currentDirection;
	}

	public void setCurrentDirection(Direction direction) {
		this.currentDirection = direction;
	}

	public Coordinates getCurrentCoordinates() {
		return coordinates;
	}

	public void setCoordinates(Coordinates coordinates) {
		this.coordinates = coordinates;

	}

}
