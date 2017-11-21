package de.c0lect0r.codekatas.rover;

import java.util.ArrayList;
import java.util.List;

public class MarsWorld implements World {

	private double maxX;
	private double maxY;
	private List<List<Field>> map = new ArrayList<List<Field>>();

	public double getMaxX() {
		return maxX;
	}
	public double getMaxY() {
		return maxY;
	}
	private MarsWorld(){
		
	}
	public void setMaxX(double x) {
		this.maxX = x;
		
	}

	public void setMaxY(double y) {
		this.maxY = y;
		
	}
	
	public static World getInstance(double x, double y){

		World world = new MarsWorld();
		world.setMaxX(x);
		world.setMaxY(y);
		return world;
	}

}
