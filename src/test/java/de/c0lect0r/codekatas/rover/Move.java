package de.c0lect0r.codekatas.rover;

public interface Move {

	Enum<Direction> getDirection();

	void setDirection(Enum<Direction> direction);

	void setDistance(double i);
	

}