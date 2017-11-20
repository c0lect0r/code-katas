package de.c0lect0r.codekatas.rover;

import org.springframework.beans.factory.annotation.Autowired;

public class NavigatorImpl implements Navigator {
	@Autowired
	private Rover rover;

	public NavigatorImpl(Rover rover) {
		this.rover = rover;
	}

	/* (non-Javadoc)
	 * @see de.c0lect0r.codekatas.rover.Navigator#drive(de.c0lect0r.codekatas.rover.MoveCommand)
	 */
	public void drive(MoveCommand moveCommand) {
		
		if (isTurnCommand(moveCommand.getDirection())) {
			turnRoverToDirection(moveCommand.getDirection());
		}
		moveToDirectionGivenAtMoveCommand(moveCommand);
	}

	private boolean isTurnCommand(Direction direction) {
		return !rover.getCurrentDirection().equals(direction);
	}

	private void moveToDirectionGivenAtMoveCommand(MoveCommand moveCommand) {
		if (moveCommand.getDistance() > 0) {
			switch (rover.getCurrentDirection()) {
			case NORTH:
				driveToNorthDirectionForDistance(moveCommand.getDistance());
				break;
			case WEST:
				driveToNorthDirectionForDistance(moveCommand.getDistance());
				break;
			case EAST:
				driveToEastDirectionForDistance(moveCommand.getDistance());
				break;
			case SOUTH:
				driveToSouthDirectionForDistance(moveCommand.getDistance());
				break;
			default:
				break;
			}
		}
	}

	private void turnRoverToDirection(Direction direction) {
		rover.setCurrentDirection(direction);
	}

	private void driveToSouthDirectionForDistance(double distance) {
		double newX = rover.getCurrentCoordinates().x();
		double newy = rover.getCurrentCoordinates().y() - distance;
		Coordinates coordinates = new Coordinates(newX, newy);
		rover.setCoordinates(coordinates);

	}

	private void driveToNorthDirectionForDistance(double distance) {
		double newX = rover.getCurrentCoordinates().x();
		double newy = rover.getCurrentCoordinates().y() + distance;
		Coordinates coordinates = new Coordinates(newX, newy);
		rover.setCoordinates(coordinates);
	}

	private void driveToEastDirectionForDistance(double distance) {
		double newX = rover.getCurrentCoordinates().x() + distance;
		double newy = rover.getCurrentCoordinates().y();
		Coordinates coordinates = new Coordinates(newX, newy);
		rover.setCoordinates(coordinates);
	}
}
