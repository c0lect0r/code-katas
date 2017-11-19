package de.c0lect0r.codekatas.rover;

public interface Move {

	Direction getDirection();

	void setDirection(Direction direction);

	void setDistance(double i);
	
	double getDistance();

}