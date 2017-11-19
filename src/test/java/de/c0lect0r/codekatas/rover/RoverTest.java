package de.c0lect0r.codekatas.rover;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public class RoverTest {
	Rover rover;
	Coordinates coordinates;
	
	@Before
	public void before(){
		rover = new RoverImpl();
		coordinates = new Coordinates(1, 1);
	}

	
	@Test
	public void testRoverLooksNorth(){
		rover.setDirection(Direction.NORTH);
		Assert.assertEquals(Direction.NORTH, rover.getCurrentDirection());
	}

	@Test
	public void setAndCompareCoordinates(){
		rover.setCoordinates(new Coordinates(1, 1));
		Assert.assertEquals(coordinates, rover.getCurrentCoordinates());
	}
	
	@Test
	public void moveNorthFor1DistanceCommand(){
		//Given
		Move move = new MoveForward();
		move.setDirection(Direction.NORTH);
		move.setDistance(1);
		coordinates = new Coordinates(1, 2);
		rover.setCoordinates(new Coordinates(1, 1));
		
		//when
		rover.drive(move);
		
		//then
		Assert.assertEquals(coordinates, rover.getCurrentCoordinates());
	}
	
	@Test
	public void moveNorthFor2DistanceCommand(){
		//Given
		Move move = new MoveForward();
		move.setDirection(Direction.NORTH);
		move.setDistance(2);
		coordinates = new Coordinates(1, 3);
		rover.setCoordinates(new Coordinates(1, 1));
		
		//when
		rover.drive(move);
		
		//then
		Assert.assertEquals(coordinates, rover.getCurrentCoordinates());
	}
	
	@Test
	public void moveEastFor2DistanceCommand(){
		//Given
		Move move = new MoveForward();
		move.setDirection(Direction.EAST);
		move.setDistance(2);
		coordinates = new Coordinates(3, 1);
		rover.setCoordinates(new Coordinates(1, 1));
		
		//when
		rover.drive(move);
		
		//then
		Assert.assertEquals(coordinates, rover.getCurrentCoordinates());
	}
}
