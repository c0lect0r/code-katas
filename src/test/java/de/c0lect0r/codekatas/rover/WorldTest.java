package de.c0lect0r.codekatas.rover;
import org.junit.Assert;
import org.junit.Test;



public class WorldTest {

	@Test
	public void testCorrectSize() {
		World world = MarsWorld.getInstance(10d, 10d);
		Assert.assertEquals(10d, world.getMaxX(),0d);
		Assert.assertEquals(10d, world.getMaxY(),0d);
	}

	@Test
	public void isWorldCorrectlyInitiatedWith1Field(){
		World world = MarsWorld.getInstance(1, 1);
		world.getFieldXY(1,1);
	}
}
