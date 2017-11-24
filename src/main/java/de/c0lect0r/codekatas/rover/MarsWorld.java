package de.c0lect0r.codekatas.rover;

import java.util.ArrayList;
import java.util.List;

public class MarsWorld implements World {

	private double maxX;
	private double maxY;
	private List<List<Field>> surfaceMap = new ArrayList<List<Field>>();

	public double getMaxX() {
		return maxX;
	}

	public double getMaxY() {
		return maxY;
	}

	private MarsWorld() {

	}

	public void setMaxX(double x) {
		this.maxX = x;

	}

	public void setMaxY(double y) {
		this.maxY = y;

	}

	public static World getInstance(double x, double y) {

		World world = new MarsWorld();
		world.setMaxX(x);
		world.setMaxY(y);
		world.initiateWorld();
		return world;
	}

	public void initiateWorld() {
		for (int y = 0; y < maxY; y++) {
			List<Field> oneLine = new ArrayList<Field>();
			for (int x = 0; x < maxX; x++) {
				Field field = new MarsField();
				Coordinates coordinates = new Coordinates(x+1d, y+1d);
				field.setCoordinates(coordinates);
				oneLine.add(field);
			}
			surfaceMap.add(oneLine);
		}
	}

	public List<List<Field>> getSurfaceMap() {
		return surfaceMap;
	}

	@Override
	public String toString() {
		return "MarsWorld [maxX=" + maxX + ", maxY=" + maxY + ", map=" + surfaceMap + "]";
	}

	public Field getFieldXY(double x, double y) {
		List<Field> oneLine= surfaceMap.get((int) y-1);
		return oneLine.get((int) x-1);
		
	}
	
}
