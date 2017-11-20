package de.c0lect0r.codekatas.rover;

public interface Rover {

	Direction getCurrentDirection();
	
	void setCurrentDirection(Direction direction);

	Coordinates getCurrentCoordinates();

	void setCoordinates(Coordinates coordinates);

}