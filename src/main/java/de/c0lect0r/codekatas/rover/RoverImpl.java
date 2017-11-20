package de.c0lect0r.codekatas.rover;

import org.springframework.beans.factory.annotation.Autowired;

public class RoverImpl implements Rover {

	private Direction currentDirection = Direction.NORTH;
	private Coordinates coordinates = new Coordinates(0, 0);
	private Navigator navigator = new NavigatorImpl(this);

	
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

	public void setNavigator(Navigator navigator) {
		this.navigator = navigator;
		
	}

	public void drive(MoveCommand moveCommand) {
		this.navigator.drive(moveCommand);
	}
}
