package de.c0lect0r.codekatas.rover;

public class RoverImpl implements Rover {

	private Direction currentDirection;
	private Coordinates coordinates;
	private Move move;

	public Direction getCurrentDirection() {
		return currentDirection;
	}

	public void setDirection(Direction direction) {
		this.currentDirection = direction;

	}

	public Coordinates getCurrentCoordinates() {
		return coordinates;
	}

	public void setCoordinates(Coordinates coordinates) {
		this.coordinates = coordinates;

	}

	public void drive(Move move) {
		this.move = move;
	}

}
