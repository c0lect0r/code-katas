package de.c0lect0r.codekatas.rover;

public interface World {

	void setMaxX(double i);

	void setMaxY(double i);
	
	public double getMaxX();
	
	public double getMaxY();

	public void initiateWorld();

	public Field getFieldXY(double d, double e);
}
