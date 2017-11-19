package de.c0lect0r.codekatas.rover;

import org.junit.Assert;
import org.junit.Test;

public class RoverTest {

	@Test
	public void testRover() {
		//fail("Not yet implemented");
		Rover rover = new Rover();
	}
	@Test
	public void testRoverLooksNorth(){
		Rover rover = new Rover();
		rover.setDirection(Direction.NORTH);
		Assert.assertEquals(Direction.NORTH, rover.getCurrentDirection());
	}
}
