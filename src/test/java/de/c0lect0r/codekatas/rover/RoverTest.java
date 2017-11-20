package de.c0lect0r.codekatas.rover;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public class RoverTest {
	Rover rover;
	Coordinates coordinates;

	@Before
	public void before() {
		rover = new RoverImpl();
		coordinates = new Coordinates(1, 1);
	}

	@Test
	public void testRoverLooksNorth() {
		rover.setCurrentDirection(Direction.NORTH);
		Assert.assertEquals(Direction.NORTH, rover.getCurrentDirection());
	}

	@Test
	public void setAndCompareCoordinates() {
		rover.setCoordinates(new Coordinates(1, 1));
		Assert.assertEquals(coordinates, rover.getCurrentCoordinates());
	}

	@Test
	public void moveNorthFor1DistanceCommand() {
		// Given
		MoveCommand moveCommand = new MoveCommandImpl();
		moveCommand.setDirection(Direction.NORTH);
		moveCommand.setDistance(1);
		coordinates = new Coordinates(1, 2);
		rover.setCoordinates(new Coordinates(1, 1));

		// when
		rover.drive(moveCommand);

		// then
		Assert.assertEquals(coordinates, rover.getCurrentCoordinates());
	}

	@Test
	public void moveNorthFor2DistanceCommand() {
		// Given
		MoveCommand moveCommand = new MoveCommandImpl();
		moveCommand.setDirection(Direction.NORTH);
		moveCommand.setDistance(2);
		coordinates = new Coordinates(1, 3);
		rover.setCoordinates(new Coordinates(1, 1));

		// when
		rover.drive(moveCommand);

		// then
		Assert.assertEquals(coordinates, rover.getCurrentCoordinates());
	}

	@Test
	public void moveEastFor2DistanceCommand() {
		// Given
		MoveCommand moveCommand = new MoveCommandImpl();
		moveCommand.setDirection(Direction.EAST);
		moveCommand.setDistance(2);
		coordinates = new Coordinates(3, 1);
		rover.setCoordinates(new Coordinates(1, 1));

		// when
		rover.drive(moveCommand);

		// then
		Assert.assertEquals(coordinates, rover.getCurrentCoordinates());
	}
}
