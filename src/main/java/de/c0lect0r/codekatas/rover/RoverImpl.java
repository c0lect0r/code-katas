package de.c0lect0r.codekatas.rover;

public class RoverImpl implements Rover {

	private Direction currentDirection;
	private Coordinates coordinates;
	private Move move;
	

	public Direction getCurrentDirection() {
		return currentDirection;
	}

	public void setDirection(Direction direction) {
		this.currentDirection = direction;

	}

	public Coordinates getCurrentCoordinates() {
		return coordinates;
	}

	public void setCoordinates(Coordinates coordinates) {
		this.coordinates = coordinates;

	}

	public void drive(Move move) {
		this.move = move;
		
		if(isTurnCommand(move.getDirection())){
			turnRoverToDirection(move.getDirection());
		}
		
		if(move.getDistance() > 0){
			switch (currentDirection) {
			case NORTH:
				driveToNorthDirectionForDistance(move.getDistance());
				break;
			case WEST:
				driveToNorthDirectionForDistance(move.getDistance());
			default:
				break;
			}
		}
	}

	private void driveToNorthDirectionForDistance(double distance) {
		double newX = this.getCurrentCoordinates().x();
		double newy = this.getCurrentCoordinates().y()+1;
		Coordinates coordinates = new Coordinates(newX, newy);
		this.setCoordinates(coordinates);
	}

	private void turnRoverToDirection(Direction direction) {
		currentDirection = direction;
	}

	private boolean isTurnCommand(Direction direction) {
		return currentDirection != direction;
	}

}
